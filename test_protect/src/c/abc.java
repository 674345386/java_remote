package c;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 *@author 	作者    cp
 *@date 	创建时间	  2016年5月13日 	下午9:24:37
 *@version
 *@parameter
 *@return
 **/
public class abc {
		
		
		int a;
		String name;
		int age;
		
		void print_a(){
			int c = 0;
			Scanner s = new Scanner(System.in);
			System.out.println("输入姓名");
			name = s.next();
			System.out.println("输入年龄");
			age = s.nextInt();
			
			System.out.println(name);
			System.out.println(age);
		}
		
//		void print_b(){
//			System.out.println("this is function print_b");
//		}
	
	public static void main(String[] args){
		int num[]={5,2,0,1,3,1,4};
		ExecutorService singExecutorService =Executors.newSingleThreadExecutor();
//		for ( int i=0;i<7;i++){
//			final int num_index = i;
//			singExecutorService.execute(new Runnable() {
//				
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					try {
//						System.out.println(num[num_index]/0.0);
//						abc abc_= new abc();
//						System.out.println(abc_.hashCode());
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//			});
//		}
		abc abc_ =new abc();
		abc_.print_a();

	}

}
