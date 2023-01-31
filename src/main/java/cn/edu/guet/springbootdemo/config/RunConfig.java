package cn.edu.guet.springbootdemo.config;

/**
 * @Author 李冰冰
 * @Date 2023/01/19
 * @Version 17.0.5
 *
 * springboot启动自动打开浏览器
 */


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunConfig implements CommandLineRunner {

    @Value("${openProject.isOpen}")
    private boolean isOpen;

    @Value("${openProject.web.openUrl}")
    private String openUrl;

    @Value("${openProject.cmd}")
    private String cmd;

    @Override
    public void run(String... args){
        if(isOpen){
            String runCmd = cmd + " " + openUrl ;
//            System.out.println("运行的命令: " + runCmd);
            Runtime run = Runtime.getRuntime();
            try {
                run.exec(runCmd);
                System.out.println("启动浏览器打开项目成功");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("启动项目自动打开浏览器失败");
            }
        }
    }
}
