package cn.itcast.springboot.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.service.NoticeService;

@RestController
public class NoticeController {
	
	@Resource
	private NoticeService noticeService;
	
	@RequestMapping("findByPage")
	public Map<String, Object> findAllPage(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows){
		// {"total" : 100, "rows" : [{},{}]}
		return noticeService.findAllPage(page, rows);
		
	}

}
