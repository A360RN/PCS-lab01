package com.a360rn.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.a360rn.entity.Staff;
import com.a360rn.util.DBAccess;

public class MySQLStaffDAO implements IStaffDAO{

	private Connection cn = null;
	private Statement st = null;
	private ResultSet rs = null;
	private String sql = "";
	
	@Override
	public List<Staff> listStaff() throws Exception {
		List<Staff> list = new ArrayList<>();
		try {
			cn = DBAccess.getConnection();
			sql = "select first_name, last_name, staff_id from staff";
			st = cn.createStatement();
			
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				
				Staff s = new Staff();
				s.setFirstName(rs.getString(1));
				s.setLastName(rs.getString(2));
				s.setStaffId(rs.getInt(3));
				
				list.add(s);
			}
			
			cn.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}


