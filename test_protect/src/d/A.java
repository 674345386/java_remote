package d;

/**
 *@author 	作者    cp
 *@date 	创建时间	  2016年6月30日 	上午11:23:51
 *@version
 *@parameter
 *@return
 **/
public class A {  
    Animal  animals = new Dog();  
    Dog  dogs =  new Dog();  
  
    public static void main(String[] args) {  
              A as =new A();  
       
              as.go2();  
                                           }  
  
      
        void go2(){  
    animals.eat();                 // Animal animals =new Dog(),父类应用类型，子类对象  
    System.out.println(animals.i);  
                  }  
  
      
  
//内部类  
 class Animal  {  
            int i=10;             //父类的i  
        void eat() {  
            System.out.println("animal are eating");  
                   }  
           }  
  
 class Dog extends Animal {  
        int i=100;            //子类的i  
        void eat() {  
            System.out.println("dogs are eating");  
                   }  
  
 }
 }