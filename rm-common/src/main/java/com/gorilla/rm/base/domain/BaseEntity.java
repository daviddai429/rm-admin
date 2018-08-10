package com.gorilla.rm.base.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/*
* 数据库基础实体类
* */
@MappedSuperclass
public class BaseEntity implements Serializable{

    private static final long serialVersionUID = -7674269980281525370L;

    //主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //创建时间
    @Column(name = "created_date")
    private Date createdDate;

    //最后修改时间
    @Column(name = "last_updated_date")
    private Date lastUpdatedDate;

    //是否有效 0否 1是
    @Column(name = "is_available")
    private Integer isAvailable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Integer getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
    }
}
