package com.example.soundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button yellow,green,blue,red;
    MediaPlayer mediaPlayer;
    public void ylw(View view){
        if(mediaPlayer!=null){
            mediaPlayer=null;
        }
        mediaPlayer=MediaPlayer.create(this,R.raw.yellow_sound);
        mediaPlayer.start();
    }
    public void grn(View view){
        if(mediaPlayer!=null){
            mediaPlayer=null;
        }
        mediaPlayer=MediaPlayer.create(this,R.raw.green_sound);
        mediaPlayer.start();
    }
    public void blu(View view){
        if(mediaPlayer!=null){
            mediaPlayer=null;
        }
        mediaPlayer=MediaPlayer.create(this,R.raw.blue_sound);
        mediaPlayer.start();
    }
    public void red(View view){
        if(mediaPlayer!=null){
            mediaPlayer=null;
        }
        mediaPlayer=MediaPlayer.create(this,R.raw.red_sound);
        mediaPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yellow=findViewById(R.id.buttony);
        green=findViewById(R.id.buttong);
        blue=findViewById(R.id.buttonb);
        red=findViewById(R.id.buttonr);

    }
}