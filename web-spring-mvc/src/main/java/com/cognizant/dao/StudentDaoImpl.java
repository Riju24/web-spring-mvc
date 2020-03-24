package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(Student s) {
		String sql = "Insert into Person(id,name) values(?,?)";

		int r = jdbcTemplate.update(sql,s.getId(),s.getName());
		
		
	}

	public void update(Student s) {
		
		String sql ="Update Person set name = ? where id =?";
		
		int r = jdbcTemplate.update(sql,s.getName(),s.getId());
		
	}

	public void delete(String f) {
	String sql = "Delete from Person where id =?";
	
	int r = jdbcTemplate.update(sql,f);
		
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		
		String sql ="Select * from Person";
		
		RowMapper<Student> rowMapper = new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int r)throws SQLException {
				String id = rs.getString("id");
				String name = rs.getString("name");
				
				Student s = new Student(id,name);
				return s;
			}
		};
		
		
		List<Student> li = jdbcTemplate.query(sql, rowMapper);
		return li;
	}

}
