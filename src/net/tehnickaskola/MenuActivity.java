package net.tehnickaskola;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;


public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	
		GridView gridview = (GridView) findViewById(R.id.gridview);
		gridview.setAdapter(new ImageAdapter(this));
		
		gridview.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				switch(position){
				case 0:                 
					startActivity(new Intent(MenuActivity.this, KalendarActivity.class));            
	                        break;                    
	                case 1:                   
	                	startActivity(new Intent(MenuActivity.this, ObavijestiActivity.class));  
	                                  break;    

	                case 2: 
	                	startActivity(new Intent(MenuActivity.this,RasporedActivity.class));
	                break;
	                
	                case 3: 
		                startActivity(new Intent(MenuActivity.this,TestoviActivity.class));
		                break;
				} 


	        }     
	    }); 
	   }   

	
				
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.menu, menu);
			return true;
		}

	}
    
