package com.hy.powerplatform.statist.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/12/21.
 */

public class PersonTongJi implements Serializable {
    public String month;
    public String inner;
    public String outer;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getInner() {
        return inner;
    }

    public void setInner(String inner) {
        this.inner = inner;
    }

    public String getOuter() {
        return outer;
    }

    public void setOuter(String outer) {
        this.outer = outer;
    }
}
