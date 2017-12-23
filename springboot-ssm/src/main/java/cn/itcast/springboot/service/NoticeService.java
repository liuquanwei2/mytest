package cn.itcast.springboot.service;

import java.util.Map;

public interface NoticeService {
	
	public Map<String, Object> findAllPage(Integer page,Integer rows);

}
