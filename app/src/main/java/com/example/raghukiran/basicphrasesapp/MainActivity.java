package com.example.raghukiran.basicphrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFunction(View view){

        int id = view.getId();
        String ourID = "";

        ourID= view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourID, "raw","com.example.raghukiran.basicphrasesapp");
        MediaPlayer mplayer = MediaPlayer.create(this,resourceId);
        mplayer.start();

        Log.i("click function","clicked");
    }
}
