package day01;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * �жϵ�ǰ�ַ�������ָ���ַ�����ʼ�������
 * @author adminitartor
 *
 */
public class String_startsWith_endsWith {
	public static void main(String[] args) {
		String str = "thinking in java";		
		boolean starts = str.startsWith("thi");
		System.out.println("starts:"+starts);		
		boolean ends = str.endsWith("va");
		System.out.println("ends:"+ends);
	}
}


