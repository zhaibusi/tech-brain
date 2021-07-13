package com.zbs.techbrain.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan(basePackages = {"com.zbs.techbrain"})
@SpringBootApplication
public class BootstrapApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(BootstrapApplication.class, args);
    }

}
