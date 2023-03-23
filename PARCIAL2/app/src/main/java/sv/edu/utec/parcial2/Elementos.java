package sv.edu.utec.parcial2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Elementos extends RecyclerView.ViewHolder {
static ImageView imgPersonas;
static TextView tvNombre, tvCargo, tvCompania;

    public Elementos(@NonNull View itemView) {
        super(itemView);
        imgPersonas=itemView.findViewById(R.id.imvPersona);
        tvNombre=itemView.findViewById(R.id.tvNombre);
        tvCargo=itemView.findViewById(R.id.tvCargo);
        tvCompania=itemView.findViewById(R.id.tvCompania);
    }
}
