package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
        isPlayer = true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean isPlayer;
    public void dropIN(View view) {
        ImageView counter;
        counter = (ImageView)view;
        // isplayer = true for bheem , false ; kalia
       if(isPlayer) {
           counter.setTranslationY(-1500);
           counter.setImageResource(R.drawable.kalia);
           //counter.setImageAlpha(1);
           counter.animate().translationYBy(1500).setDuration(30);
           isPlayer=false;
       }else{
           counter.setTranslationY(-1500);
           counter.setImageResource(R.drawable.chota_bheem_);
           //counter.setImageAlpha(1);
           counter.animate().translationYBy(1500).setDuration(30);
           isPlayer=true;
       }
    }
}