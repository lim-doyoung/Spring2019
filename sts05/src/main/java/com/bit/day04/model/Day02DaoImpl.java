package com.bit.day04.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bit.day04.model.entity.Day02Vo;

public class Day02DaoImpl implements Day02Dao {
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Day02Vo> selectAll() {
		String sql="SELECT * FROM DAY02";
		RowMapper rowMapper=null;
		rowMapper=new RowMapper<Day02Vo>() {

			public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Day02Vo(rs.getInt("NUM"),rs.getString("NAME"),rs.getString("SUB"),rs.getString("CONTENT"),rs.getDate("NALJA"));
			}
		};
		return jdbcTemplate.query(sql,rowMapper);
	}
	public Day02Vo selectOne(int num) {
		String sql="SELECT * FROM DAY02 WHERE NUM=?";
		RowMapper rowMapper=null;
		rowMapper=new RowMapper<Day02Vo>() {

			public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Day02Vo(rs.getInt("NUM"),rs.getString("NAME"),rs.getString("SUB"),rs.getString("CONTENT"),rs.getDate("NALJA"));
			}
		};
		return (Day02Vo) jdbcTemplate.queryForObject(sql,rowMapper,num);
	}

	public void insertOne(Day02Vo bean) {
		String sql="INSERT INTO DAY02 (NAME,SUB,CONTENT,NALJA) VALUES (?,?,?,NOW())";
		jdbcTemplate.update(sql,bean.getName(),bean.getSub(),bean.getContent());
	}

	public int updateOne(Day02Vo bean) {
		String sql="UPDATE DAY02 SET NAME=?,SUB=?,CONTENT=? WHERE NUM=?";
		return jdbcTemplate.update(sql,bean.getName(),bean.getSub(),bean.getContent(),bean.getNum());
	}

	public int deleteOne(int num) {
		String sql="DELETE FROM DAY02 WHERE NUM=?";
		return jdbcTemplate.update(sql,num);
	}

}
