package net.tehnickaskola;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		
		
	Button ok = (Button) findViewById(R.id.button1);
	  
	  ok.setOnClickListener(new OnClickListener() {
	   
	   public void onClick(View v) {
	    // TODO Auto-generated method stub
	    Intent intent = new Intent(SplashActivity.this, MenuActivity.class);
	    startActivity(intent);
	   }
	  });
	  
	  
}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
			
	}	
}
