package net.tehnickaskola;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

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
	  /**
	  GridView gridview = (GridView) findViewById(R.id.gridview);
		gridview.setAdapter(new ImageAdapter(this));
		
		gridview.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	            Toast.makeText(MenuActivity.this, "" + position, Toast.LENGTH_SHORT).show();
			   }
	    });*/
}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
			
	}	
}
