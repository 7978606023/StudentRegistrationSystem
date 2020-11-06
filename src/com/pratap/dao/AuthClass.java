package com.pratap.dao;

import com.pratap.model.Student;

import java.sql.*;

public class AuthClass {

	public static int Registration(Student stu) throws SQLException {

		boolean status = stu.passwordCheck();
		int result = 0;
		if (status) {

			Connection con = Database.getCon();

			PreparedStatement ps = con
					.prepareStatement("INSERT INTO student(CWID, fName, lName, email, password) VALUES(?,?,?,?,?)");
			ps.setInt(1, stu.getCwid());
			ps.setString(2, stu.getfName());
			ps.setString(3, stu.getlName());
			ps.setString(4, stu.getEmail());
			ps.setString(5, stu.getPassword());

			result = ps.executeUpdate();
			con.close();

			return result;
		}

		return result;

	}

	public static boolean LogInValidation(int cwid, String password) throws SQLException {

		Connection con = Database.getCon();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM student WHERE CWID =? AND password = ?");
		stmt.setInt(1, cwid);
		stmt.setString(2, password);
		ResultSet st = stmt.executeQuery();
		boolean result = st.next();

		return result;
	}
}
