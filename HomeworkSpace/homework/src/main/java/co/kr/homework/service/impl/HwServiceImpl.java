package co.kr.homework.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.kr.homework.service.HwService;

@Service
public class HwServiceImpl implements HwService{
	@Autowired
	private HwMapper mapper;
	
	public int cnt() {
		return mapper.cnt();
	}

	@Override
	public List<HashMap<String, Object>> board() {
		// TODO Auto-generated method stub
		return mapper.board();
	}
}