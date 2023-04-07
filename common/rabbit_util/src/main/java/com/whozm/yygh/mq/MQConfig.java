package com.whozm.yygh.mq;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author HZM
 * @date 2023/2/1
 */
@Configuration
public class MQConfig {
    @Bean
    public Jackson2JsonMessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}