package d;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *@author 	����    cp
 *@date 	����ʱ��	  2016��7��1�� 	����10:27:54
 *@version
 *@parameter
 *@return
 **/
public class SensitiveWord {

	
//	private HashMap sensitiveHashMap;
	
	private void consSensitiveHashMap(HashSet<String> wordsSet){
		
		Map sensitiveHashMap = new HashMap(wordsSet.size());
		
		Map nowMap = null;
		Map  temhashmap=null;
		String key=null;
		
		Iterator<String> iterator = wordsSet.iterator();
		
		while (iterator.hasNext()){
			nowMap = sensitiveHashMap;	//��ǰ�����map
			key = iterator.next();
			
			for (int i= 0;i<key.length();i++) {  //����ÿ���ʵ�ÿ����
				char oneWord_char = key.charAt(i);
				
				Object wordMap = nowMap.get(oneWord_char);//���ҵ�ǰmap�����Ƿ��е�ǰ����
				//���У����Ӧ��value(��Ӧ��hash��)��wordMap
				
				if(wordMap!=null){		// �����������
					nowMap = (Map) wordMap;
				}
				else {
					 temhashmap =new HashMap<String,String>(); 
					temhashmap.put("isEnd", "0");//һ�㲻�����һ���֣�isEnd=0,����������ּ��
					
					if(i==key.length()-1){	//�������Ǵ�������һ���֣��򸲸��޸�isEnd=1
						temhashmap.put("isEnd", "1");
					}
					nowMap.put(oneWord_char, temhashmap);
					nowMap = temhashmap;
					
				}
				
				
				
			}
		}
		
//		System.out.println(sensitiveHashMap.get("��"));
		
		Iterator iterator2 = sensitiveHashMap.entrySet().iterator();
//		Iterator iterator3 = sensitiveHashMap.keySet().iterator();
		while(iterator2.hasNext()){
			Map.Entry  entry =(Entry) iterator2.next();
			System.out.println(entry.getKey());
//			Object keyObject =iterator2.next();
//			System.out.println(keyObject);
//			System.out.println(sensitiveHashMap.get(keyObject));
		}
			
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> wordList = new HashSet<String>();
		wordList.add("�й���");
		wordList.add("�й�����");
		wordList.add("�ձ���");
		wordList.add("�ձ�����");
		
		SensitiveWord sensitiveWord =new SensitiveWord();
		sensitiveWord.consSensitiveHashMap(wordList);
		System.out.println();
		
		
		
	}

}
