package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.itcast.springboot.pojo.Notice;

@Mapper
public interface NoticeMapper {

	Long countNotice();

	List<Notice> findAll(@Param("page") Integer start,@Param("rows") Integer rows);


}
