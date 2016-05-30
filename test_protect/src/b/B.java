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
		
		
	}


}
