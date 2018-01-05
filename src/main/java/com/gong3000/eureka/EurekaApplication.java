package com.gong3000.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tao.wang
 */
@EnableEurekaServer
@RestController
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

    @RequestMapping({"/ping"})
    public String ping() {
        return "success";
    }

    @RequestMapping({"/exit"})
    public String exit() {
        System.exit(0);
        return "success";
    }
}
