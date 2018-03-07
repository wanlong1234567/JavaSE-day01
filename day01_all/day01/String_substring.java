package day01;
/**
 * String substring(int start,int end)
 * ��ȡ��ǰ�ַ�����ָ����Χ�ڵ��ַ���
 * 
 * @author adminitartor
 *
 */
public class String_substring {
	public static void main(String[] args) {
		//            01234567890123
		String str = "www.oracle.com";
		/*
		 * java API��һ���ص㣬ͨ������������
		 * ��ʾ��Χʱ������"��ͷ����β"��.
		 */
		String sub = str.substring(4,10);
		System.out.println(sub);
		
		String name = getHostName("www.baidu.com");
		System.out.println(name);//baidu
		name = getHostName("http://www.tedu.com.cn");
		System.out.println(name);//tedu
	}
	
	/**
	 * ���������ĵ�ַ����ȡ���е�����������
	 * @param str
	 * @return
	 */
	public static String getHostName(String str){
		//���ҵ�һ��"."֮���һ���ַ���λ��
		int start = str.indexOf(".")+1;
		//���ҵڶ���"."��λ��
		int end = str.indexOf(".",start);
		return str.substring(start,end);
	}
}














