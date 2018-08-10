package com.gorilla.rm.domain.configuration;

import com.gorilla.rm.base.domain.BaseEntity;

import javax.persistence.*;

/*
* 配置系统中使用到的常量配置，即常量配置表
* */
@Entity
@Table(name = Configuration.TABLE_NAME)
public class Configuration extends BaseEntity {

    public final static String TABLE_NAME = "configuration";

    @Column(name="key")
    private String key;

    @Column(name="value")
    private String value;

    @Column(name="describe")
    private String describe;


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

}
