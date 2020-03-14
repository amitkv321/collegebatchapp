package com.avion.collegebatchapp;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.avion.*")
@EntityScan(basePackages="com.avion.model")
public class AppConfigs {

}
