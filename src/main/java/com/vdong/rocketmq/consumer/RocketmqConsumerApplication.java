package com.vdong.rocketmq.consumer;

import com.vdong.rocketmq.consumer.interfaces.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author gouyadong
 */
@SpringBootApplication
@EnableBinding({Sink.class, MySink.class})
public class RocketmqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketmqConsumerApplication.class, args);
    }

}
