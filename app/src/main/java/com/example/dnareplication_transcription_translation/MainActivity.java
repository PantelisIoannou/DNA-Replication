package com.example.dnareplication_transcription_translation;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	MediaPlayer clip;
	Button A;
	Button G;
	Button C;
	Button T;
	Button clear;
	Button delete;
	Button enter;
	Button Return;
	TextView instructions;
	TextView seq;
    public String memory="";
	int counter=-1;
	TextView rep;
	TextView transc;
	TextView transl;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		A = (Button) findViewById(R.id.bA);
		G = (Button) findViewById(R.id.bG);
		C = (Button) findViewById(R.id.bC);
		T = (Button) findViewById(R.id.bT);
		clear = (Button) findViewById(R.id.bClear);
		delete = (Button)findViewById(R.id.bDelete); 
		enter = (Button) findViewById(R.id.bEnter); 
		instructions = (TextView) findViewById(R.id.textView1);
		seq = (TextView) findViewById(R.id.editText1);
		
		
        
		A.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			 seq.setText(seq.getText()+"A");
			 memory+="A";
			 counter++;
			 if((counter+1)%3==0){
			   seq.setText(seq.getText()+"  ");
			 }
			}
		});
		
		A.setLongClickable(true);
		A.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
			 	
			  if(memory.length()%3==0 && memory.length()!=0){ 	
			     seq.setText(seq.getText()+"AAA  ");
			  }
			  else if(memory.length()%3==1 && memory.length()!=1){
				 seq.setText(seq.getText()+"AA  A");
			  }
			  else if(memory.length()%3==2 && memory.length()!=2){
				 seq.setText(seq.getText()+"A  AA");
			  }
			  else if(memory.length()==0){
				 seq.setText(seq.getText()+"AAA  ");
			  }
			  else if(memory.length()==1){
				 seq.setText(seq.getText()+"AA  A");
			  }
			  else if(memory.length()==2){
				 seq.setText(seq.getText()+"A  AA");
			  } 
			  counter+=3;
			  memory+="AAA";
			  return true;	
			}
		});
		
		
		
        G.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub	
			 seq.setText(seq.getText()+"G");
			 memory+="G";
			 counter++;
			 if((counter+1)%3==0){
			   seq.setText(seq.getText()+"  ");
			 }
			}
		});
		
        
        G.setLongClickable(true);
		G.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				
			  if(memory.length()%3==0 && memory.length()!=0){ 	
			     seq.setText(seq.getText()+"GGG  ");
			  }
			  else if(memory.length()%3==1 && memory.length()!=1){
				 seq.setText(seq.getText()+"GG  G");
			  }
			  else if(memory.length()%3==2 && memory.length()!=2){
				 seq.setText(seq.getText()+"G  GG");
			  }
			  else if(memory.length()==0){
				 seq.setText(seq.getText()+"GGG  ");
			  }
			  else if(memory.length()==1){
				 seq.setText(seq.getText()+"GG  G");
			  }
			  else if(memory.length()==2){
				 seq.setText(seq.getText()+"G  GG");
			  }
			  
			  counter+=3;
			  memory+="GGG";
			  return true;	
			}
		});
        
        
        
        
        
        C.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub	
			 seq.setText(seq.getText()+"C");
			 memory+="C";
			 counter++;
			 if((counter+1)%3==0){
			  seq.setText(seq.getText()+"  ");
			 }
			}
		});
        
        
        C.setLongClickable(true);
		C.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				
			  if(memory.length()%3==0 && memory.length()!=0){ 	
			     seq.setText(seq.getText()+"CCC  ");
			  }
			  else if(memory.length()%3==1 && memory.length()!=1){
				 seq.setText(seq.getText()+"CC  C");
			  }
			  else if(memory.length()%3==2 && memory.length()!=2){
				 seq.setText(seq.getText()+"C  CC"); 
			  }
			  else if(memory.length()==0){
				 seq.setText(seq.getText()+"CCC  ");
			  }
			  else if(memory.length()==1){
				 seq.setText(seq.getText()+"CC  C");
			  }
			  else if(memory.length()==2){
				 seq.setText(seq.getText()+"C  CC");
			  }
			  
			  counter+=3;
			  memory+="CCC";
			  return true;	
			}
		});
        
        
        
        
        
        T.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub	
			 seq.setText(seq.getText()+"T");
			 memory+="T";
			 counter++;
			 if((counter+1)%3==0){
			   seq.setText(seq.getText()+"  ");
			 }
			}
		});
        
        
        T.setLongClickable(true);
		T.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				
			  if(memory.length()%3==0 && memory.length()!=0){ 	
			     seq.setText(seq.getText()+"TTT  ");
			  }
			  else if(memory.length()%3==1 && memory.length()!=1){
				 seq.setText(seq.getText()+"TT  T");
			  }
			  else if(memory.length()%3==2 && memory.length()!=2){
				 seq.setText(seq.getText()+"T  TT");
			  }
			  else if(memory.length()==0){
				 seq.setText(seq.getText()+"TTT  ");
			  }
			  else if(memory.length()==1){
				 seq.setText(seq.getText()+"TT  T");
			  }
			  else if(memory.length()==2){
				 seq.setText(seq.getText()+"T  TT");
			  }
			  
			  counter+=3;
			  memory+="TTT";
			  return true;	
			}
		});
        
        
        
        
        clear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			 seq.setText("");
			 memory="";
			 counter=-1;
			}
		});
        
        delete.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			 if(counter>=0){
		       String newStr="";
			   newStr+=memory.substring(0,counter);  
			   memory=newStr;
			   
			   
			   
			   
			   
			   
			   
			   String s = seq.getText().toString();
			   
			   if(s.length()%3==1 && s.charAt(s.length()-2)==' ' && s.length()!=1 || s.charAt(s.length()-1)==' '){
				  if(s.charAt(s.length()-1)==' '){
				   seq.setText(s.substring(0,s.length()-3));
				   counter--;	 
				  }
				  else{ 
			        seq.setText(s.substring(0,s.length()-1));
			        counter--;
				  }   
			   }
			   else{
			    seq.setText(s.substring(0,s.length()-1));
			    counter--;   
			   }
			   
			   
			   
			   
			   
			   
			   
			   
			 }
			}
		});
        
        enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(counter>=0){
				clip=MediaPlayer.create(MainActivity.this,R.raw.entered);
				clip.start();
				
				
				setContentView(R.layout.results);
				Return = (Button)findViewById(R.id.bReturn);
				Return.setOnClickListener(new View.OnClickListener() {
					
					
					
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
					 Intent restart = new Intent("com.Example.MainActivity");
					 startActivity(restart);	
					}
				});
				rep = (TextView) findViewById(R.id.replication);
				transc = (TextView) findViewById(R.id.transcription);
				transl = (TextView) findViewById(R.id.translation);
				
				String temp3="";
				String temp2="";
				for(int i=0;i<memory.length();i++){
				 if(memory.charAt(i)=='A'){	
				   temp3+="T";
				 }
				 if(memory.charAt(i)=='G'){	
				   temp3+="C";
				 }	 
				 if(memory.charAt(i)=='C'){	
					   temp3+="G";
				 }
				 if(memory.charAt(i)=='T'){	
					   temp3+="A";
				 }
				 if((i+1)%3==0){
				   temp3+="  ";	 
				 }
				}
				rep.setText(rep.getText()+"  "+temp3);
				
				temp3="";
				for(int j=0;j<memory.length();j++){
				   if(memory.charAt(j)=='A'){	
					   temp3+="U";
					   temp2+="U";
				   }
				   if(memory.charAt(j)=='G'){	
				     temp3+="C";
				     temp2+="C";
				   }	 
				   if(memory.charAt(j)=='C'){	
				  	   temp3+="G";
				  	   temp2+="G";
				   }
				   if(memory.charAt(j)=='T'){	
				  	   temp3+="A";
				  	   temp2+="A";
				   }
				   if((j+1)%3==0){	 
					 temp3+="  ";  
				   }
				}
				transc.setText(transc.getText()+"  "+temp3);
			   if(temp3.length()>=3){
				transl.setText(transl.getText()+"  ");   
				for(int k=0;k<temp2.length();k+=3){
				  if(k+2<temp2.length()){ 	
			       String codon = temp2.substring(k,k+3);
			       if(codon.charAt(0)=='U'){
			    	 if(codon.charAt(1)=='U'){  
			    	   if(codon.charAt(2)=='U' || codon.charAt(2)=='C'){	 
			    		 transl.setText(transl.getText()+"phe -- ");
			    		 continue;
			    	   }
			    	   else{	
			    		 transl.setText(transl.getText()+"leu -- ");
			    		 continue;
			    	   }   
			    	 }   
			    	 else if(codon.charAt(1)=='C'){  
			    		 transl.setText(transl.getText()+"ser -- ");
			    		 continue;
			    	 }
			    	 else if(codon.charAt(1)=='A'){ 
			    		 if(codon.charAt(2)=='U' || codon.charAt(2)=='C'){
			    		   transl.setText(transl.getText()+"tyr -- ");
			    		   continue;
			    		 }
			    		 else{
			    		   transl.setText(transl.getText()+"termination -- ");
			    		   continue;
			    		 }	 
			    	 }
			    	 else{
			    		 if(codon.charAt(2)=='U' || codon.charAt(2)=='C'){
			    			 transl.setText(transl.getText()+"cys -- ");
			    			 continue;
			    		 }
			    		 else if(codon.charAt(2)=='A'){ 
			    			 transl.setText(transl.getText()+"termination -- ");
			    			 continue;
			    		 }
			    		 else{
			    			 transl.setText(transl.getText()+"trp -- ");
			    			 continue;
			    		 }	 
			    	 }	 
			       }
			       else if(codon.charAt(0)=='C'){
                         if(codon.charAt(1)=='U'){    			    	   
                            transl.setText(transl.getText()+"leu -- ");
                            continue;
                         }
                         else if(codon.charAt(1)=='C'){
                            transl.setText(transl.getText()+"pro -- ");
                            continue;
                         }
                         else if(codon.charAt(1)=='A'){
                        	if(codon.charAt(2)=='U' || codon.charAt(2)=='C'){ 
                        	  transl.setText(transl.getText()+"his -- ");
                        	  continue;
                        	}
                        	else{ 
                        	  transl.setText(transl.getText()+"glin -- ");
                        	  continue;
                        	}	 
                         }
                         else{
                        	 transl.setText(transl.getText()+"arg -- ");
                        	 continue;
                         }        	 
			       }
			       else if(codon.charAt(0)=='A'){
			    	     if(codon.charAt(1)=='U'){
			    	       if(codon.charAt(2)=='G'){
			    	    	 transl.setText(transl.getText()+"met(also the start of every sequence) -- ");
			    	    	 continue;
			    	       }
			    	       else{
			    	    	 transl.setText(transl.getText()+"ile -- ");
			    	    	 continue;
			    	       }   	 
			    	     }
			    	     else if(codon.charAt(1)=='C'){
			    	    	 transl.setText(transl.getText()+"thr -- ");
			    	    	 continue;
			    	     }
			    	     else if(codon.charAt(1)=='A'){
			    	      	 if(codon.charAt(2)=='U' || codon.charAt(2)=='C'){
			    	      	   transl.setText(transl.getText()+"asn -- ");
			    	      	   continue;
			    	      	 }
			    	      	 else{
			    	      		transl.setText(transl.getText()+"lys -- ");
			    	      		continue;
			    	      	 } 	 
			    	     }
			    	     else{
			    	    	 if(codon.charAt(2)=='U' || codon.charAt(2)=='C'){
			    	    	   transl.setText(transl.getText()+"ser -- ");
			    	    	   continue;
			    	    	 }
			    	    	 else{
			    	    	   transl.setText(transl.getText()+"arg -- ");
			    	    	   continue;
			    	    	 }
			    	     }	   
			       }
			       else{
			    	   if(codon.charAt(1)=='U'){
			    		 transl.setText(transl.getText()+"val -- "); 
			    		 continue;
			    	   }
			    	   else if(codon.charAt(1)=='C'){
			    		   transl.setText(transl.getText()+"ala -- ");
			    		   continue;
			    	   }
			    	   else if(codon.charAt(1)=='A'){
			    		   if(codon.charAt(2)=='U' || codon.charAt(2)=='C'){
			    			 transl.setText(transl.getText()+"asp -- ");
			    			 continue;
                           }
			    		   else{
			    			   transl.setText(transl.getText()+"glu -- ");
			    			   continue;
			    		   }		   
			    	   }
			    	   else{
			    		   transl.setText(transl.getText()+"gly -- ");
			    		   continue;
			    	   }   
			       }
			       
				 }
				  
			  }
			}
			else{   
			 transl.setText(transl.getText()+"In order to produce one aminoacid you need 3 nitrogenous bases");	
			}   
		   }
		   else{
			 Toast.makeText(getApplicationContext(),"No data entered",Toast.LENGTH_SHORT).show();	 	
		   }
		  }	
		});
            
     
	}
    
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
    
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
