package com.example.ejercicio_08_1_pii_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CambioDeContrasena extends AppCompatActivity {
    private EditText et3, et4, et5;
    private Button bt4, bt5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_de_contrasena);
        this.et3 = (EditText) findViewById(R.id.et3);
        this.et4 = (EditText) findViewById(R.id.et4);
        this.et5 = (EditText) findViewById(R.id.et5);
        this.bt4 = (Button) findViewById(R.id.bt4);
        this.bt5 = (Button) findViewById(R.id.bt5);

        //implemantamos los botones
        this.bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        this.bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et3.getText().length()>0&et4.getText().length()>0&et5.getText().length()>0)
                {
                    SharedPreferences prefe = getSharedPreferences("variables", Context.MODE_PRIVATE);
                    String pass = prefe.getString("password", "");
                    if(pass.equals(et3.getText().toString()))
                    {
                        if(et4.getText().toString().equals(et5.getText().toString()))
                        {
                            SharedPreferences preferences = getSharedPreferences("variables", Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putString("password", et4.getText().toString());
                            editor.commit();
                            Toast.makeText(v.getContext(),"La Contraseña Nueva se guardó exitósamente", Toast.LENGTH_LONG).show();
                            finish();
                        }
                        else
                            Toast.makeText(v.getContext(),"La Contraseña Nueva no coincide con la verificación", Toast.LENGTH_LONG).show();
                    }
                    else
                        Toast.makeText(v.getContext(),"La Contraseña actual no coincide con la declarada", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(v.getContext(),"No se ingresaron todos los valores, verifique", Toast.LENGTH_LONG).show();


            }
        });
    }
}
