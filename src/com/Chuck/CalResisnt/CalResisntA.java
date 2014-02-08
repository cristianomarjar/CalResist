package com.Chuck.CalResisnt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class CalResisntA extends Activity {
	/** Called when the activity is first created. */
	private RadioButton r, v, i;
	TextView txt_a,txt_b,aux;
	EditText valor1,valor2;
	private double valor_a, valor_b;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		txt_a=(TextView)findViewById(R.id.TextV_a);		
		txt_b=(TextView)findViewById(R.id.TextV_b);
		this.txt_a.setText("Introduce el Voltaje:");
		this.txt_b.setText("Introduce la Intencidad:");
	}
	public void valresistencia(View vi) {
		txt_a=(TextView)findViewById(R.id.TextV_a);		
		txt_b=(TextView)findViewById(R.id.TextV_b);
		txt_a.setText("Introduce el Voltaje:");
		txt_b.setText("Introduce la Intencidad:");
	}
	public void valvoltaje(View vi) {
		txt_a=(TextView)findViewById(R.id.TextV_a);		
		txt_b=(TextView)findViewById(R.id.TextV_b);
		txt_b.setText("Introduce la Intencidad:");		
		txt_a.setText("Introduce la Resistencia:");
	}
	public void valintencidad(View vi) {
		txt_a=(TextView)findViewById(R.id.TextV_a);		
		txt_b=(TextView)findViewById(R.id.TextV_b);
		txt_a.setText("Introduce el Voltaje:");	
		txt_b.setText("Introduce la Resistencia:");		
	}
	
	public void operaciones(View vi) {
		valor1 = (EditText) findViewById(R.id.edtexvalor1);
		valor2 = (EditText) findViewById(R.id.edtexvalor2);
		r = (RadioButton) findViewById(R.id.radioresistencia);
		v = (RadioButton) findViewById(R.id.radiovoltaje);
		i = (RadioButton) findViewById(R.id.radiointencidad);		
				
				if (valor1.getText().toString().length() > 0 && valor2.getText().toString().length() > 0) {				
					valor_a = Double.parseDouble(valor1.getText().toString());
					valor_b = Double.parseDouble(valor2.getText().toString());
					
					if ((r.isChecked())) {
						aux=(TextView)findViewById(R.id.resul);
						aux.setText("Resultado: "+(valor_a/valor_b)+" Ohms");
					}
					if (v.isChecked()) {
						aux=(TextView)findViewById(R.id.resul);
						aux.setText("Resultado: "+(valor_a*valor_b)+" volts");
					} else if (i.isChecked()) {
						aux=(TextView)findViewById(R.id.resul);
						aux.setText("Resultado: "+(valor_a/valor_b)+" A");
					}
					
				} else
					Toast.makeText(CalResisntA.this,"No se puedo hacer la operacion!",Toast.LENGTH_LONG).show();					 
	}
}