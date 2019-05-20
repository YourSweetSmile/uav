package cn.unicom.fj.uav.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping("/say")
    public Map sayHello(){

        Map<String,Object> res = new HashMap<>();

        res.put("msg", "hello word");
        return res;
    }
}
