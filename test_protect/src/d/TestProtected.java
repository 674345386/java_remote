package d;

import a.A;
import a.A2;

/**
 * @author ���� cp
 * @date ����ʱ�� 2016��6��30�� ����10:34:03
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
	
		a.eat();	//����ķ���
		a1.eat();	//����ķ���
		System.out.println(a.num3);  //�����num3
		System.out.println(a1.num3);//�����num3
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
    sensitiveWordMap = new HashMap(keyWordSet.size());     //��ʼ�����д��������������ݲ���
    String key = null;  
    
    Map nowMap = null;
    Map<String, String> newWorMap = null;
    
    //����keyWordSet
    Iterator<String> iterator = keyWordSet.iterator();
    
    while(iterator.hasNext()){
        key = iterator.next();    //�ؼ���
        
        nowMap = sensitiveWordMap;
        for(int i = 0 ; i < key.length() ; i++){
            char keyChar = key.charAt(i);       //ת����char��
            Object wordMap = nowMap.get(keyChar);       //��ȡ
            
            if(wordMap != null){        //������ڸ�key��ֱ�Ӹ�ֵ
                nowMap = (Map) wordMap;
            }
            else{     //���������򹹽�һ��map��ͬʱ��isEnd����Ϊ0����Ϊ���������һ��
                newWorMap = new HashMap<String,String>();
                newWorMap.put("isEnd", "0");     //�������һ��
                nowMap.put(keyChar, newWorMap);
                nowMap = newWorMap;
            }
            
            if(i == key.length() - 1){
                nowMap.put("isEnd", "1");    //���һ��
            }
        }
    }
}
