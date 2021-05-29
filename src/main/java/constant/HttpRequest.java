package constant;

import com.alibaba.fastjson.JSON;

public abstract class HttpRequest<T>  {

    T object;

    public String toString(){
        return JSON.toJSONString(object);
    }
}
