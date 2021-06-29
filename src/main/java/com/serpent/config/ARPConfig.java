package com.serpent.config;

import org.apache.catalina.LifecycleListener;
import org.apache.catalina.core.AprLifecycleListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ARPConfig {

    @Value("${tomcat.apr:true}")
    private boolean enabled;

    @Bean
    public ConfigurableWebServerFactory servletContainer() {
        TomcatServletWebServerFactory  container = new TomcatServletWebServerFactory();
        if (enabled) {
            LifecycleListener arpLifecycle = new AprLifecycleListener();
            container.setProtocol("org.apache.coyote.http11.Http11AprProtocol");
            container.addContextLifecycleListeners(arpLifecycle);
        }

        return container;
    }

}
