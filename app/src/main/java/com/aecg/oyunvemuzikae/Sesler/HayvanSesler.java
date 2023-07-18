package com.aecg.oyunvemuzikae.Sesler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import com.aecg.oyunvemuzikae.MainActivity;
import com.aecg.oyunvemuzikae.R;
import com.aecg.oyunvemuzikae.databinding.ActivityHayvanSeslerBinding;


public class HayvanSesler extends AppCompatActivity {
    private ActivityHayvanSeslerBinding binding;
      MediaPlayer mediaPlayerhoroz;
      MediaPlayer mediaPlayerkedi;
      MediaPlayer mediaPlayeresek;
      MediaPlayer mediaPlayerkopek;
      MediaPlayer mediaPlayerAt;
      MediaPlayer mediaPlayerkus;
      MediaPlayer mediaPlayerinek;
      MediaPlayer mediaPlayerkoyun;
    Animation animationzoom;
    private  View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHayvanSeslerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        animationzoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_inshort);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        decorView=getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int i) {
                if(i==0){
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });
           mediaPlayerhoroz = MediaPlayer.create(this, R.raw.horozses);
           mediaPlayerkedi = MediaPlayer.create(this,R.raw.kedi);
           mediaPlayeresek = MediaPlayer.create(this,R.raw.esekses);
           mediaPlayerkopek = MediaPlayer.create(this,R.raw.kopeksesi);
           mediaPlayerAt = MediaPlayer.create(this,R.raw.atsesi);
           mediaPlayerkus = MediaPlayer.create(this,R.raw.horozses);
           mediaPlayerinek = MediaPlayer.create(this,R.raw.inek);
           mediaPlayerkoyun = MediaPlayer.create(this,R.raw.koyun);
        binding.hayvanscrollileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.hayvanscroll.arrowScroll(ScrollView.FOCUS_RIGHT);
            }
        });
        binding.hayvanscrollgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.hayvanscroll.arrowScroll(ScrollView.FOCUS_LEFT);

            }
        });
        binding.Anasayfayadonhayvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayerAt,mediaPlayeresek,mediaPlayerhoroz,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);
                Intent intent = new Intent(HayvanSesler.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.Geritusuhayvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayerAt,mediaPlayeresek,mediaPlayerhoroz,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);

                Intent intent = new Intent(HayvanSesler.this, SesMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });

        binding.koyunsescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.koyunsescard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerkoyun,mediaPlayeresek,mediaPlayerhoroz,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerAt);

            }
        });

        binding.atsescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.atsescard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerAt,mediaPlayeresek,mediaPlayerhoroz,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);
            }
        });

        binding.kedisescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.kedisescard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerkedi,mediaPlayerAt,mediaPlayerhoroz,mediaPlayeresek,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);
            }
        });
        binding.kopeksescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.kopeksescard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerkopek,mediaPlayerAt,mediaPlayerhoroz,mediaPlayerkedi,mediaPlayeresek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);
            }
        });
        binding.eseksescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.eseksescard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayeresek,mediaPlayerAt,mediaPlayerhoroz,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);
            }
        });
        binding.horozsescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.horozsescard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerhoroz,mediaPlayerAt,mediaPlayeresek,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);
            }
        });
        binding.kussescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.kussescard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerkus,mediaPlayerAt,mediaPlayeresek,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerhoroz,mediaPlayerinek,mediaPlayerkoyun);
            }
        });
        binding.ineksescard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ineksescard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerinek,mediaPlayerAt,mediaPlayeresek,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerhoroz,mediaPlayerkoyun);
            }
        });
    }
    public void hayvansesbaslatma(MediaPlayer playingone,MediaPlayer b,MediaPlayer c,MediaPlayer d,MediaPlayer e,MediaPlayer f,MediaPlayer g,MediaPlayer h){
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
        else{
            playingone.seekTo(0);
            playingone.start();
        }
    }
    public void hayvansesdurdur(MediaPlayer a,MediaPlayer b,MediaPlayer c,MediaPlayer d,MediaPlayer e,MediaPlayer f,MediaPlayer g,MediaPlayer h){
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
        hayvansesdurdur(mediaPlayerAt,mediaPlayeresek,mediaPlayerhoroz,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);


        super.onPause();
    }

    @Override
    protected void onStop() {
        hayvansesdurdur(mediaPlayerAt,mediaPlayeresek,mediaPlayerhoroz,mediaPlayerkedi,mediaPlayerkopek,mediaPlayerkus,mediaPlayerinek,mediaPlayerkoyun);

        super.onStop();
    }
}