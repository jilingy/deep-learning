package com.jilingy.deep.learning.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-11-08
 */
@Api(tags = "首页模块")
@RestController
public class HomePageController {
    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation(value = "问好")
    @GetMapping("/hello")
    public ResponseEntity<String> sayHi(@RequestParam(value = "name") String name) {
        return ResponseEntity.ok("Hi: " + name);
    }
}
