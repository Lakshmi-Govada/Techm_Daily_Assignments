package com.techm.selectquery;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ResultSetExtractorTest implements ResultSetExtractor<List<Student>> {

	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Student> list = new ArrayList<Student>();
		
		while(rs.next())
		{
			Student st = new Student();
			st.setStid(rs.getInt(1));
			st.setStname(rs.getString(2));
			list.add(st);
		}
		return list;
		
	}

}
