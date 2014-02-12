package net.tehnickaskola;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class KalendarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kalendar);
		
		GridView gridview1 = (GridView) findViewById(R.id.gridview1);
		gridview1.setAdapter(new ImageAdapter(this));
		
ListView listView4 = (ListView) findViewById(R.id.listView4);
        
        String[] items = { "marmun", "matematika", "informejön" , "ses" , "déubre" };
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);
        
        listView4.setAdapter(adapter);
    }
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kalendar, menu);
		return true;
	}

}
