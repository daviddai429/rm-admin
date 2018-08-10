package com.gorilla.rm.rm.elasticsearchcontroller;


import com.gorilla.rm.domain.ResultEntity;
import com.gorilla.rm.domain.item.Item;
import com.gorilla.rm.service.item.ItemService;
import com.gorilla.rm.util.ResultEntityUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("elastic在线文档")
@RestController
@RequestMapping("/elastic")
public class ElasticSearchController {

    @Autowired
    private ItemService itemService;

    @ApiOperation(value="关键字查询商品title")
    @ApiImplicitParam(name = "searchContent", value = "查询内容", required = false, dataType = "String", paramType = "path")
    @RequestMapping("/searchItems/{searchContent}")
    public ResultEntity searchItemsByKeyword(@PathVariable("searchContent")String searchContent){
        List<Item> itemList = itemService.searchItems(searchContent);
        return ResultEntityUtil.success(itemList,"");
    }
}
