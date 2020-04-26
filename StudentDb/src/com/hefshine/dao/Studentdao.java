package com.hefshine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hefshine.beans.Student;
import com.mysql.jdbc.PreparedStatement;

public class Studentdao 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
		}
		catch(Exception e)
		{
		System.out.println(e);
	}
		return con;
	
	
	}
	public static int save(Student s)
	{
		int status=0;
		try {
			Connection con=Studentdao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into student(Rollno,Firstname,Lastname)values(?,?,?)");
			ps.setInt(1, s.getRollno());
			ps.setString(2, s.getFirstname());
			ps.setString(3, s.getLastname());
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public static int update(Student s)
	{
		int status=0;
		try
		{
			Connection con=Studentdao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("update student set Rollno=?,Firstname=?,Lastname=?");
			ps.setInt(1, s.getRollno());
			ps.setString(2, s.getFirstname());
			ps.setString(3, s.getLastname());
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public static int delete(int id)
	{
		int status=0;
		try
		{
			Connection con=Studentdao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete fron student where Rollno=?, Firstname=?,Lastname=?");
			ps.setInt(1, id);
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static Student getStudentById(int id)
	{
		Student st=new Student();
		try
		{
			Connection con=Studentdao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from student");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				st.setRollno(rs.getInt(1));
				st.setFirstname(rs.getString(2));
				st.setLastname(rs.getString(3));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}
	public static List<Student>getAllSubjects()
	{
		List<Student>list=new ArrayList<Student>();
		try
		{
			Connection con=Studentdao.getConnection();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from student");
	
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Student s=new Student();
				s.setRollno(rs.getInt(1));
				s.setFirstname(rs.getString(2));
				s.setLastname(rs.getString(3));
				list.add(s);
			}
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}
