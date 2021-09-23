package com.example.laboratorio8;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ListView listadatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listadatos=(ListView)findViewById(R.id.lsdatos);
        Lista = new ArrayList<Datos>();
        Lista.add(new Datos(1, "FRESA", "Posee hierro y proteínas, sustancias que son fundamentales para combatir la anemia.", R.drawable.fresa));
        Lista.add(new Datos(2, "BERENJENA", "Interfiere en el desarrollo de células malignas (reduciendo el riesgo de metástasis de algunos tipos de cáncer)", R.drawable.beren));
        Lista.add(new Datos(3, "GUINEO", "Es perfecta para que los músculos se relajen y obtengan energía de nuevo.", R.drawable.guineo));
        Lista.add(new Datos(4, "NARANJA", "Debido a que tiene pocas calorías, es un alimento sugerido en las dietas destinadas a bajar de peso.", R.drawable.naranja));
        Lista.add(new Datos(5, "TOMATE", " buen depurativo de la sangre y previene la osteoporosis.", R.drawable.tomato));
        Adaptador miadaptador = new Adaptador(getApplicationContext(), Lista);
            listadatos.setAdapter(miadaptador);

    }
}