package com.example.whatsapp001.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.whatsapp001.R;
import java.util.ArrayList;
import com.example.whatsapp001.controlador.mensajes;


public class AdapterPersona extends RecyclerView.Adapter<AdapterPersona.ViewHolder> implements View.OnClickListener {
    LayoutInflater inflater;
    ArrayList<mensajes> model;

    private View.OnClickListener listener;

    public AdapterPersona(Context context, ArrayList<mensajes> model) {
        this.inflater = LayoutInflater.from(context);
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.lista_personas, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }
    public void setOnCLickLister(View.OnClickListener listener ){
        this.listener = listener;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre, mensaje,hora;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre_persona);
            mensaje = itemView.findViewById(R.id.mensaje);
            hora = itemView.findViewById(R.id.hora);
            imagen = itemView.findViewById(R.id.imagen_persona);
        }
    }

}
