package com.example.ejercicio_08_1_pii_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {
    private TextView tv1;
    private Button bt2, bt3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        this.tv1 = (TextView) findViewById(R.id.tv1);
        this.bt2 = (Button) findViewById(R.id.bt2);
        this.bt3 = (Button) findViewById(R.id.bt3);
        //recupero el valor enviado desde el primer activity
        Bundle b = getIntent().getExtras();
        String nombreUsuario = "HOLA "+b.getString("nombre");
        tv1.setText(nombreUsuario);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        this.bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), CambioDeContrasena.class);
                startActivity(i);
            }
        });
    }
}
