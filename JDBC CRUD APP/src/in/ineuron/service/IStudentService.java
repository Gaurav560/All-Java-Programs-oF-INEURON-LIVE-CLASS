package in.ineuron.service;

import in.ineuron.dto.Student;

public interface IStudentService {
	public String addStudent(String name,Integer sage,String address);
	public Student searchStudent(Integer sid);
	public String deleteStudent(Integer sid);
	public String updatestudent(Integer sid,String sname,Integer sage,String saddress);
}
