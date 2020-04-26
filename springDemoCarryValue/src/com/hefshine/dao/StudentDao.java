package com.hefshine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hefshine.beans.Student;

@Component(value = "sd")
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String getStudentName(int rollNumber) {

		String sql = "SELECT fname FROM student WHERE rollnumber = " + rollNumber;

		return jdbcTemplate.queryForObject(sql, String.class);
	}
	
	//----------------------save data------------------
	
	public void save(Student s) {
		
		Object[] params=new Object[] {s.getRollNumber(),s.getFirstName(),s.getLastName()};
		String query="insert into student values(?,?,?)";
		jdbcTemplate.update(query,params);
	}
	
	//------------------daelete data------------------
	
	public void delete(int rollNumber) {
		String query="delete from student where rollNumber="+rollNumber;
		jdbcTemplate.update(query);
		
	}
	
	//---------------------------
	
	public void update(int rollNumber) {
		String query="update student fname set fname='pinky' where rollNumber="+rollNumber;
		jdbcTemplate.update(query);
	}
	//---------------------
	public void deleteOnCondition(int rollNumber,String Fname) {
		String query="delete from student where rollNumber=? and fname=?";
		Object[] params=new Object[] {rollNumber,Fname};
		jdbcTemplate.update(query,params);
	}
	//--  Method for insert record using param-----------------
	
	public void insertUsingParams(Student s) {
		
		Object[] params=new Object[] {s.getRollNumber(),s.getFirstName(),s.getLastName()};
		String query="insert into student values(?,?,?)";
		jdbcTemplate.update(query,params);
	}
	//----select all list of student-------------
	public List<Student> getAll(){
		String query="select * from student";
		return jdbcTemplate.query(query, new StudentMapper());
				
	}
	
	//--------------------------select All data-----------------
	public Student getById(int rollNumber) {
		String query="select * from student where rollNumber="+rollNumber;
		return jdbcTemplate.queryForObject(query, new StudentMapper());
	}
	
	
	private class StudentMapper implements RowMapper<Student>{

		
		public Student mapRow(ResultSet rs, int row) throws SQLException {
			Student student=new Student();
			student.setRollNumber(rs.getInt("rollNumber"));
			student.setFirstName(rs.getString("fName"));
			student.setLastName(rs.getString("lName"));
			return student;
		}
		
	}
}
