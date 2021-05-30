package com.heyuanhang.springbootthymeleaf;

import com.heyuanhang.springbootthymeleaf.beans.Student;
import com.heyuanhang.springbootthymeleaf.config.GuoJiHuaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringbootThymeleafApplicationTests {

    @Autowired
    private Student student;
   @Autowired
   private GuoJiHuaConfig guoJiHuaConfig;
    @Test
    void contextLoads() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1001,"hhh");
        map.put(1002,"hhh");
        map.put(1003,"hhh");
        map.put(1004,"hhh");
        map.put(1005,"hhh");
        System.out.println(map.remove(1001));
    }



}
