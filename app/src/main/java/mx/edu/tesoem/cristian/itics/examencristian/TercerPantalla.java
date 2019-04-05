package mx.edu.tesoem.cristian.itics.examencristian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TercerPantalla extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer_pantalla);
    }

    public void calcularsuma(View v){
        Intent cargar = new Intent(this, PantallaSuma.class);
        startActivity(cargar);
    }

    public void calcularresta(View v){
        Intent cargar = new Intent(this, PantallaResta.class);
        startActivity(cargar);
    }

    public void calcularpotencia(View v){
        Intent cargar = new Intent(this, PantallaPotencia.class);
        startActivity(cargar);
    }

    public void salir(View v){
        Intent cargar = new Intent(this, PantallaTerminar.class);
        startActivity(cargar);


    }





}
