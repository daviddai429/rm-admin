package com.gorilla.rm.domain.item;


import com.gorilla.rm.base.domain.BaseEntity;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Item.TABLE_NAME)
public class Item extends BaseEntity {

    public final static String TABLE_NAME = "item";

    public static final String INDEX_NAME = "item_index";

    public static final String TYPE = "doc";

    @Column
    private String title;

    @Column(name = "sell_point")
    private String sellPoint;

    @Column
    private Double price;

    @Column
    private Integer num;

    @Column
    private String barcode;

    @Column
    private String image;

    @Column
    private Long cid;

    @Column
    private Integer status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
