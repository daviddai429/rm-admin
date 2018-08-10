package com.gorilla.rm.rm.itemcontroller;

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

@Api("ItemController在线文档")
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @ApiOperation(value = "根据id查询商品")
    @ApiImplicitParam(name = "id", value = "商品id", required = false, dataType = "Long", paramType = "path")
    @RequestMapping("/findOne/{id}")
    public ResultEntity findOne(@PathVariable("id") Long id){
        Item item = itemService.findOneById(id);
        return ResultEntityUtil.success(item,"");
    }
}
