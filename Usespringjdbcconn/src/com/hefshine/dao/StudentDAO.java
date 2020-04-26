package com.hefshine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hefshine.bean.Student;

@Component(value="sd")
public class StudentDAO 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String getName(int rollno)
	{
		String sql="select Firstname from student where Rollno="+rollno;
		String name=jdbcTemplate.queryForObject(sql, String.class);
		return name;
	}
	
	public void save(Student student)
{
	Object[]params=new Object[] {student.getRollno(),student.getFirstname(),student.getLastname()};
	String query="Insert into student values(?,?,?)";
	jdbcTemplate.update(query,params);
	
}
	public Student getById(int rollNumber)
	{
		String query="select * from student where Rollno="+rollNumber;
		Student student =jdbcTemplate.queryForObject(query,new StudentMapper());
		return student;
	}
	
	public List<Student>getAll()
	{
		String query="select * from student";
		return jdbcTemplate.query(query,new StudentMapper());
	}
	
	private class StudentMapper implements RowMapper<Student>
	{
		@Override
		public Student mapRow(ResultSet rs,int number)throws SQLException{
		Student student=new Student();
		student.setRollno(rs.getInt("Rollno"));
		student.setFirstname(rs.getString("Firstname"));
		student.setLastname(rs.getString("Lastname"));
		return student;
		
	}

}
}
