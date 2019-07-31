package com.bit.day04.model;

import java.util.List;

import com.bit.day04.model.entity.Day02Vo;

public interface Day02Dao {

		//목록
		List<Day02Vo> selectAll();
		
		//디테일
		Day02Vo selectOne(int num);
		
		//입력
		void insertOne(Day02Vo bean);
		
		//수정
		int updateOne(Day02Vo bean);
		
		//삭제
		int deleteOne(int num);
	
}
