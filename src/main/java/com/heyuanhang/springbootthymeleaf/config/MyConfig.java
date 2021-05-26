package com.heyuanhang.springbootthymeleaf.config;

import com.heyuanhang.springbootthymeleaf.beans.Student;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author 何远航
 * @Date: 2021/5/22 16:43
 * @Version 1.8
 */
@Configuration
@EnableConfigurationProperties({Student.class})
public class MyConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("index");
        registry.addViewController("/").setViewName("index");
    }
}
