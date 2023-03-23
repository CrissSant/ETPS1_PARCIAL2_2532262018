package sv.edu.utec.parcial2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonas extends RecyclerView.Adapter<Elementos> {
    Context context;
    ArrayList<Modelo> modelos;
    public AdaptadorPersonas(Context context, ArrayList<Modelo> modelos) {
        this.context = context;
        this.modelos = modelos;
    }

    @NonNull
    @Override
    public Elementos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.personas,null);
        return new Elementos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Elementos holder, int position) {
        Elementos.tvNombre.setText(modelos.get(position).getNombre());
        Elementos.tvCargo.setText(modelos.get(position).getCargo());
        Elementos.tvCompania.setText(modelos.get(position).getCompania());
        Elementos.imgPersonas.setImageResource(modelos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return modelos.size();
    }
}
