package com.da.coding.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.da.coding.service" })
public class SpringRootConfig {
}