package ex01;

public class Student {
	public String name;
	 int kor;
	 int eng;
	 int math;
		//public : ��ü�� ���� = > ��ü�� �������� ���� �а� ���� ����
		//default : ���������ڸ� ������� ���� => ���� ��Ű�� �ȿ�����;
	 	//protected : ���� ��Ű������ ��ӹ��� �ڽ� Ŭ�������� ���� �а� ����  => ��� �Ҷ� �缳��
	 	//private : Ŭ���� ���ο����� ���� �а� ���Ⱑ ����
	 
	 
	 
	 //�޼ҵ� : ���������� ����ڷ��� �޼ҵ�� (���ڰ�)
	 //��� �ڷ��� : �޼ҵ尡 ������ ������ �ڷ����� ����(int double String ��ü void ... )
	 //�޼ҵ�� : ó�������� �ҹ��� �߰��� �ܾ� �����Ҷ� ù���ڴ� �빮�� ���
	 //���ڰ� : �޼ҵ带 ȣ���� ����� �������ִ� �� (int double String ��ü void ... )
	 public int scoreSum() {
		 int sum = kor+eng+math;
		 return sum;
	 }
	 public double ScoreAvg(int sum) {
		 return sum/3.0;
	 }
}
