package net.xjdsz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by dingshuo on 2017/3/16.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
