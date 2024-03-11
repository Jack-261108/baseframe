package com.jack.configuration;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "redisson")
public class RedissonProperties {
    private int subscriptionConnectionMinimumIdleSize = 1;
    private int subscriptionConnectionPoolSize = 5;
    private int connectionMinimumIdleSize = 5;
    private int connectionPoolSize = 25;
    private int database = 0;
    private long dnsMonitoringInterval = 5000L;
}
