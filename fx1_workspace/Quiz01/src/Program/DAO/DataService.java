package Program.DAO;

import Program.DTO.Score;
import Program.DTO.Student;

public interface DataService {
	public boolean insert(Student stu , Score sco);
	public boolean update(Student stu ,Score sco );
	public boolean delete(int stu_no);
	public void search(int stu_no);
}
