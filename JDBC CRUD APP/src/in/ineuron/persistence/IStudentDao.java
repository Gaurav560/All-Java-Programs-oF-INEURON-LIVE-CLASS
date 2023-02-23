package in.ineuron.persistence;



import in.ineuron.dto.Student;

/**
 * @author Gaurav
 *
 */
public interface IStudentDao {
//operations to be implemented
	public String addStudent(String name,Integer sage,String address);
	public Student searchStudent(Integer sid);
	public String deleteStudent(Integer sid);
	public String updatestudent(Integer sid,String sname,Integer sage,String saddress);
}
