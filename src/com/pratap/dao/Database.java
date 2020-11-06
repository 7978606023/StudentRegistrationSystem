package com.pratap.dao;

import java.sql.*;

public class Database {

	public static Connection getCon() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_reg", "root", "tiger");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
