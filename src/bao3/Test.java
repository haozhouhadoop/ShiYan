package bao3;

import bao2.AAAA;
import XiangShangZhuanXing.Outer;

public class Test extends Outer{

	 public AAAA  getAAAA(){
		 return  new Inner();
	 }
	 public static void main(String[] args) {
			Test t=new Test();
			t.getAAAA();
//			Outer outer=new Outer();
			
//			t.getAAAA();
//			System.out.println(t.getAAAA());

		}

}
