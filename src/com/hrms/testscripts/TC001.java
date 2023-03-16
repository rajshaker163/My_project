package com.hrms.testscripts;

import com.hrms.lib.Manu;

public class TC001 extends Manu {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		Manu m1=new Manu();
		m1.open();
		m1.Login();
		m1.EnterFrames();
	    Thread.sleep(3000);
		m1.search();
		Thread.sleep(3000);
		m1.Add();
		Thread.sleep(3000);
		m1.save();
		Thread.sleep(3000);
		m1.ExitFrames();
		Thread.sleep(3000);
		m1.Logout();
		m1.close();
		
		
	}

}
