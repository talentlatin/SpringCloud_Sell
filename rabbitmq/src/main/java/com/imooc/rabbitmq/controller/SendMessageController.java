package com.imooc.rabbitmq.controller;

import com.imooc.rabbitmq.dto.OrderDTO;
import com.imooc.rabbitmq.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Latin
 * 2020/8/11 19:37
 */
@RestController
public class SendMessageController {
    @Autowired
    private StreamClient streamClient;

//    @GetMapping("/xiaomi")
//    public void process(){
//        streamClient.ouput().send(MessageBuilder.withPayload("now "+new Date()).build());
//    }


    @GetMapping("/xiaomi")
    public void process(){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("123123");
        streamClient.ouput().send(MessageBuilder.withPayload(orderDTO).build());
    }
}
