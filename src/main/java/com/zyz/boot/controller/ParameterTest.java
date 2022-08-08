package com.zyz.boot.controller;

import com.fasterxml.jackson.annotation.JsonRawValue;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangyizhang
 * @description：
 * @create 2022-08-08 16:40
 */

@RestController
public class ParameterTest {

    //car/1/owner/zhang
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String username,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @PathVariable Map<String,String> headers,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("inters")List<String> inters,
                                      @RequestParam Map<String,String> in,
                                      @CookieValue("Idea-faaaca6") String idea,
                                      @CookieValue("Idea-faaaca6")Cookie cookie) {
        Map<String, Object> map = new HashMap<>();
//        map.put("id",id);
//        map.put("username",username);
//        map.put("pv",pv);
//        map.put("userAgent",userAgent);
//        map.put("headers",headers);
//        map.put("age",age);
//        map.put("inters",inters);
//        map.put("in",in);
        map.put("idea",idea);
        System.out.println(cookie.getName()+"====>"+cookie.getValue());
        return map;

    }

    @RequestMapping("/save")
    public Map getSave(@RequestBody String content ){
        Map<String, Object> map = new HashMap<>();
        map.put("content",content);
        return map;

    }
}
