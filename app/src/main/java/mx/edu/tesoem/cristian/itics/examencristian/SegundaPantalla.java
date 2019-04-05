package mx.edu.tesoem.cristian.itics.examencristian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class SegundaPantalla extends AppCompatActivity implements View.OnClickListener {
Button botonsaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        botonsaludo = (Button) findViewById(R.id.botonsaludo);

        botonsaludo.setOnClickListener((View.OnClickListener) this);

    }
    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Saludos Cristian Ramirez", Toast.LENGTH_LONG).show();
        botonsaludo.setEnabled(false);
    }

    public void llamarbtn(View v){
        Intent cargar = new Intent(this, TercerPantalla.class);
        startActivity(cargar);
    }

}
