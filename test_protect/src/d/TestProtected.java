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

private void addSensitiveWordToHashMap(Set<String> keyWordSet) {
    sensitiveWordMap = new HashMap(keyWordSet.size());     //初始化敏感词容器，减少扩容操作
    String key = null;  
    
    Map nowMap = null;
    Map<String, String> newWorMap = null;
    
    //迭代keyWordSet
    Iterator<String> iterator = keyWordSet.iterator();
    
    while(iterator.hasNext()){
        key = iterator.next();    //关键字
        
        nowMap = sensitiveWordMap;
        for(int i = 0 ; i < key.length() ; i++){
            char keyChar = key.charAt(i);       //转换成char型
            Object wordMap = nowMap.get(keyChar);       //获取
            
            if(wordMap != null){        //如果存在该key，直接赋值
                nowMap = (Map) wordMap;
            }
            else{     //不存在则，则构建一个map，同时将isEnd设置为0，因为他不是最后一个
                newWorMap = new HashMap<String,String>();
                newWorMap.put("isEnd", "0");     //不是最后一个
                nowMap.put(keyChar, newWorMap);
                nowMap = newWorMap;
            }
            
            if(i == key.length() - 1){
                nowMap.put("isEnd", "1");    //最后一个
            }
        }
    }
}
