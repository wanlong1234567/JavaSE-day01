package day01;
/**
 * int indexOf(String str)
 * ���ظ����ַ����ڵ�ǰ�ַ����е�λ�ã�����ǰ
 * �ַ��������и����ַ�������ʱ����ֵΪ-1
 * @author adminitartor
 *
 */
public class String_indexOf {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println("index:"+index);
		
		index = str.indexOf("in", 3);
		System.out.println("index:"+index);
		
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
		
	}
}




