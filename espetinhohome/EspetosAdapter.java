package com.example.demetrius.espetinhohome;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import java.util.ArrayList;


/**
 * Created by Demetrius on 09/08/2016.
 */
public class EspetosAdapter extends ArrayAdapter<Espeto>{
    private Context context;
    private ArrayList<Espeto>espetos=null;

    public EspetosAdapter(Context context, ArrayList<Espeto>espetos){
        super(context,0,espetos);
        this.espetos =espetos;
        this.context = context;

    }

    public View getView(int position,View convertView,ViewGroup parent){
          Espeto p=espetos.get(position);

        if (convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_lista__espetos, null);
        }
        ImageView ivEspeto=(ImageView)convertView.findViewById(R.id.ivEspetos);
        ivEspeto.setImageResource(p.getEspeto());

        TextView tvTipo=(TextView)convertView.findViewById(R.id.tvTipo);
        tvTipo.setText(p.getTipo());

        TextView tvQuantidade=(TextView)convertView.findViewById(R.id.tvQuantidade);
        tvQuantidade.setText(String.valueOf(p.getQuantdade()));

        return convertView;

    }

}


