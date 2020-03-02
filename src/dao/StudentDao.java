package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class StudentDao extends BaseDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	//查询学生信息
	public List<Student> Query(){
		List<Student> list=new ArrayList<Student> ();
		try {
			conn=getConnection();
			//创建要执行的SQL命令
			String sql="SELECT * FROM StudentInfo";
			pst=conn.prepareStatement(sql);
			//处理结果集
			rs=pst.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(4)));
			}
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return list;
	}
}
