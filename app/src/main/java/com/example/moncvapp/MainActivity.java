package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("dec 2022", "sept 2023", "SKC", "alternant"));
        experiences.add(new Experience("juin 2022", "juillet 2022", "MAIRIE D'ARNOUVILLE", "cdd"));
        experiences.add(new Experience("janvier 2022", "mars 2022", "LES BALERIES", "stagières"));
        experiences.add(new Experience("juin 2021", "juillet 2021", "ESPACE VERT D'ARNOUVILLE", "cdd"));

        ListView listViewExperiences = findViewById(R.id.listViewExperiences);
        ExperienceBaseAdapter adapter = new ExperienceBaseAdapter(experiences, this);
        listViewExperiences.setAdapter(adapter);

        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("juillet 2023", "CDA", "Paris"));
        formations.add(new Formation("juin 2022", "BTS", "Montmorency"));
        formations.add(new Formation("juin 2020", "BAC ES", "Sarcelles"));
        formations.add(new Formation("avril 2021", "PERMIS B", "Sarcelles"));

        ListView listViewFormations = findViewById(R.id.listViewFormations);
        FormationBaseAdapter formationAdapter = new FormationBaseAdapter(formations, this);
        listViewFormations.setAdapter(formationAdapter);

        Button button = findViewById(R.id.buttonCompetence);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, CompetencesActivity.class));

    }
}