package com.jzy.order.config.redis;

import lombok.Data;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jinziyu
 * @date 2020/4/24 23:26
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "redis")
public class RedissonConfig {
    private String host;
    private int port;
    private int databaseNo;

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://" + host + ":" + port)
                .setDatabase(databaseNo);
        return Redisson.create(config);
    }

}
