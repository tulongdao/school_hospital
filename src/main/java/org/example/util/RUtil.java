package org.example.util;

import org.example.vo.R;

public class RUtil {
    //成功
    public static R ok(){
        R r=new R();
        r.setCode(RCodeType.成功.getCode());
        r.setMsg("OK");
        return r;
    }
    //成功
    public static R ok(Object data){
        R r=new R();
        r.setCode(RCodeType.成功.getCode());
        r.setMsg("OK");
        r.setData(data);
        return r;
    }
    //失败
    public static R fail(){
        R r=new R();
        r.setCode(RCodeType.失败.getCode());
        r.setMsg("FAIL");
        return r;
    }
}
