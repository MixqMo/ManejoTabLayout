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
public class gatos_fragment extends Fragment {

    ListView lvImagen;

    String[][] datos={
            {"Gato sphynx o esfinge","El gato sphynx o gato esfinge es un gato realmente único en el mundo. Fue el primero en ser aceptado como raza sin pelo o sin pelaje aparente y lo que es seguro, es que crean agrado y desagrado a la vez por parte de la sociedad humana. Muchos profesionales sugieren que proviene de la raza devon rex."},
            {"Savannah","Con una apariencia exótica y única, el gato savannah recuerda a un auténtico leopardo en miniatura, ¿cierto? Pero que eso no nos engañe, hablamos de un felino doméstico que se adapta perfectamente a la convivencia dentro del hogar. Además, hablamos de un gato especialmente activo, sociable y cariñoso."},
            {"Gato nebelung","De un precioso y llamativo gris perla, con un manto largo y sedoso, así lucen los gatos de la raza nebelung, unos rasgos heredados de los gatos azules rusos, en el caso del color, y de los gatos longhair americanos, en cuanto a la suavidad y largo del pelaje. Pero no solo su imagen es adorable."},
            {"Gato siberiano","De abundante manto y mirada penetrante, el gato siberiano se ha convertido en una de las razas felinas más populares y apreciadas en todo el mundo. Su temperamento equilibrado y sus características físicas, lo han convertido, además, en uno de los compañeros ideales para personas de todo tipo."},
            {"Gato montés","En ExpertoAnimal descubriremos los detalles sobre una raza bastante desconocida y con la que debemos tomar ciertas precauciones si pretendemos adoptar e incluir en nuestra familia a uno de estos felinos. Aunque haya quien los tenga como mascota, estos gatos son salvajes y están catalogados como especie."}};

    int[] imagenes={R.drawable.gato_esfinge,R.drawable.gato_savana,R.drawable.gato_nebelung,R.drawable.gato_siveriano, R.drawable.gato_montes};

    public gatos_fragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_gatos_fragment, container, false);
        lvImagen = (ListView) v.findViewById(R.id.lvGatos);
        lvImagen.setAdapter(new Adaptador(getActivity(), datos, imagenes));
        return v;
    }
}