package com.aecg.oyunvemuzikae.Sesler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.aecg.oyunvemuzikae.MainActivity;
import com.aecg.oyunvemuzikae.R;
import com.aecg.oyunvemuzikae.databinding.ActivityDogaSeslerBinding;
import com.aecg.oyunvemuzikae.databinding.ActivityRakamSeslerBinding;

public class RakamSesler extends AppCompatActivity {
    private ActivityRakamSeslerBinding binding;
    Animation animationzoom;
      MediaPlayer mediaPlayer0;
      MediaPlayer mediaPlayer1;
      MediaPlayer mediaPlayer2;
      MediaPlayer mediaPlayer3;
      MediaPlayer mediaPlayer4;
      MediaPlayer mediaPlayer5;
      MediaPlayer mediaPlayer6;
      MediaPlayer mediaPlayer7;
      MediaPlayer mediaPlayer8;
      MediaPlayer mediaPlayer9;
    private  View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRakamSeslerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        decorView=getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int i) {
                if(i==0){
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });
        animationzoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_inshort);
           mediaPlayer0 = MediaPlayer.create(this, R.raw.on);
           mediaPlayer1 = MediaPlayer.create(this, R.raw.bir);
           mediaPlayer2 = MediaPlayer.create(this,R.raw.iki);
           mediaPlayer3 = MediaPlayer.create(this,R.raw.uc);
           mediaPlayer4 = MediaPlayer.create(this,R.raw.dort);
           mediaPlayer5 = MediaPlayer.create(this,R.raw.bes);
           mediaPlayer6 = MediaPlayer.create(this,R.raw.alti);
           mediaPlayer7 = MediaPlayer.create(this,R.raw.yedi);
           mediaPlayer8 = MediaPlayer.create(this,R.raw.sekiz);
           mediaPlayer9 = MediaPlayer.create(this,R.raw.dokuz);
        binding.Geritusurakam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);
                Intent intent = new Intent(RakamSesler.this, SesMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.Anasayfayadonrakam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);
                Intent intent = new Intent(RakamSesler.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.oncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.oncard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer0,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer1);
            }
        });

        binding.bircard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.bircard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);
            }
        });
        binding.ikicard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ikicard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer2,mediaPlayer1,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);
            }
        });
        binding.uccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.uccard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer3,mediaPlayer2,mediaPlayer1,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);
            }
        });
        binding.dortcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dortcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer4,mediaPlayer2,mediaPlayer3,mediaPlayer1,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);
            }
        });
        binding.bescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.bescard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer5,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer1,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);
            }
        });
        binding.alticard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.alticard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer6,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer1,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);
            }
        });
        binding.yedicard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.yedicard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer7,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer1,mediaPlayer8,mediaPlayer9,mediaPlayer0);
            }
        });
        binding.skzcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.skzcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer8,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer1,mediaPlayer9,mediaPlayer0);
            }
        });
        binding.dokuzcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dokuzcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayer9,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer1,mediaPlayer0);
            }
        });

    }
    public void hayvansesbaslatma(MediaPlayer playingone, MediaPlayer b, MediaPlayer c, MediaPlayer d, MediaPlayer e,MediaPlayer f,MediaPlayer g, MediaPlayer h,MediaPlayer i,MediaPlayer j){
        if(b.isPlaying()==true){
            b.pause();
            b.seekTo(0);
            playingone.start();
        } else if (c.isPlaying()==true) {
            c.pause();
            c.seekTo(0);
            playingone.start();
        }
        else if (d.isPlaying()==true) {
            d.pause();
            d.seekTo(0);
            playingone.start();
        }
        else if (e.isPlaying()) {
            e.pause();
            e.seekTo(0);
            playingone.start();
        }
        else if (f.isPlaying()) {
            f.pause();
            f.seekTo(0);
            playingone.start();
        }
        else if (g.isPlaying()) {
            g.pause();
            g.seekTo(0);
            playingone.start();
        }
        else if (h.isPlaying()) {
            h.pause();
            h.seekTo(0);
            playingone.start();
        }

        else if (i.isPlaying()) {
            i.pause();
            i.seekTo(0);
            playingone.start();
        }
        else if (j.isPlaying()) {
            j.pause();
            j.seekTo(0);
            playingone.start();
        }
        else{
            playingone.seekTo(0);
            playingone.start();
        }
    }
    public void hayvansesdurdur(MediaPlayer a,MediaPlayer b,MediaPlayer c,MediaPlayer d,MediaPlayer e,MediaPlayer f,MediaPlayer g,MediaPlayer h,MediaPlayer i,MediaPlayer j){
        if(a.isPlaying()==true){
            a.pause();
            a.seekTo(0);
        } else if (b.isPlaying()==true) {
            b.pause();
            b.seekTo(0);
        } else if (c.isPlaying()==true) {
            c.pause();
            c.seekTo(0);
        }
        else if (d.isPlaying()==true) {
            d.pause();
            d.seekTo(0);}
        else if (e.isPlaying()==true){
            e.pause();
            e.seekTo(0);
        }
        else if (f.isPlaying()==true){
            f.pause();
            f.seekTo(0);
        }
        else if (g.isPlaying()==true){
            g.pause();
            g.seekTo(0);
        }
        else if (h.isPlaying()==true){
            h.pause();
            h.seekTo(0);
        }
        else if (i.isPlaying()==true){
            i.pause();
            i.seekTo(0);
        }
        else if (j.isPlaying()==true){
            j.pause();
            j.seekTo(0);
        }
        else{}
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus){
            decorView.setSystemUiVisibility(hideSystemBars());
        }
    }

    private int hideSystemBars(){
        return View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }
    @Override
    protected void onPause() {
        hayvansesdurdur(mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);


        super.onPause();
    }

    @Override
    protected void onStop() {
        hayvansesdurdur(mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6,mediaPlayer7,mediaPlayer8,mediaPlayer9,mediaPlayer0);

        super.onStop();
    }
}