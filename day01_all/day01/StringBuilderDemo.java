package day01;
/**
 * java.lang.StringBuilder
 * �ڲ�ά��һ���ɱ���ַ����飬�����ַ��������
 * ������Ƶ���޸��ַ�������(ÿ���޸����ݴ�������
 * �Ǻ������ڴ��)��StringBuilder����ά���ɱ��
 * �ַ����飬���Ի������޸��ַ���������һ���ַ�
 * ������еģ������ڴ濪��С��Ƶ���޸�ʱ���������ԡ�
 * 
 * StringBuilder�����Ŀ�ľ���Ϊ�˽���޸��ַ���
 * �����⣬�������ṩ�˺ܶ�����޸��ַ������ݵķ���
 * 
 * @author adminitartor
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "�ú�ѧϰjava";
		
		StringBuffer builder 
				= new StringBuffer(str);
		/*
		 * String append(String str)
		 * ����������׷�ӵ���ǰ�ַ���ĩβ
		 * ��ͬ��"+"������
		 * 
		 * �ú�ѧϰjava
		 *      v
		 * �ú�ѧϰjava,Ϊ���Ҹ��ù���!      
		 */
		builder.append(",Ϊ���Ҹ��ù���!");	
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * String replace(int s,int e,String str)
		 * ����ǰ�ַ�����ָ����Χ�ڵ��ַ����滻Ϊ
		 * �������ַ���
		 * 
		 * �ú�ѧϰjava,Ϊ���Ҹ��ù���! 
		 *          v
		 * �ú�ѧϰjava,����Ϊ�˸ı�����!       
		 */
		builder.replace(9, 16, "����Ϊ�˸ı�����");
		System.out.println(builder.toString());
		
		/*
		 * �ú�ѧϰjava,����Ϊ�˸ı�����!
		 *            v
		 * ,����Ϊ�˸ı�����!               
		 */
		builder.delete(0, 8);
		System.out.println(builder.toString());
		
		/*
		 * ,����Ϊ�˸ı�����!  
		 *        v
		 * ����,����Ϊ�˸ı�����!
		 */
		builder.insert(0, "����");
		System.out.println(builder.toString());
		
		
		builder.reverse();//��ת�ַ���
		System.out.println(builder.toString());
	}
}







