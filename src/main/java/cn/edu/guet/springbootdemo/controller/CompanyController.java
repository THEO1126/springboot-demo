package cn.edu.guet.springbootdemo.controller;

import cn.edu.guet.springbootdemo.bean.Company;
import cn.edu.guet.springbootdemo.bean.Result;
import cn.edu.guet.springbootdemo.bean.User;
import cn.edu.guet.springbootdemo.mapper.CompanyMapper;
import cn.edu.guet.springbootdemo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 李冰冰
 * @Date 2023/02/12
 * @Version 17.0.5
 */

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/getAllCompany")
    public Result getAllCommpany() {
        List<Company> companyList = companyService.getAllCompany();
        if (companyList != null){
            return new Result(200,"公司查询成功", companyList);
        }else {
            return new Result(201,"公司查询失败", null);
        }
    }

    @RequestMapping("/insertCompany")
    public Result addCommpany(@RequestBody Company company) {
        try {
            companyService.addCompany(company);
            return new Result(200,"增加公司成功", null);
        } catch (Exception e){
            e.printStackTrace();
            return new Result(201,"增加公司失败", null);
        }
    }

    @RequestMapping("/updateCompany")
    public Result updateCommpany(@RequestBody Company company) {
        try {
            companyService.updateCompany(company);
            return new Result(200,"更新公司成功", null);
        } catch (Exception e){
            e.printStackTrace();
            return new Result(201,"更新公司失败", null);
        }
    }

    @RequestMapping("/deleteCommpanyById")
    public Result deleteCommpanyById(int id) {
        try {
            companyService.deleteCompanyById(id);
            return new Result(200,"删除公司成功", null);
        } catch (Exception e){
            return new Result(201,"删除公司失败", null);
        }
    }
    @RequestMapping("/getCompanyListByPage")
    public Result getCompanyListByPage(int currentPage, int pageSize){
        int fromIndex=(currentPage-1)*pageSize;
        List<Company> companyListByPage=companyService.getCompanyListByPage(fromIndex,pageSize);
        if (companyListByPage!=null) {
            return new Result(200, "成功", companyListByPage);
        }else{
            return new Result(201,"失败",null);
        }
    }


    @GetMapping("/getCompanyListTotalPage")
    public Result getCompanyListTotalPage() {
        int companyListTotalPage=companyService.getCompanyListTotalPage();
        return new Result(200, "成功", companyListTotalPage);
    }

    @GetMapping("/searchCompanyListTotalPage")
    public Result searchCompanyListTotalPage(String name) {
        int companyListTotalPage= companyService.searchCompanyListTotalPage(name);
        return new Result(200, "成功", companyListTotalPage);
    }

    @GetMapping("/searchCompanyList")
    public Result searchCompanyList(String name, int currentPage, int pageSize) {
        int fromIndex=(currentPage-1)*pageSize;
        List<Company> searchCompanyList=companyService.searchCompanyList(name,fromIndex,pageSize);
        if (searchCompanyList!=null) {
            return new Result(200, "查询成功", searchCompanyList);
        }else{
            return new Result(201,"查不到数据",null);
        }
    }
}
