package day01;
/**
 * static String valueOf(XXX xxx)
 * �ַ����ṩ��һ�����ص�valueOf����������java��
 * ��ͬ���͵�����ת��Ϊ�ַ���
 * �������ǽ���������ת��Ϊ�ַ���
 * @author adminitartor
 *
 */
public class String_valueOf {
	public static void main(String[] args) {
		int d = 123;
		String str = String.valueOf(d);//"123"
		System.out.println(str+4);
		
		double dou = 123.123;
		String str2 = String.valueOf(dou);
		System.out.println(str2+4);
		
		
		str = 123+"";
	}
}








