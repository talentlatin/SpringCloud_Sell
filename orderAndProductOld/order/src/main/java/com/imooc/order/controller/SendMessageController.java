package com.imooc.order.controller;

import com.imooc.order.dto.OrderDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 廖师兄
 * 2018-02-13 18:20
 */
@RestController
public class SendMessageController {

//    @Autowired
//    private StreamClient streamClient;

//    @GetMapping("/sendMessage")
//    public void process() {
//        String message = "now " + new Date();
//        streamClient.output().send(MessageBuilder.withPayload(message).build());
//    }

    /**
     * 发送 orderDTO对象
     */
    @GetMapping("/sendMessage")
    public void process() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("123456");
//        streamClient.output().send(MessageBuilder.withPayload(orderDTO).build());
    }
}
