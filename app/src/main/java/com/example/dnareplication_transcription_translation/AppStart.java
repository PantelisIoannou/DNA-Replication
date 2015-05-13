package com.example.dnareplication_transcription_translation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AppStart extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_start);
		Thread timer = new Thread(){
		 public void run(){
		  	 
		  try{
		    sleep(2000);	  
		  }
		  catch(Exception e){	 
		   e.printStackTrace();	  
		  }
		  finally{
		   Intent openApp = new Intent("com.Exmple.Menu");
		   startActivity(openApp);	    
		  }  
		 }	
		};
		timer.start();
	}
 
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}	
	
	
	
}
