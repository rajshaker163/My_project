package com.hrms.testscripts;

import com.hrms.lib.Manu;

public class TC002 extends Manu {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Manu m1=new Manu();
		m1.open();
		m1.Login();
		m1.EnterFrames();
	   Thread.sleep(3000);
		m1.search();
		Thread.sleep(3000);
		m1.searchfor();
		Thread.sleep(3000);
		m1.searchbtn();
		Thread.sleep(3000);
		m1.radiobtn();
		Thread.sleep(3000);
		m1.Delete();
		Thread.sleep(3000);
		m1.ExitFrames();
		m1.Logout();
	}

}
