package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class CompetencesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);

        ArrayList<Languages> languages = new ArrayList<Languages>();
        languages.add(new Languages("C#", 4));
        languages.add(new Languages("Java", 3));
        languages.add(new Languages("php", 2));

        ListView listViewLanguages = findViewById(R.id.listViewLanguages);
        LanguagesBaseAdapter adapter = new LanguagesBaseAdapter(languages, this);
        listViewLanguages.setAdapter(adapter);

        ArrayList<Projet> projects = new ArrayList<Projet>();
        projects.add(new Projet("Site Baleries", "site permettant de reserver des cours assosiatif", "https://github.com/"));
        projects.add(new Projet("Bilbiothèque NATIONAL", "site permettant de reserver des livres dans l'école ou l'on étudie", "https://github.com/"));
        projects.add(new Projet("CV", "CV en android studio/JAVA", "https://github.com/"));


        ListView listViewProject = findViewById(R.id.listViewProject);
        ProjetBaseAdapter adapterP = new ProjetBaseAdapter(projects, this);
        listViewProject.setAdapter(adapterP);

        Button button = findViewById(R.id.buttonRetour);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(CompetencesActivity.this, MainActivity.class));
    }
}