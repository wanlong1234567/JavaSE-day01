package day01;
/**
 * �ַ���������
 * java���ַ�����һ���Ż���ʩ����:JVM�ڶ��ڴ���
 * ������һ������--�ַ��������أ�������������ͨ��
 * ��������ʽ���������ַ�������һ��ʹ����������
 * �����ַ�����������������ʱ����ֱ�����ó�������
 * �ĸö�����������´������������Ա��������ʹ��
 * ����һ�����ַ������ڴ�Ĵ���������
 * ��Ҳ��ˣ�javaҪ���ַ����ǲ�����󡣼�:�ַ���
 * ���󴴽��������ݲ��ɸı䣬�ı�һ���������ַ���
 * ����
 * @author adminitartor
 *
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = "123abc";
		String s2 = "123abc";//����s1����
		String s3 = "123abc";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		s1 = s1 + "!";//�޸����ݻᴴ���¶���
		System.out.println(s1);
		System.out.println(s2);
		//s1��������ԭ��������s1������s2���
		System.out.println(s1==s2);
		
	}
}
