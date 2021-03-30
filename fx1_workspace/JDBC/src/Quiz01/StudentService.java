package Quiz01;

import java.util.List;

public interface StudentService {
	public void insert(Student student);
	public void update(Student student);
	public void delete(int num);
	public List<Student> select();
	public boolean checknum(int num);
	public void search(int num);
	public boolean checkMember();
}
