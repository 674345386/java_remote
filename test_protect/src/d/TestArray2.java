package d;

import c.abc;




/**
 * @author ���� cp
 * @date ����ʱ�� 2016��6��29�� ����4:26:08
 * @version
 * @parameter
 * @return
 **/
public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate[] myDate =new MyDate[3];
		
//		for (MyDate eachManDate : myDate) {
//			eachManDate = new MyDate(d, m, y)
//		}
		
		for (int i = 0; i < myDate.length; i++) {
			myDate[i] = new MyDate(i+1, i+1, 1990+i);
			myDate[i].display();
		}
		
//  ���ָ�ֵ
		int[] b={1,2,3};
//		int[] b;   ����������̬��ֵ
//		b={1,2,3}
		
		int[] a=new int[3];
		a = new int[]{1,2,3,5};//a ָ���˲�ͬ���������
//		a =new int[5][1,2,3,4,5]��//���ܶ���5��Cannot define dimension expressions when an array initializer is provided
	}


}

class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d ,int m, int y){
		day=d;
		month=m;
		year=y;
	}

	void display(){
		System.out.println(year+" "+month+ "  "+day);
	}
}



