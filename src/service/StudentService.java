package service;

import java.util.List;

import dao.StudentDao;
import entity.Student;

public class StudentService {
	StudentDao dao =new StudentDao();
	//��ѯѧ����Ϣ
	public List<Student> Query(){
		return dao.Query();
	}
}
