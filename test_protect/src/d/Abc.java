package d;

import c.abc;

/**
 *@author 	作者    cp
 *@date 	创建时间	  2016年7月1日 	下午5:05:10
 *@version
 *@parameter
 *@return
 **/
public class Abc {
	private int h;
	
	void setH(){
		h=5;
		System.out.println(h);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Abc().setH();
	}

}
