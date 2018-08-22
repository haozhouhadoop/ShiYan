package Com.Zhouhao;

import Com.Zhouhao.Dothis.Inner;

public  class DotNew {
	public   class Inner{
	}
	

	public static void main(String[] args) {
		DotNew dn=new DotNew();
		DotNew.Inner dni=dn.new Inner();//内部看得见
		
	}
	  

}

