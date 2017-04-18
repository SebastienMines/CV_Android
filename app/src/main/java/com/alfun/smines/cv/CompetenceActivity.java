package com.alfun.smines.cv;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by s.mines on 13/04/2017.
 */

public class CompetenceActivity extends AppCompatActivity{

    private ArrayList<String> competence;
    private ListView listViewComp;

    public static String[] tabCompetence = {"Java","Android","PHP","Symfony","JS/JQuery/Ajax/Dom","AWS (Amazon WebService)","SQL", "Microsoft Azure", "C#", "Angular JS"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.competence);

        Intent myIntent = getIntent();

        listViewComp = (ListView) findViewById(R.id.listViewCompetence);
        ArrayAdapter<String> aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tabCompetence);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listViewComp.setAdapter(aa);



    }
}
