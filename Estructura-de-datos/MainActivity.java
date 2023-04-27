package com.example.ejercicio_06_pii_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //declaramos las variables de Instancia
    private ImageButton ib1;
    private ImageView iv1;
    private Truco miBaraja;
    private int contador = 0;
    private Contador cont;
    private TextView temporizador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ib1 = (ImageButton) findViewById(R.id.ib1);
        this.iv1 = (ImageView) findViewById(R.id.iv1);
        this.miBaraja = new Truco();

        this.temporizador = (TextView) findViewById(R.id.temporizador);

        //implementamos el funcionamiento del Botón Imagen
        this.ib1.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if (contador < 40) {
                                                if (contador == 0)
                                                    iv1.setVisibility(View.VISIBLE);
                                                Context c = v.getContext();
                                                int id = c.getResources().getIdentifier(miBaraja.maso[contador].dirImagen, "drawable", c.getPackageName());
                                                iv1.setImageResource(id);
                                                Toast.makeText(v.getContext(), miBaraja.maso[contador].dirImagen, Toast.LENGTH_SHORT).show();
                                                contador++;
                                            } else {
                                                ib1.setVisibility(View.INVISIBLE);
                                            }
                                        }

                                    }

        );


    }

    public class Contador extends CountDownTimer {

        public Contador(long TotalMilisegundos, long intervalo) {
            super(TotalMilisegundos, intervalo);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            long segundos = millisUntilFinished / 1000;
            temporizador.setText(String.valueOf(segundos));
        }

        @Override
        public void onFinish() {
            if (contador < 40) {
                if (contador == 0)
                    iv1.setVisibility(View.VISIBLE);

                Context c =MainActivity.this;
                int id = c.getResources().getIdentifier(miBaraja.maso[contador].dirImagen, "drawable", c.getPackageName());
                iv1.setImageResource(id);
                Toast.makeText(MainActivity.this, miBaraja.maso[contador].dirImagen, Toast.LENGTH_SHORT).show();
                contador++;
                temporizador.setText("4");
                cont=new Contador(4000,1000);
                cont.start();
            } else {
                ib1.setVisibility(View.INVISIBLE);
            }
        }

    }
}


