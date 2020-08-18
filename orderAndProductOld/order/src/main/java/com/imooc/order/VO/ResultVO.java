package com.imooc.order.VO;

import lombok.Data;

/**
 * Created by Latin
 * 2020/8/7 9:56
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
