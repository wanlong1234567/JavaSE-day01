package day01;
/**
 * char charAt(int index)
 * ���ص�ǰ�ַ����и���λ�õ��ַ�
 * @author adminitartor
 *
 */
public class String_charAt {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";		
		char c = str.charAt(9);
		System.out.println(c);				
		/*
		 * ������
		 * �Ϻ�����ˮ���Ժ���
		 */
		str = "�Ϻ�����ˮ��������";
		for(int i =0;i<str.length()/2;i++){
			if(
				str.charAt(i) !=
				str.charAt(str.length()-1-i)
			){
				System.out.println("���ǻ���");
				return;//��������
			}
		}
		System.out.println("�ǻ���");
		
	}
}








