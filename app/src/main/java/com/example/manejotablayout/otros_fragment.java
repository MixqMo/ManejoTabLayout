package com.example.manejotablayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class otros_fragment extends Fragment {

    ListView lvImagen;

    String[][] datos={
            {"Guacamayo Aliverde","El guacamayo rojo o guacamayo aliverde es una especie de ave de la familia de los loros, del orden Psittaciformes. Son grandes guacamayos que atraen la atención por su vívido y espectacular colorido, y su llamado estridente con el que se comunican durante el vuelo. Los ejemplares jóvenes se parecen a los adultos, pero tienen la cola más corta."},
            {"Guacamayo Azul y Amarillo","El guacamayo azul y amarillo es un guacamayo netamente sudamericano: su área de distribución comprende desde Panamá hasta el norte de Argentina, pasando por toda la cuenca amazónica. En cautividad se reproducen fácilmente; en libertad viven en grupos de 25-30 ejemplares. Es conocido como guacamayo azul y amarillo, guacamayo azul y dorado o guacamayo guardiazul. Este loro es el representante inconfundible de los guacamayos, loros con poderosos picos y colas muy largas."},
            {"Perico Frentirroj","El perico frentirrojo es una especie de ave perteneciente a la familia de los loros. Es originario de Centroamérica, específicamente entre las regiones del sur de Nicaragua, el este de Costa Rica y el oeste de Panamá."}};

    int[] imagenes={R.drawable.guacamayo_aliverde,R.drawable.guacamayo_azul,R.drawable.perico_frentirojo};

    public otros_fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_otros_fragment, container, false);
        lvImagen = (ListView) v.findViewById(R.id.lvOtros);
        lvImagen.setAdapter(new Adaptador(getActivity(), datos, imagenes));
        return v;
    }
}