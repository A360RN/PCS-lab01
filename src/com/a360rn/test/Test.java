package com.a360rn.test;

import com.a360rn.entity.Staff;
import com.a360rn.model.MySQLStaffDAO;
import com.a360rn.util.DBAccess;

import java.sql.Connection;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection cn = DBAccess.getConnection();
			List<Staff> lista = new MySQLStaffDAO().listStaff();
			
			for(Staff s : lista){
				System.out.println(s.getLastName() + " " + s.getStaffId());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
