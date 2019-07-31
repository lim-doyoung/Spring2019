package com.bit.day05.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bit.day05.model.entity.Day02Vo;

//@Component(value="day02Dao")
//@Repository(value="day02Dao")
public class Day02DaoImpl implements Day02Dao{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
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

	@Override
	public Day02Vo selectOne(int num) {
		String sql="select * from day02 where num=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Day02Vo>() {

			@Override
			public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Day02Vo(rs.getInt("num"),rs.getString("name")
						,rs.getString("sub"),rs.getString("content")
						,rs.getDate("nalja"));
			
		}},num);
	}
	@Override
	public void insertOne(Day02Vo bean) {
		String sql="insert into day02(name,sub,content,nalja) values(?,?,?,now())";
		// TODO Auto-generated  method stub
		
		jdbcTemplate.update(sql,bean.getName(),bean.getSub(),bean.getContent());
		
	}

	@Override
	public int updateOne(Day02Vo bean) {
		String sql="update day02 set name=?,sub=?,content=? where num=?";
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
