package cn.wolfcode.shop.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class JSONResultVo implements Serializable{

    @Setter@Getter
    private Boolean success = true;
    @Getter
    private String errorMsg;
    @Setter@Getter
    private Object result;

    public void setErrorMsg(String msg){
        this.errorMsg = msg;
        this.success = false;
    }
}
