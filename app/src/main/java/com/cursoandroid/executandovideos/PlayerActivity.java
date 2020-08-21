package com.cursoandroid.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //Executar o vídeo
        videoView.setMediaController( new MediaController(this ) );
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.dragonball_abertura);
        videoView.start();

        //Esconder a ActionBar
        getSupportActionBar().hide();

        //Esconde System UI + Modo FullScreen
        View decorView = getWindow().getDecorView();

        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

        decorView.setSystemUiVisibility( uiOptions);
    }
}