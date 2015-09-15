package org.example.buttonclickcount;

import android.view.View;
import android.view.View.OnClickListener;

public class OurOnClickListener implements OnClickListener {
	
	MainActivity caller;
	
	public OurOnClickListener(MainActivity activity) {
		this.caller = activity;
	}
	
	public void onClick(View view){
		caller.theTextView.setText("The button got clicked");
	}

}
