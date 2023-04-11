package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class LanguagesBaseAdapter extends BaseAdapter {

    private ArrayList<Languages> languages;
    private Context context;

    public LanguagesBaseAdapter(ArrayList<Languages> languages, Context context) {
        this.languages = languages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return languages.size();
    }

    @Override
    public Object getItem(int position) {
        return languages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_languages, parent, false);
        }
        TextView textViewLanguages = convertView.findViewById(R.id.textViewLanguages);
        textViewLanguages.setText(languages.get(position).getLprog());


        RatingBar ratingBar = convertView.findViewById(R.id.ratingBar);
        ratingBar.setRating(languages.get(position).getRating());


        return convertView;
    }
}
