package com.example.manejotablayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class Perros_fragment extends Fragment {

    ListView lvImagen;
    String[][] datos={
            {"Boxer","El perro bóxer (Deutscher Boxer), también conocido como \"bóxer alemán\" o simplemente \"bóxer\" es una de las razas caninas de tipo moloso más populares del mundo y nace del cruce entre un Brabant bullenbeisser y un Bulldog, razas extintas actualmente. Debemos saber que la raza bóxer apareció por primera."},
            {"Cavalier","La raza de perro Cavalier King Charles spaniel es conocida por su aparición múltiples películas, así mismo, también se popularizó gracias a las celebridades que lo eligieron como perro de compañía, tales como Coco Chanel, Oscar Wilde o Frank Sinatra. Además, esta raza es muy apreciada por su aspecto."},
            {"Cocker Spaniel","Con un porte regio y elegante, gracias al que luce un aspecto realmente señorial, combinado con un carácter sumamente dulce y equilibrado, este animal conseguirá ganarse nuestro corazón con esa mirada tan tierna en milésimas de segundo. Estos canes resultan los compañeros ideales para todos aquellos dispuestos."},
            {"FoxHound Americano","El foxhound americano es un perro de caza desarrollado en Estados Unidos. Desciende del foxhound inglés, uno de los perros de tipo sabueso más populares en Reino Unido. Podemos diferenciarlos por las extremidades, notablemente más largas y finas en los individuos de origen estadounidense."},
            {"Lobero Irlandés","El lobero irlandés, también conocido como lebrel irlandés o cazador de lobos irlandés, es una de las razas caninas más queridas y apreciadas de Irlanda. Su historia es antigua y remota, puesto que ya se menciona por Julio César en los comentarios sobre la guerra de las Galias. Por entonces era valorada."},
            {"Mastin","El mastín del Pirineo es un perro que alcanza un tamaño considerable y, debido a ello, puede resultar imponente. Sin embargo, debemos saber que en realidad se trata de un perro protector, afable y tierno con los suyos, por lo que es sin lugar a dudas una raza especialmente querida para quienes han tenido."},
    };

    int[] imagenes={R.drawable.boxer,R.drawable.cavalier,R.drawable.cocker_s,R.drawable.lobero_ingles, R.drawable.lobero_ingles,R.drawable.mastin};


    public Perros_fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_perros_fragment,container, false);
        lvImagen = (ListView) v.findViewById(R.id.lvPerros);
        lvImagen.setAdapter(new Adaptador(getActivity(), datos, imagenes));
        return v;
    }
}