package com.example.fragmentcom;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayFrag extends Fragment{
TextView jtvdisp;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v=inflater.inflate(R.layout.dispfrag, container,false);
		jtvdisp=(TextView)v.findViewById(R.id.textView1);
		
		return v;
	}
	public void updatedata(String s) {
		jtvdisp.setText(s);
		
	}

}
