package com.heyuanhang.springbootthymeleaf.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @Author 何远航
 * @Date: 2021/5/25 11:21
 * @Version 1.8
 */
@Configuration
public class GuoJiHuaConfig implements LocaleResolver {
    Locale locale = null;
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取到参数信息
        String l = request.getParameter("l");
        if (!StringUtils.isEmpty(l)) {
            String[] split = l.split("_");
            locale = new Locale(split[0], split[1]);
        } else {
            locale = Locale.getDefault();
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }

    /**
     * 方法名必须是localeResolver()，否则国际化不会生效
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){
        return new GuoJiHuaConfig();
    }
}
