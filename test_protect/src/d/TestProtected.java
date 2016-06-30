package d;

import a.A;
import a.A2;

/**
 * @author 作者 cp
 * @date 创建时间 2016年6月30日 上午10:34:03
 * @version
 * @parameter
 * @return
 **/
public class TestProtected extends A2 {
	int num, num3;

	public void eat() {
		num = num + 1;
		num3 = num3 + 3;
		System.out.println("num =" + num + "  num2=" + num3);

	}
	
	void go(){
		A a = new A2();
		A a1 =new A();
	
		a.eat();	//子类的方法
		a1.eat();	//子类的方法
		System.out.println(a.num3);  //父类的num3
		System.out.println(a1.num3);//父类的num3
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProtected testProtected = new TestProtected();
		testProtected.eat();
		testProtected.num = 6;
		testProtected.num3 = 6;
		A a = new A();
		A2 a2 = new A2();
		a.num3 = 4;
		a.eat();
		a2.num3 = 5;
		a2.eat();
		testProtected.go();
	}

}
