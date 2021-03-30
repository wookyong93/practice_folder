package ex02;

import java.util.Comparator;
import java.util.Objects;

public class Exam2 {
	public static void main(String[] args) {
		String str1 = new String("È«±æµ¿");
		String str2 = new String("È«±æµ¿");
		String str3 = new String("ÀÌ¼ø½Å");
		
		
		int result = Objects.compare(str1,str2,new StringCompare());
		System.out.println(result);
		
		result = Objects.compare(str1, str3, new StringCompare());
		System.out.println(result);
	}
	
	static class StringCompare implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			if(o1.equals(o2)) {
				return 0;
			}
			return 1;
		}
		
	}
}
