package ex03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam1 {
	public static void main(String[] args) {
		Date now = new Date();
		String nowDate1 = now.toString();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss�� E����");
		String nowDate = sdf.format(now);
		System.out.println(nowDate);
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		nowDate = sdf.format(now);
		System.out.println(nowDate);
		
		//G : AD , BC ���
		//y : �⵵ 
		//M : ��
		//d : ��
		//E : ����
		//h : 1~12 ��
		//H : 0~23 ��
		//m : ��
		//s : ��
		//a : ���� /����
		//z : Ÿ����
	}
}
