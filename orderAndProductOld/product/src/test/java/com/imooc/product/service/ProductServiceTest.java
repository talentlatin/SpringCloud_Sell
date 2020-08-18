package com.imooc.product.service;

import com.imooc.product.DTO.CartDTO;
import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class ProductServiceTest extends ProductApplicationTests{
    @Autowired
    private ProductService productService;
    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size()>0);
    }

   @Test
   public void findList(){
       List<ProductInfo> list = productService.findList(Arrays.asList("164103465734242707"));
       Assert.assertTrue(list.size()>0);
   }

   @Test
   public void decreaseStock(){
       CartDTO cartDTO = new CartDTO("157875196366160022",2);
       productService.decreaseStock(Arrays.asList(cartDTO));
   }
}