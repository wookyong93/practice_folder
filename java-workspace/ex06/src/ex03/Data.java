package ex03;

public class Data {
	private String name;
	private int age;
	
	Data(){
		//������ : ���� �� �� ����Ǵ� �޼���
		//���� ���� : ��� ��ü�� ������ ����
		//default ������
		this.name = "ȫ�浿";
		this.age =33; 
	}
	Data(String name){
		this.name =name;
	}
	Data(int age){
		this.age =age;
	}
	
	Data(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
}
