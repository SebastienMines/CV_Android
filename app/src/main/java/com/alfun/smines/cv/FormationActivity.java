package com.alfun.smines.cv;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ViewAnimator;

/**
 * Created by s.mines on 13/04/2017.
 */

public class FormationActivity extends AppCompatActivity {

    private ImageButton buttonPrev, buttonNext;
    private ViewAnimator viewAnimator;
    private Animation slide_in_left, slide_out_right;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation);

        buttonPrev = (ImageButton) findViewById(R.id.prev);
        buttonNext = (ImageButton) findViewById(R.id.next);
        viewAnimator = (ViewAnimator)findViewById(R.id.viewanimator);

        slide_in_left = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        slide_out_right = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        viewAnimator.setInAnimation(slide_in_left);
        viewAnimator.setOutAnimation(slide_out_right);

        buttonPrev.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                viewAnimator.showPrevious();
            }});

        buttonNext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                viewAnimator.showNext();
            }});
    }
}
