package entity;

public class Student {
	private String name;//����
	private int sno;//ѧ��
	private String sex;//�Ա�
	private int age;//����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int sno, String sex, int age) {
		super();
		this.name = name;
		this.sno = sno;
		this.sex = sex;
		this.age = age;
	}
	public Student() {
		super();
	}
	
	
}
