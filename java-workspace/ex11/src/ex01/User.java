package ex01;

public class User implements Cloneable {
	int number;
	String name;
	
	public User userClone() {
		User c = null;
		try {
			c = (User)clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
}
