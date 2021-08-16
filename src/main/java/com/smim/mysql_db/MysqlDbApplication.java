package com.smim.mysql_db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MysqlDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlDbApplication.class, args);
    }

}
