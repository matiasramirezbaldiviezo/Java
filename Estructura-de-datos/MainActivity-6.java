package com.example.ejercicio_10_pii_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText et1, et2, et3, et4, et5;
    private Button btGrabar, btBuscar, btBorrar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.et1 = (EditText) findViewById(R.id.et1);
        this.et2 = (EditText) findViewById(R.id.et2);
        this.et3 = (EditText) findViewById(R.id.et3);
        this.et4 = (EditText) findViewById(R.id.et4);
        this.et5 = (EditText) findViewById(R.id.et5);
        this.btGrabar = (Button) findViewById(R.id.btGrabar);
        this.btBuscar = (Button) findViewById(R.id.btBuscar);
        this.btBorrar = (Button) findViewById(R.id.btBorrar);

        //implementamos el boton para borrar por id en la base de datos
        this.btBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(v.getContext(),"universidad", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                if(et1.getText().length()>0)
                {
                    int id = Integer.parseInt(et1.getText().toString());
                    int cantidadRegistrosBorrados = bd.delete("estudiantes","id="+id, null);
                    if(cantidadRegistrosBorrados==1)
                    {
                        Toast.makeText(v.getContext(),"No se ha borrado "+cantidadRegistrosBorrados+" registros", Toast.LENGTH_LONG).show();
                        limpiarFormulario();
                    }
                    else
                        Toast.makeText(v.getContext(),"No se ha encontrado un registro para borrar con el id ingresado", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(v.getContext(),"No se ha ingresado el id para borrar", Toast.LENGTH_LONG).show();
                bd.close();
            }
        });

        //implementamos el método para buscar un registro en la base de datos por su id
        this.btBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(v.getContext(),"universidad", null, 1);
                SQLiteDatabase bd = admin.getReadableDatabase();
                if(et1.getText().length()>0)
                {
                    int id = Integer.parseInt(et1.getText().toString());
                    Cursor fila = bd.rawQuery("select carnet, nombre, edad, id_carrera from estudiantes where id="+id,null);
                    if(fila.moveToFirst())//si devuelve true es que la consulta recuperó datos
                    {
                        et2.setText(fila.getString(0));
                        et3.setText(fila.getString(1));
                        et4.setText(String.valueOf(fila.getInt(2)));
                        et5.setText(String.valueOf(fila.getInt(3)));
                    }
                    else
                        Toast.makeText(v.getContext(),"No se recuperó información con el id ingresado", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(v.getContext(),"No se ha ingresado el id para consultar", Toast.LENGTH_LONG).show();
                bd.close();
            }
        });

        //implementamos el botón para grabar en la base de datos
        this.btGrabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //es conectarnos a la base de datos definida en el archivo AdminSQLiteOpenHelper
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(v.getContext(),"universidad", null, 1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                //validamos que haya valores en los 5 campos del formulario
                if(et1.getText().length()>0&et2.getText().length()>0&et3.getText().length()>0&et4.getText().length()>0&et5.getText().length()>0)
                {
                    //generamos un registro del tipo ContentValues para har la inserción a la base de datos
                    ContentValues registro = new ContentValues();
                    registro.put("id",Integer.parseInt(et1.getText().toString()));
                    registro.put("carnet",et2.getText().toString());
                    registro.put("nombre",et3.getText().toString());
                    registro.put("edad",Integer.parseInt(et4.getText().toString()));
                    registro.put("id_carrera",Integer.parseInt(et5.getText().toString()));
                    bd.insert("estudiantes",null,registro);
                    bd.close();
                    limpiarFormulario();
                    Toast.makeText(v.getContext(),"El registro se guardó exitósamente en la base de datos", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(v.getContext(),"No se han ingresado todos los valores del formulario", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void limpiarFormulario()
    {
        this.et1.setText("");
        this.et2.setText("");
        this.et3.setText("");
        this.et4.setText("");
        this.et5.setText("");
    }
}
