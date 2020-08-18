package com.imooc.rabbitmq.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by Latin
 * 2020/8/11 19:25
 */
public interface StreamClient {
    String INPUT = "xiaomi";
    String INPUT2 = "xiaomi2";
    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output(StreamClient.INPUT)
    MessageChannel ouput();

    @Input(StreamClient.INPUT2)
    SubscribableChannel input2();

    @Output(StreamClient.INPUT2)
    MessageChannel ouput2();
}