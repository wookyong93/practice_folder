package ex04;

public class Exam1 {
	public static void main(String[] args) {
		try { //try �� catch ��¦ ������ �����־���Ѵ�.
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println("0���� ���� �� �����ϴ�.");
		}finally {//������ �����ϰ� ���ܰ� �߻��ߴ� ���ߴ� ������� ������ ����
			System.out.println("������ ���� �Ǿ����ϴ�.");
		}
		String str =null;
		try {
			System.out.println(str.toString());
		}catch(Exception e ) {
			System.out.println("���� �����ϴ�.");
		}finally {
			System.out.println("�� ����� ���� �Ǿ����ϴ�.");
		}
		}
}
