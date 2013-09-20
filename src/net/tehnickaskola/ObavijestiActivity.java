package net.tehnickaskola;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ObavijestiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_obavijesti);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.obavijesti, menu);
		return true;
	}

}
