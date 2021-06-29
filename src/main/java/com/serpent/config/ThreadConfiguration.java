package com.serpent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ThreadConfiguration {

    @Bean(name = "defaultExecutor")
    public ExecutorService getExecutor() {
        return Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

}
