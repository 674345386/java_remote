package d;

/**
 *@author 	����    cp
 *@date 	����ʱ��	  2016��6��30�� 	����11:23:51
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
    animals.eat();                 // Animal animals =new Dog(),����Ӧ�����ͣ��������  
    System.out.println(animals.i);  
                  }  
  
      
  
//�ڲ���  
 class Animal  {  
            int i=10;             //�����i  
        void eat() {  
            System.out.println("animal are eating");  
                   }  
           }  
  
 class Dog extends Animal {  
        int i=100;            //�����i  
        void eat() {  
            System.out.println("dogs are eating");  
                   }  
  
 }
 }