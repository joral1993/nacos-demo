package cn.joral.nacos.consumer.feign;

import cn.joral.nacos.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author jiangliang
 * @date 2020/5/21
 */
@FeignClient("nacos-provider")
public interface ProviderFeign {

    /**
     * provider中test方法
     * @param desc
     * @return
     */
    @RequestMapping(value = "test",method = RequestMethod.POST)
    String test(@RequestParam("desc") String desc);

    /**
     * provider中test1方法
     * @param id
     * @return
     */
    @RequestMapping(value = "test/{id}", method = RequestMethod.POST)
    String test1(@PathVariable("id") Integer id);

    /**
     * provider中test2方法
     * @param user
     * @return
     */
    @RequestMapping(value = "test/user", method = RequestMethod.POST)
    String test2(@RequestBody User user);
}
