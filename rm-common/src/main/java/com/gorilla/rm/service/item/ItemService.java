package com.gorilla.rm.service.item;

import com.gorilla.rm.base.service.BaseService;
import com.gorilla.rm.domain.item.Item;

import java.util.List;

public interface ItemService extends BaseService<Item> {

    /**
     * 关键字查询商品title
     *
     * @param searchContent 查询内容
     * @return
     */
    public List<Item> searchItems(String searchContent);

}
