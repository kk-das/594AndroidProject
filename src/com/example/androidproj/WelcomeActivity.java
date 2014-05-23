package com.example.androidproj;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;




public class WelcomeActivity extends Activity {
	
	 private Spinner spinner1, spinner2;
	  private Button btnSubmit;

   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       // Get the view from new_activity.xml
       setContentView(R.layout.welcome_activity);
       addItemsOnSpinner2();
   	addListenerOnButton();
   	addListenerOnSpinnerItemSelection();
   }
   
   public void addItemsOnSpinner2() {
	   
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list = new ArrayList<String>();
		list.add("CS320 - WEB DEVELOPEMENT");
		list.add("CS520 - ADVANCED WEB DEVELOPEMENT");
		list.add("CS540 - OPERATING SYSTEM");
		list.add("CS537 - ADVANCED SOFTWARE ENGINEERING");
		list.add("MIS523 - FINANCE SYSTEM");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);
	  }
	 
	  public void addListenerOnSpinnerItemSelection() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	  }
	 
	  // get the selected dropdown list value
	  public void addListenerOnButton() {
	 
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		btnSubmit = (Button) findViewById(R.id.btnSubmit);
	 
		btnSubmit.setOnClickListener(new OnClickListener() {
	 
		  @Override
		  public void onClick(View v) {
	 
		    Toast.makeText(WelcomeActivity.this,
			"OnClickListener : " + 
	                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) + 
	                "\nSpinner 2 : "+ String.valueOf(spinner2.getSelectedItem()),
				Toast.LENGTH_SHORT).show();
		  }
	 
		});
	  }
}

