package com.hrms.testscripts;

import com.hrms.lib.Manu;

public class TC003 extends Manu {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
		Manu m1=new Manu();
		
		m1.open();
		m1.Login();
		Thread.sleep(3000);
		m1.EnterFrames();
		Thread.sleep(3000);
		//m1.search();
	    m1.All();
	    Thread.sleep(3000);
		m1.Delete();
		Thread.sleep(3000);
		m1.ExitFrames();
		Thread.sleep(3000);
		m1.Logout();
		Thread.sleep(3000);
		m1.close();
	}

}
