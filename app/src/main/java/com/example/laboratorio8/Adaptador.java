package com.example.laboratorio8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import java.util.ArrayList;
import android.view.LayoutInflater;
import java.util.List;
import java.util.zip.Inflater;

public class Adaptador  extends BaseAdapter {
    Context contexto;
    List<Datos> ListaObjetos;

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    public int getCount() {
        return ListaObjetos.size();
    }

    @Override
    public Object getItem(int posicion){
        return ListaObjetos.get(posicion);
    }

    @Override
    public long getItemId(int posicion){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista= inflate.inflate(R.layout.layout, null);
        ImageView imagen =(ImageView)vista.findViewById(R.id.img1);
        TextView titulo=(TextView)vista.findViewById(R.id.txttt);

        TextView detalle =(TextView)vista.findViewById(R.id.txtcon);
        titulo.setText(ListaObjetos.get(position).getTitulo().toString());
        detalle.setText(ListaObjetos.get(position).getDetalle());
        imagen.setImageResource(ListaObjetos.get(position).getImagen());
        return vista;}

}
