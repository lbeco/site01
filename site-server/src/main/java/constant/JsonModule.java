package constant;

import com.alibaba.fastjson.JSON;

public class JsonModule {

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
