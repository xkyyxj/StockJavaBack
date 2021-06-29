package com.serpent.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${spring.codec.max-in-memory-size: 10485760}")
    public Integer maxInMemorySize;

    @Bean
    public WebClient getWebClient() {
        ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(configurer -> {
                    Jackson2JsonDecoder jacksonDecoder = new Jackson2JsonDecoder();
                    jacksonDecoder.setMaxInMemorySize(maxInMemorySize);
                    configurer.customCodecs().decoder(jacksonDecoder);
                    configurer.customCodecs().encoder(new Jackson2JsonEncoder());
                    configurer.defaultCodecs().maxInMemorySize(maxInMemorySize);
                })
                .build();
        return WebClient.builder().exchangeStrategies(strategies).build();
    }

}
