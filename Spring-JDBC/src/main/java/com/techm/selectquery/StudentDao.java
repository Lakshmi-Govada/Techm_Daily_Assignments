package com.techm.selectquery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveStudent(Student student) {
		String sql = "insert into student values(?,?)";
		return template.update(sql, student.getStid(), student.getStname());
	}

	public List<Student> getAllStudents() {
		return template.query("select * from student", new ResultSetExtractorTest());
	}

	public List<Student> getAllEmployeesRowMapper() {
		
		return template.query("select * from student", new RowMapperTest());
		
	}

}