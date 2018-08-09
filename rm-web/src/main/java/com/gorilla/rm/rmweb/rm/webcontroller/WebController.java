package com.gorilla.rm.rmweb.rm.webcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gorilla.rm.rmcommon.domain.ResultEntity;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class WebController {

    private final static Logger logger = LoggerFactory.getLogger(WebController.class);

    @ApiOperation(value = "演示方法", notes = "测试系统是否能访问")
    @ApiImplicitParam(name = "name", value = "名称", required = false, dataType = "String", paramType = "path")
    @RequestMapping(value = "/sayHello/{name}", method = RequestMethod.GET)
    public ResponseEntity<ResultEntity> sayHello(@PathVariable("name") String name) {
        ResultEntity entity = new ResultEntity();
        entity.setResult("hello," + name + "!!");
        return ResponseEntity.ok(entity);
    }
}
