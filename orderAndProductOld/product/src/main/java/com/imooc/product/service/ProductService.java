package com.imooc.product.service;

import com.imooc.product.DTO.CartDTO;
import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-09 21:57
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
//    List<ProductInfoOutput> findList(List<String> productIdList);


    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
//     * @param decreaseStockInputList
     */
//    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);

    void decreaseStock(List<CartDTO> cartDTOList);
}
