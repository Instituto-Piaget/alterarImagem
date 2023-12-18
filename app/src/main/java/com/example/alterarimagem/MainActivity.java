package com.example.alterarimagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imagem;
    private TextView estado;
    private Button btn;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagem = (ImageView) findViewById(R.id.imagem);
        estado = (TextView) findViewById(R.id.estado);
        btn = (Button) findViewById(R.id.btn);
        context = imagem.getContext();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeDoRecurso = "game";
                int resID = context.getResources().getIdentifier(nomeDoRecurso, "drawable", context.getPackageName());
                imagem.setImageResource(resID);
            }
        });
    }
}