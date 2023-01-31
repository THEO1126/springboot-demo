package cn.edu.guet.springbootdemo.bean;

/**
 * @Author liwei
 * @Date 2022/12/27 15:15
 * @Version 1.0
 */
public class Result {
    private int statusCode;
    private String message;
    private Object data;

    public Result() {
    }
    public Result(int statusCode, Object data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public Result(int statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }
    //    public Result(int statusCode, String message, Object data) {
//        this.statusCode = statusCode;
//        this.message = message;
//        this.data = data;
//    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "statusCode=" + statusCode +
                "message=" + message +
                ", data=" + data +
                '}';
    }
}
