package d;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *@author 	作者    cp
 *@date 	创建时间	  2016年7月1日 	上午10:27:54
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
			nowMap = sensitiveHashMap;	//当前处理的map
			key = iterator.next();
			
			for (int i= 0;i<key.length();i++) {  //遍历每个词的每个字
				char oneWord_char = key.charAt(i);
				
				Object wordMap = nowMap.get(oneWord_char);//查找当前map，看是否有当前的字
				//若有，则对应的value(对应的hash树)给wordMap
				
				if(wordMap!=null){		// 存在有这个字
					nowMap = (Map) wordMap;
				}
				else {
					 temhashmap =new HashMap<String,String>(); 
					temhashmap.put("isEnd", "0");//一般不是最后一个字，isEnd=0,下面做最后字检测
					
					if(i==key.length()-1){	//若该字是词语的最后一个字，则覆盖修改isEnd=1
						temhashmap.put("isEnd", "1");
					}
					nowMap.put(oneWord_char, temhashmap);
					nowMap = temhashmap;
					
				}
				
				
				
			}
		}
		
//		System.out.println(sensitiveHashMap.get("中"));
		
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
		wordList.add("中国人");
		wordList.add("中国人民");
		wordList.add("日本人");
		wordList.add("日本鬼子");
		
		SensitiveWord sensitiveWord =new SensitiveWord();
		sensitiveWord.consSensitiveHashMap(wordList);
		System.out.println();
		
		
		
	}

}
