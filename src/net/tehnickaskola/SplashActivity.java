package net.tehnickaskola;



import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
/**
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
*/


public class SplashActivity extends Activity {

	final Context context = this;

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
                

            	   // custom dialog
            	  final Dialog dialog = new Dialog(context);
            	   dialog.setContentView(R.layout.dialog);
            	   dialog.setTitle("Odaberi smjer i razred");
            	   
            	   Button ok = (Button) dialog.findViewById(R.id.button1);
         		  
         		  ok.setOnClickListener(new OnClickListener() {
         		   
         		   public void onClick(View v) {
         		    // TODO Auto-generated method stub
         		    Intent intent = new Intent(SplashActivity.this, MenuActivity.class);
         		    startActivity(intent);
         		   finish();
         		   }
         		  });
            	 
            	   dialog.show();
            	   
            	   
 
                
                
            }
        }, SPLASH_TIME_OUT);
		
	  
}
	

	
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
			
	}	
}
		