package com.example.demo.swoole;

import io.swagger.annotations.*;

@Api(tags = "xxx模块说明")
@ApiOperation("接口睡眠面膜")
@ApiModel("用户实体")
public class User {
    @ApiModelProperty("用户民")
    public String username;
    @ApiModelProperty(value = "买买买")
    public String password;


    public String test(String s){
        return "swoole content";
    }
}
