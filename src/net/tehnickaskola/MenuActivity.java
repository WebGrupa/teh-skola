package net.tehnickaskola;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); 
		setContentView(R.layout.activity_menu);
				 

	Button raspored = (Button) findViewById(R.id.button2);
	  
	  raspored.setOnClickListener(new OnClickListener() {
	   
	   public void onClick(View v) {
	    // TODO Auto-generated method stub
	    Intent intent = new Intent(MenuActivity.this, KalendarActivity.class);
	    startActivity(intent);
	   
	   }
	  });
 
Button kalendar = (Button) findViewById(R.id.button3);
	  
	  kalendar.setOnClickListener(new OnClickListener() {
	   
	   public void onClick(View v) {
	    // TODO Auto-generated method stub
	    Intent intent = new Intent(MenuActivity.this, RasporedActivity.class);
	    startActivity(intent);
	   
	   }
	  });
	  
Button testovi = (Button) findViewById(R.id.button4);
	  
	  testovi.setOnClickListener(new OnClickListener() {
	   
	   public void onClick(View v) {
	    // TODO Auto-generated method stub
	    Intent intent = new Intent(MenuActivity.this, TestoviActivity.class);
	    startActivity(intent);
	   
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
    
