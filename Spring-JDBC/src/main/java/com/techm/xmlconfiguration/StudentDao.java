package com.techm.xmlconfiguration;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {

	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int saveStudent(Student student)
	{
		String sql = "insert into student values(?,?)";
		return template.update(sql, student.getStid(),student.getStname());
	}
}
