package com.imooc.order.controller;

import com.imooc.order.client.ProductClient;
import com.imooc.order.dataobject.ProductInfo;
import com.imooc.order.dto.CartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Latin
 * 2020/8/7 10:41
 */
@RestController
@Slf4j
public class ClientController {
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

//    @Autowired
//    private RestTemplate restTemplate;

    // feign方式调用
    @Autowired
    private ProductClient productClient;
    @GetMapping("/getProductMsg")
    public String getProductMsg(){
        // 第一种方式(直接使用resttemplate，url写死)
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8080/msg",String.class);
        // 第二种方式（利用LoadBalancerClient通过应用名获取url，再使用resttemplate）
//        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String host = serviceInstance.getHost();
//        Integer port = serviceInstance.getPort();
//        String url = String.format("http://%s:%s",host,port+"/msg");
//        String response = restTemplate.getForObject(url,String.class);

        // 第三种(利用注解@LoadBalanced，可在restTemplate里使用应用的名字)
//        String response = restTemplate.getForObject("http://PRODUCT/msg",String.class);

        String response = productClient.productMsg();
        log.debug("response={}",response);
        return response;
    }

    @GetMapping("/getProductList")
    public String getProductList(){
        List<ProductInfo> list = productClient.listForOrder(Arrays.asList("164103465734242707"));
        log.info("reponse={}",list);
        return "ok";
    }

    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock(){
        CartDTO cartDTO = new CartDTO("164103465734242707",3);
        productClient.decreaseStock(Arrays.asList(cartDTO));
        return "ok";
    }
}
