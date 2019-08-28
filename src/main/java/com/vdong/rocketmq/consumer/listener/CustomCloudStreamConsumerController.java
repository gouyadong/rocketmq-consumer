package com.vdong.rocketmq.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @author gouyadong
 */
@Slf4j
@Service
public class CustomCloudStreamConsumerController {

    @StreamListener("input1")
    public void receiveInput1(String msg){
        log.info("input1接收到的消息：{}", msg);
    }
    @StreamListener("input2")
    public void receiveInput2(String msg){
        log.info("input2接收到的消息：{}", msg);
    }
    @StreamListener("input3")
    public void receiveInput3(String msg){
        log.info("input3接收到的消息：{}", msg);
    }
    @StreamListener("input4")
    public void receiveInput4(String msg){
        log.info("input4接收到的消息：{}", msg);
    }

}
