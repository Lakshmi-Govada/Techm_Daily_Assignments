package com.techm.selectquery;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


public class RowMapperTest implements  RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

           Student st= new Student();
           st.setStid(rs.getInt(1));
           st.setStname(rs.getString(2));
           
           return st;
		
	}

	

}