package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ExperienceBaseAdapter extends BaseAdapter {

    private ArrayList<Experience> experiences;
    private Context context;

    public ExperienceBaseAdapter(ArrayList<Experience> experiences, Context context) {
        this.experiences = experiences;
        this.context = context;
    }

    @Override
    public int getCount() {
        return experiences.size();
    }

    @Override
    public Object getItem(int position) {
        return experiences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.itemxp, parent, false);
        }
        TextView textViewdateDebut = convertView.findViewById(R.id.textViewdateDebut);
        textViewdateDebut.setText(experiences.get(position).getStart());

        TextView textViewdateFin = convertView.findViewById(R.id.textdateFin);
        textViewdateFin.setText(experiences.get(position).getEnd());

        TextView textViewCompagny = convertView.findViewById(R.id.textViewcompagny);
        textViewCompagny.setText(experiences.get(position).getCompagny());

        TextView textViewDescription = convertView.findViewById(R.id.textViewdescription);
        textViewDescription.setText(experiences.get(position).getDescription());

        return convertView;
    }
}
