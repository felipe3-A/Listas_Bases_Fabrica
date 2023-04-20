package com.andres.alerts_database;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button boton1;
Button boton2;
Button boton3;
Button boton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenciar();
    }
    public void NUEVAVISTA(View view){
        Intent nuevo=new Intent(this,Bases.class);
        startActivity(nuevo);
    }

    private void referenciar() {
        boton1 = findViewById(R.id.Boton1);
        boton2 = findViewById(R.id.Boton2);
        boton3 = findViewById(R.id.Boton3);
        boton4 = findViewById(R.id.Boton4);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has apretado el boton1 = Toast de larga duracion", Toast.LENGTH_SHORT).show();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has apretado el boton 2=Toast de corta duracion", Toast.LENGTH_SHORT).show();
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog();
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog1();
            }
        });

    }
    public void AlertDialog1(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("ADVERTENCIA");
        builder.setMessage("Estas advertido");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Usted ha fallado", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Eres sabio", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
    public void AlertDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("ADVERTENCIA");
        builder.setMessage("Solo un boton");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Prueba comletada", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }
}