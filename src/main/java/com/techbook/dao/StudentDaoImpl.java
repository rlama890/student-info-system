package com.techbook.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techbook.domain.Student;
import com.techbook.util.DbConnectionUtil;

public class StudentDaoImpl implements StudentDao {

	
	 public static final String INSERT_SQL = "insert into user_tbl(user_name, password, mobile_no, email, address, dob)values(?,?,?,?,??)";
	   

	    @Override
	    public int saveUserInfo(User user) {
	    	int saved = 0;
	    	
	    	try( PreparedStatement ps = DbConnectionUtil.getConnection().prepareStatement(INSERT_SQL)){
	    		
	    		ps.setString(1, user.getUserName());
	    		ps.setString(2, user.getrollno());
	    		ps.setLong(3, user.getMobileNo());
	    		ps.setString(4, user.getEmail());
	    		ps.setString(4, user.getaddress());
	    		ps.setDate(5, new (user.getDob().getTime()));
	    		saved = ps.executeUpdate();
	    		
	    	}catch (ClassNotFoundException | SQLException e) {
	    		e.printStackTrace();
	    	}
	    	return saved;
	    }
	    
	  
}
