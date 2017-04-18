package com.alfun.smines.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Button buttonCompetence;
    private Button buttonFormation;
    private Button buttonExperience;

    public static String[] tabCompetence = {"Java","Android","PHP","Symfony","JS/JQuery/Ajax/Dom","AWS (Amazon WebService)","SQL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCompetence = (Button) findViewById(R.id.button_comp);
        buttonFormation = (Button) findViewById(R.id.button_form);
        buttonExperience = (Button) findViewById(R.id.button_exp);

        buttonCompetence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentComp = new Intent(getApplicationContext(), CompetenceActivity.class);
                intentComp.putExtra("listCompetence", tabCompetence);
                startActivity(intentComp);
            }
        });
        buttonFormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentForm = new Intent(getApplicationContext(), FormationActivity.class);
                startActivity(intentForm);
            }
        });
        buttonExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentExp = new Intent(getApplicationContext(), ExperienceActivity.class);
                startActivity(intentExp);
            }
        });
    }
}
