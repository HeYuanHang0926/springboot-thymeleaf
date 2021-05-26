package com.heyuanhang.springbootthymeleaf;

import com.heyuanhang.springbootthymeleaf.beans.Student;
import com.heyuanhang.springbootthymeleaf.config.GuoJiHuaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootThymeleafApplicationTests {

    @Autowired
    private Student student;
   @Autowired
   private GuoJiHuaConfig guoJiHuaConfig;
    @Test
    void contextLoads() {
    }

}
