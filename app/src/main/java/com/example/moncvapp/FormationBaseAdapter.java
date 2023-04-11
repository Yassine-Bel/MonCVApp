package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FormationBaseAdapter extends BaseAdapter {

    private ArrayList<Formation> formations;
    private Context context;

    public FormationBaseAdapter(ArrayList<Formation> formations, Context context) {
        this.formations = formations;
        this.context = context;
    }

    @Override
    public int getCount() {
        return formations.size();
    }

    @Override
    public Object getItem(int position) {
        return formations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.itemformation, parent, false);
        }
        TextView textViewDateObtention = convertView.findViewById(R.id.textViewObtentionFormation);
        textViewDateObtention.setText(formations.get(position).getObtentionDate());

        TextView textViewNomDiplome = convertView.findViewById(R.id.textViewNomDiplome);
        textViewNomDiplome.setText(formations.get(position).getDeegree());

        TextView textViewLieu = convertView.findViewById(R.id.textViewLieu);
        textViewLieu.setText(formations.get(position).getPlace());

        return convertView;
    }
}
