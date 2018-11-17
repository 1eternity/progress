package com.hzm.csv;

/**
 * Created by hzm on 2017/9/15.
 */

public class DataBean implements IDataBean {
    String textName;

    public DataBean(String textName) {
        this.textName = textName;
    }

    @Override
    public String getTextName() {
        return textName;
    }
}
