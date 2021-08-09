package co.kr.homework.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HwMapper {
	public int cnt();
	public List<HashMap<String, Object>> board();
}