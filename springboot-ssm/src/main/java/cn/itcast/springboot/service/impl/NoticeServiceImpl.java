package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Resource
	private NoticeMapper noticeMapper;
	
	@Override
	public Map<String, Object> findAllPage(Integer page, Integer rows) {
		
		Map<String, Object> data = new HashMap<>();
		
		Long count = noticeMapper.countNotice();
		data.put("total", count);
		
		List<Notice> list = noticeMapper.findAll((page-1)*rows,rows);
		data.put("rows", list);
		
		return data;
	}

}
