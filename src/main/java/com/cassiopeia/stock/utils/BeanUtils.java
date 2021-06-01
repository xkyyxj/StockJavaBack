package com.cassiopeia.stock.utils;

import org.springframework.context.ConfigurableApplicationContext;

public class BeanUtils {

    public static ConfigurableApplicationContext context = null;

    public static void setContext(ConfigurableApplicationContext appContext) {
        context = appContext;
    }

    public static Object getBeanByName(String name) {
        return context.getBean(name);
    }

}
