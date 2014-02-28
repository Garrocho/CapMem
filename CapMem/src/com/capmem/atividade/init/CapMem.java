package com.capmem.atividade.init;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.memorizacao.R;

public class CapMem extends Activity {

	private ProgressBar barraProgresso;
	private ImageView reiniciar, um, dois, tres, quatro, cinco, seis;
	private int progresso, contador;
	private View background;
	private TextView rotuloParabens, rotuloVoceTem, rotuloProgresso;
	private int[] vetorSequencias;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atividade_inicial);
		
		//Log.d("path", );
		MediaPlayer mediaPlayer = new  MediaPlayer();
		try {
			mediaPlayer.setDataSource("file://com.memorizacao/assets/musicas/bemvindo.mp3");
			mediaPlayer.prepare();
			mediaPlayer.setVolume(1.0f, 1.0f);
			mediaPlayer.start();  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reiniciar = (ImageView)findViewById(R.id.atividade_inicial_imagem_reiniciar);

		rotuloParabens = (TextView)findViewById(R.id.atividade_inicial_rotulo_parabens);
		rotuloVoceTem = (TextView)findViewById(R.id.atividade_inicial_rotulo_voce_tem);
		rotuloProgresso = (TextView)findViewById(R.id.atividade_inicial_rotulo_progresso);
		
		rotuloParabens.setVisibility(View.GONE);
		rotuloVoceTem.setVisibility(View.GONE);
		
		barraProgresso = (ProgressBar)findViewById(R.id.atividade_inicial_barra_progresso);
		barraProgresso.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(Color.RED, Mode.MULTIPLY));

		progresso = 0;
		contador = 0;
		barraProgresso.setProgress(progresso);

		background = this.getWindow().getDecorView();

		um = (ImageView)findViewById(R.id.atividade_inicial_imagem_um);
		dois = (ImageView)findViewById(R.id.atividade_inicial_imagem_dois);
		tres = (ImageView)findViewById(R.id.atividade_inicial_imagem_tres);
		quatro = (ImageView)findViewById(R.id.atividade_inicial_imagem_quatro);
		cinco = (ImageView)findViewById(R.id.atividade_inicial_imagem_cinco);
		seis = (ImageView)findViewById(R.id.atividade_inicial_imagem_seis);
		
		vetorSequencias = gerarSequencia();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.atividade_inicial, menu);
		return true;
	}
}
