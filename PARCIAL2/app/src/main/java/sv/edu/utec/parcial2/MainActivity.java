package sv.edu.utec.parcial2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView mrPersonas;
AdaptadorPersonas adaptadorPersonas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrPersonas=findViewById(R.id.rvPersonas);
        mrPersonas.setLayoutManager(new LinearLayoutManager(this));
        mrPersonas.setAdapter(adaptadorPersonas);
        adaptadorPersonas=new AdaptadorPersonas(this,getListado());
        mrPersonas.setAdapter(adaptadorPersonas);
    }

    private ArrayList<Modelo> getListado()
    {
        ArrayList<Modelo> modelos=new ArrayList<>();
        Modelo persona = new Modelo();
        persona.setNombre("Alexander Pierrot");
        persona.setCargo("CEO");
        persona.setCompania("Insures S.O");
        persona.setFoto(R.drawable.lead_photo_1);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Carlos Lopez");
        persona.setCargo("Asistente");
        persona.setCompania("Hospital blue");
        persona.setFoto(R.drawable.lead_photo_2);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Sara Bonz");
        persona.setCargo("Directora de Marketing");
        persona.setCompania("Electrical Parts Ltd");
        persona.setFoto(R.drawable.lead_photo_3);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Liliana Clarence");
        persona.setCargo("Disenadora de producto");
        persona.setCompania("Creativa App");
        persona.setFoto(R.drawable.lead_photo_4);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Benito Peralta");
        persona.setCargo("Supervisor de ventas");
        persona.setCompania("Neomaticos Press");
        persona.setFoto(R.drawable.lead_photo_5);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Juan Jamarillo");
        persona.setCargo("CEO");
        persona.setCompania("Banco Nacional");
        persona.setFoto(R.drawable.lead_photo_6);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Christian Steps");
        persona.setCargo("CTO");
        persona.setCompania("Cooperativa verde");
        persona.setFoto(R.drawable.lead_photo_7);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Alexa Giraldo");
        persona.setCargo("Lead Programmer");
        persona.setCompania("Frustisofy");
        persona.setFoto(R.drawable.lead_photo_8);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Linda Murillo");
        persona.setCargo("Directora de Marketing");
        persona.setCompania("Seguros Boliver");
        persona.setFoto(R.drawable.lead_photo_9);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Lizeth Astrada");
        persona.setCargo("CEO");
        persona.setCompania("Concensionari Molotox");
        persona.setFoto(R.drawable.lead_photo_10);
        modelos.add(persona);

        persona  = new Modelo();
        persona.setNombre("Cristian Santamaria");
        persona.setCargo("Estudiante");
        persona.setCompania("Universidad Tecnologica de El Salvador");
        persona.setFoto(R.drawable.perfil3);
        modelos.add(persona);

        return modelos;
    }
}