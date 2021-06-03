package constant;

import com.alibaba.fastjson.JSON;

public class HttpResponse<T> extends JsonModule{

    private long code;

    private String message = "";

    private T data;

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setCode(long code){
        this.code = code;
    }

    public long getCode(){
        return code;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
