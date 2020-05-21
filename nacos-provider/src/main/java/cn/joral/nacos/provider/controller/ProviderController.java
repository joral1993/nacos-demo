package cn.joral.nacos.provider.controller;

import cn.joral.nacos.provider.pojo.User;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.*;

/**
 * @author jiangliang
 * @date 2020/5/21
 */
@RestController
public class ProviderController {

    @RequestMapping("test")
    public String test(@RequestParam("desc") String desc){
        return desc+"---provider";
    }

    @RequestMapping("test/{id}")
    public String test1(@PathVariable("id") Integer id){
        return id+"---provider";
    }

    @RequestMapping("test/user")
    public String test2(@RequestBody User user){
        return JSON.toJSONString(user) +"---provider";
    }
}
