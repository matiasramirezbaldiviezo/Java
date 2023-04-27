package com.example.ejercicio_08_1_pii_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private Button bt1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.et1 = (EditText) findViewById(R.id.et1);
        this.et2 = (EditText) findViewById(R.id.et2);
        this.bt1 = (Button) findViewById(R.id.bt1);
        //aquí consulto la existencia de la variable password en el SharedPreferences
        SharedPreferences prefe = getSharedPreferences("variables", Context.MODE_PRIVATE);
        String password = prefe.getString("password", "");
        //en la primera ejecucion de la aplicación no existe la variable password, por lo tanto creamos una
        if(password.length()==0)
        {
            SharedPreferences preferences = getSharedPreferences("variables", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("password", "abc123");
            editor.commit();
        }
        //implementamos el boton para direccionar al segundo activity
        this.bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //preguntamos si se ingreso el nombre y contraseña
                if(et1.getText().length()>0&et2.getText().length()>0)
                {
                    SharedPreferences prefe = getSharedPreferences("variables", Context.MODE_PRIVATE);
                    String password = prefe.getString("password", "");
                    if(password.equals(et2.getText().toString())){
                        //generamos un objeto Intent para iniciar el segundo activity
                        Intent i = new Intent(v.getContext(),Bienvenida.class);
                        i.putExtra("nombre",et1.getText().toString());
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(v.getContext(), "Password incorrecto, ingrese nuevamente el Password", Toast.LENGTH_LONG).show();
                        et2.setText("");
                    }

                }
                else
                {
                    if(et1.getText().length()==0)
                        Toast.makeText(v.getContext(), "No ingresó un NOMBRE", Toast.LENGTH_LONG).show();
                    if(et2.getText().length()==0)
                        Toast.makeText(v.getContext(), "No ingresó una CONTRASEñA", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
