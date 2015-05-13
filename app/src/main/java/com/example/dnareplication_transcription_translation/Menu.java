package com.example.dnareplication_transcription_translation;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity{

  Button help;	
  Button start;
  boolean h=false;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.starting_point);
		help = (Button)findViewById(R.id.button1);
		start = (Button)findViewById(R.id.button2);
		
		
		
		
		start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		     Intent open = new Intent("com.Example.MainActivity");
		     startActivity(open);
			}
		});
		
		help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			setContentView(R.layout.genetic_code);
			h=true;	    
			}
		});
		
		
		
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if(h==true){
		 Intent openApp = new Intent("com.Exmple.Menu");
		 startActivity(openApp);
		 h=false;
		}
	}

	
	
	
}
