package com.alfun.smines.cv;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/**
 * Created by s.mines on 13/04/2017.
 */

public class FormationActivity extends AppCompatActivity {

    private ListView listViewFormation;

    public static String[][] tabFormation = {{"Aujourd'hui - 2016", "2016 - 2013"},{"Insta - Analyste logiciel", "IUT Villetaneuse - DUT Informatique"}};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation);

        listViewFormation = (ListView) findViewById(R.id.listViewFormation);
    }
}
