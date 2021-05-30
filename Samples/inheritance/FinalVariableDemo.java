package com.onebill.corejava.basics.inheritance;

class ErrorMsg {
	//Error Codes
	//final variables - names constants/upper-case letters
	final int OUTERR = 0; // reassign is an error
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	
	String[] msgs = {"Output Error", "Input Error", "Disk Error", "Index Error"};
	
	String getErrorMsg(int i) {
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid Code";
	}
}

public class FinalVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErrorMsg errorMsg = new ErrorMsg();
		System.out.println(errorMsg.getErrorMsg(0));

	}

}
