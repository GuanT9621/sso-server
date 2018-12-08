package com.guan.sso.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SsoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SsoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
