package com.capmem.atividade.sobre;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.memorizacao.R;

public class AtividadeSobre extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atividade_sobre);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.atividade_sobre, menu);
		return true;
	}

}
