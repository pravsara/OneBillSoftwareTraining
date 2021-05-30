package com.onebill.corejava.basics;

public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=false,b2=false;
		System.out.println("--------------------------------------------------------------------------------------------------------\n|\tinp_1 \t|\tinp_2\t|\tinp_1&inp_2\t|\tinp_1|inp_2\t|\tinp_1^inp_2\t|\n|---------------|---------------|-----------------------|-----------------------|-----------------------|");
		for(int i=0;i<2;i++,b1=true) {
			for(int j=0;j<2;j++,b2=true) {
				System.out.print("|\t"+b1+"\t|\t"+b2+"\t|\t     ");
				System.out.print((b1&b2?'T':'F')+"\t\t|\t     ");
				System.out.print((b1|b2?'T':'F')+"\t\t|\t     ");
				System.out.print((b1^b2?'T':'F')+"\t\t|\n");
			}
			b2=false;
		}
		System.out.println("---------------------------------------------------------------------------------------------------------");
	}

}
