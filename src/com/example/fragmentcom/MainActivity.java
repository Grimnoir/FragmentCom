package com.example.fragmentcom;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity implements DataFrag.MyListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

	@Override
	public void setData(String s) {
		DisplayFrag df=(DisplayFrag) getFragmentManager().findFragmentById(R.id.maindispfrag);
		df.updatedata(s);
	}
  
}
