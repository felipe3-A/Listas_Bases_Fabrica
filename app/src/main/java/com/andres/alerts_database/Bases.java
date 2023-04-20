package com.andres.alerts_database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Bases extends AppCompatActivity {
   ListView lista1;
   Button botonVer;
   String [] ciudades =new String[]{"Rosas","Cali","Tulua","Bogota"};;
   ArrayAdapter adapter;

   EditText nombre,apellido,cargo,edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bases);

        referenciar();

    }

    private void referenciar() {
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,ciudades);
       lista1.setAdapter(adapter);
       nombre=findViewById(R.id.editnombre);
       apellido=findViewById(R.id.editapellido);
       edad=findViewById(R.id.editedad);
       cargo=findViewById(R.id.editcargo);
        botonVer=findViewById(R.id.BotonVer);

        botonVer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //Obtener cajas de texto y almacenar datos
     String nombred= nombre.getText().toString();
     String apellidedod=apellido.getText().toString();
     String edadd= edad.getText().toString();
     String cargod=cargo.getText().toString();

       //Crear el intento para pasar a otra vista y pasar los datos
        Intent intent=new Intent(Bases.this,RecibeDatos.class);
        intent.putExtra("nombre",nombred);
        intent.putExtra("Apellido",apellidedod);
        intent.putExtra("Edad",edadd);
        intent.putExtra("Cargo",cargod);
        startActivity(intent);

    }


});
    }

}