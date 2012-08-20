package com.thenewboston.anton;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StartingPoint extends Activity {
    /** Called when the activity is first created. */
	
	static int counter = 0;
	Button add, sub;
	TextView display;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        display.setText("Your Total Is " + counter);
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("Your Total Is " + counter);
				//Context context = getApplicationContext();
		        //int duration = Toast.LENGTH_SHORT;
				//Toast toast = Toast.makeText(context, "Total is " + counter, duration);
				//toast.show();
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Your Total Is " + counter);
				//Context context = getApplicationContext();
		        //int duration = Toast.LENGTH_SHORT;
				//Toast toast = Toast.makeText(context, "Total is " + counter, duration);
				//toast.show();
			}
		});
    }
}