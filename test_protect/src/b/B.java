package b;

import a.A;

public class B extends A{

	static void getA(){
		B b1= new B();
		b1.eat();
		b1.num=5;
		return;
	}
		
	void abc(int a){
		a=5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b =new B();
		System.out.print(b.hashCode());
		b.getA();
		A a=new A();
		System.out.print(a.hashCode());
		
//		System.out.print(a.num);
//		a.eat();
//		报错，因为父类内的 num ,eat() 为protected , 包外的子类，也不能
//		通过父类的实例来访问nun,eat();
//      如需调用，需要 另外建实例，如 B b =new B();  b.eat(); b.num,见 getA()函数
		
		
	}


}
