package com.example.imc;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.os.Build;

public class MainActivityIMC extends ActionBarActivity {
	EditText t1,t2,s,resultado;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_imc);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	 public void imc(View view){
	    	t1=(EditText) findViewById(R.id.peso);
	    	t2=(EditText) findViewById(R.id.altura);
	    	resultado =(EditText) findViewById(R.id.resultado);
	    	double num1=Double.parseDouble(t1.getText().toString());
	    	double num2=Double.parseDouble(t2.getText().toString());
	    	
	   double imc = num1/ (num2 * num2);
	   resultado.setText(""+imc);
	    	
	 
	  s = ( EditText ) findViewById(R.id.labelSituacao);
	   resultado.setText("" + imc);
	   if (imc < 18.5){
	   s.setText("Abaixo do Peso");
	   }
	   else
	   if ((imc >= 18.5) && (imc < 25)) {
	   s.setText("No Peso Normal");
	   }
	   else
	   if ((imc >= 25) && (imc < 30)) {
	   s.setText("Acima do Peso");
	   }
	   else
	   if ((imc > 30)) {
	   s.setText("Obeso");
	   }
	   }

	  
	    	
	   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_imc, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_main_activity_imc, container, false);
			return rootView;
		}
	}

}
