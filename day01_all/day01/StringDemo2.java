package day01;
/**
 * Ƶ���޸��ַ����������������
 * @author adminitartor
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {

		String str = "a";
		for(int i=0;i<10000000;i++){
			str += str;
		}
		System.out.println("���!");
		
		
	}
}
