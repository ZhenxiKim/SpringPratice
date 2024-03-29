package com.example.multimongotemplate.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MultipleMongoProps {
    private MongoProperties first = new MongoProperties();
    private MongoProperties second = new MongoProperties();
    private MongoProperties third = new MongoProperties();

}
