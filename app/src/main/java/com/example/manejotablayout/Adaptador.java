package com.example.manejotablayout;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class Adaptador extends BaseAdapter{

    private static LayoutInflater inflater=null;

    Context context;
    String[][] informacion;
    int[] imagenes;

    public Adaptador(Context context, String[][] informacion, int[] imagenes){
        this.context = context;
        this.informacion = informacion;
        this.imagenes = imagenes;
        inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final  View vista = inflater.inflate(R.layout.activity_elemento_lista, null);

        ImageView ivImagen = (ImageView) vista.findViewById(R.id.ivImagen);
        TextView tvTitulo = (TextView) vista.findViewById(R.id.tvTitulo);
        TextView tvDescripcion = (TextView) vista.findViewById(R.id.tvDescripcion);

        tvTitulo.setText(informacion[position][0]);
        tvDescripcion.setText(informacion[position][1]);
        ivImagen.setImageResource(imagenes[position]);
        return vista;
    }

    @Override
    public int getCount() {
        return imagenes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
