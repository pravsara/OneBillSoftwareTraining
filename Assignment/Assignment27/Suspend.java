package com.onebill.corejava.basics.Assignment27;

public class Suspend extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<6; i++)  
        {    
            try  
            {  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){
            	System.out.println(e);
            	}    
            System.out.println(i);    
        }    
    }    
    @SuppressWarnings("deprecation")
	public static void main(String args[])  
    { 
    	Suspend t1=new Suspend ();    
        Suspend t2=new Suspend ();   
        Suspend t3=new Suspend ();
        t1.start(); //start  
        t2.start(); 
        t1.stop();	//kill
        t2.suspend();  //wait
        t3.start();  
        t2.resume();
    }    
}  
