package d;

import java.util.Arrays;


/**
 * @author ���� cp
 * @date ����ʱ�� 2016��5��26�� ����3:20:33
 * @version
 * @parameter
 * @return
 **/
public class Test {

	char b;
	char a;
	static String str = "523";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b = 0;
		char a = '0';
		System.out.println(b + 5); // ���Զ�ת�� int
		System.out.printf("%c", b + 5);
		
		int[] c = { 5, 4, 10, 3 };
		Arrays.sort(c);
		for (int i : c) {
			System.out.println(i);
			
		}

		for (int j = 0; j < 3; j++) {
			System.out.println(c[j]);
		}
		byte a1 = 47;
		byte b1 = 35;

		// byte c1 =a1+b1; ����a1+b1����ת��int ��

	}

}
