package cn.joral.nacos.consumer.controller;

import cn.joral.nacos.consumer.feign.ProviderFeign;
import cn.joral.nacos.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author jiangliang
 * @date 2020/5/21
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProviderFeign providerFeign;

    @RequestMapping(value = "consumer")
    public String test(@RequestParam("desc") String desc){
        return providerFeign.test(desc);
    }

    @RequestMapping(value = "consumer/{id}")
    public String test(@PathVariable("id") Integer id){
        return providerFeign.test1(id);
    }

    @RequestMapping(value = "consumer/user")
    public String test(@RequestBody User user){
        return providerFeign.test2(user);
    }
}
