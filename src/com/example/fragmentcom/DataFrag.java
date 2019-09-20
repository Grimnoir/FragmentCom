package com.example.fragmentcom;



import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DataFrag extends Fragment{
	EditText jetdata;
	Button jbtnok;
	String sdata;
	MyListener ml;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v=inflater.inflate(R.layout.datafrag, container,false);
	
		jetdata=(EditText)v.findViewById(R.id.editText1);
		jbtnok=(Button)v.findViewById(R.id.button1);
		jbtnok.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 boolean flag = false;
	                flag = getData();
	                if(flag)
	                {
	                	ml.setData(sdata);
	                }
				
			}

			private boolean getData() {
			 boolean flag = false;
				       try
				       {
				           sdata = jetdata.getText().toString();
				           if(sdata.length() > 0)
				            flag = true;

				           else
				               Toast.makeText(getActivity(),"Enter Data",Toast.LENGTH_SHORT).show();
				       }
				       catch(Exception e){
				    	   Toast.makeText(getActivity(),"Only Alphabets allowed!Enter name"+e.toString(),Toast.LENGTH_LONG).show();
				       }
				       return flag;
				    }
			
		});
				
		return v;
		
	}
	
@Override
	public void onAttach(Activity activity) {
		ml=(MyListener) activity;
		super.onAttach(activity);
	}

interface MyListener{
	public void setData(String s);
}
}
