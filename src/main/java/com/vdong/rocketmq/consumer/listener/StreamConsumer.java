package com.vdong.rocketmq.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StreamConsumer {

    @StreamListener(Sink.INPUT)
    public void receive(String message){
        log.info("通过stream接收到的消息：{}", message);
    }
}
