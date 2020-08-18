package com.imooc.luckeymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 廖师兄
 * 2019-02-27 17:54
 * @Controller + @ResponseBody = @RestController
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private LimitConfig limitConfig;

//	@Value("${description}")
//	private String description;
//
//	@Value("${minMoney}")
//	private BigDecimal minMoney;

//	@GetMapping({"/say","hi"})  // 匹配两个url
//	@GetMapping("/say")
//	@PostMapping("/say")
	@RequestMapping("/say")
	public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
		return "说明：" + limitConfig.getDescription();
//		return "id:" + myId;
//		return "index";
	}

	@GetMapping("/say2/{id}")
	public String say2(@PathVariable("id") Integer id){
//		return "index";
		return "id="+id;
	}

	//参数id非必填，不传时默认值为"0"
	@PostMapping("/say3")
	public String say3(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
		return "myId="+myId;

	}
}
