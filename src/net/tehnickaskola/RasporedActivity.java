package net.tehnickaskola;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RasporedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_raspored);
		
ListView listView3 = (ListView) findViewById(R.id.listView3);
        
        String[] items = { "1.Hrvatski", "2.Hrvatski", "3.Matematika" , "4.Matematika" , "5.SOR" , "6.SOR" , "7.Pig"};
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, items);
        
        listView3.setAdapter(adapter);
    }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.raspored, menu);
		return true;
	}

}
