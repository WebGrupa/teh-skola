package net.tehnickaskola;



import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
/**
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
*/


public class SplashActivity extends Activity {

	 private static int SPLASH_TIME_OUT = 3000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);    // Removes title bar
	      this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); 
		setContentView(R.layout.activity_splash);
		
		new Handler().postDelayed(new Runnable() {
			 
            
 
            @Override
            public void run() {
                
                Intent i = new Intent(SplashActivity.this, MenuActivity.class);
                startActivity(i);
 
                
                finish();
            }
        }, SPLASH_TIME_OUT);
		
	/**	
	Button ok = (Button) findViewById(R.id.button1);
	  
	  ok.setOnClickListener(new OnClickListener() {
	   
	   public void onClick(View v) {
	    // TODO Auto-generated method stub
	    Intent intent = new Intent(SplashActivity.this, MenuActivity.class);
	    startActivity(intent);
	   }
	  });
	  */
	  
}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
			
	}	
}
		