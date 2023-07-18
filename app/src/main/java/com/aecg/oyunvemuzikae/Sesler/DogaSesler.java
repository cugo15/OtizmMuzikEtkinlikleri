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
import com.aecg.oyunvemuzikae.databinding.ActivityDogaSeslerBinding;

public class DogaSesler extends AppCompatActivity {
    private ActivityDogaSeslerBinding binding;
    Animation animationzoom;
      MediaPlayer mediaPlayerdeniz;
      MediaPlayer mediaPlayersehir;
      MediaPlayer mediaPlayeryagmur;
      MediaPlayer mediaPlayerruzgar;
      MediaPlayer mediaPlayerorman;
      MediaPlayer mediaPlayerselale;
      MediaPlayer mediaPlayerfirtina;
    private  View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDogaSeslerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        animationzoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_inshort);
        decorView=getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int i) {
                if(i==0){
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });
           mediaPlayerdeniz = MediaPlayer.create(this, R.raw.deniz);
           mediaPlayersehir = MediaPlayer.create(this,R.raw.sehir);
           mediaPlayeryagmur = MediaPlayer.create(this,R.raw.yagmur);
           mediaPlayerruzgar = MediaPlayer.create(this,R.raw.ruzgar);
           mediaPlayerorman = MediaPlayer.create(this,R.raw.orman);
           mediaPlayerselale = MediaPlayer.create(this,R.raw.horozses);
           mediaPlayerfirtina = MediaPlayer.create(this,R.raw.horozses);
        binding.dogascrollgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dogascroll.arrowScroll(ScrollView.FOCUS_LEFT);
            }
        });
        binding.dogascrollileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dogascroll.arrowScroll(ScrollView.FOCUS_RIGHT);
            }
        });
        binding.Anasayfayadondoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayerfirtina,mediaPlayerorman,mediaPlayerruzgar,mediaPlayerdeniz,mediaPlayerselale,mediaPlayersehir,mediaPlayeryagmur);
                Intent intent = new Intent(DogaSesler.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.Geritusudoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayerfirtina,mediaPlayerorman,mediaPlayerruzgar,mediaPlayerdeniz,mediaPlayerselale,mediaPlayersehir,mediaPlayeryagmur);
                Intent intent = new Intent(DogaSesler.this, SesMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });



        binding.denizcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.denizcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerdeniz,mediaPlayerorman,mediaPlayerruzgar,mediaPlayerfirtina,mediaPlayerselale,mediaPlayersehir,mediaPlayeryagmur);

            }
        });
        binding.sehircard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.sehircard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayersehir,mediaPlayerorman,mediaPlayerruzgar,mediaPlayerdeniz,mediaPlayerselale,mediaPlayerfirtina,mediaPlayeryagmur);

            }
        });
        binding.ruzgarcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ruzgarcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerruzgar,mediaPlayerorman,mediaPlayerfirtina,mediaPlayerdeniz,mediaPlayerselale,mediaPlayersehir,mediaPlayeryagmur);

            }
        });
        binding.yagmurcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.yagmurcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayeryagmur,mediaPlayerorman,mediaPlayerruzgar,mediaPlayerdeniz,mediaPlayerselale,mediaPlayersehir,mediaPlayerfirtina);

            }
        });
        binding.ormancard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ormancard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerorman,mediaPlayerfirtina,mediaPlayerruzgar,mediaPlayerdeniz,mediaPlayerselale,mediaPlayersehir,mediaPlayeryagmur);

            }
        });

    }
    public void hayvansesbaslatma(MediaPlayer playingone, MediaPlayer b, MediaPlayer c, MediaPlayer d, MediaPlayer e,MediaPlayer f,MediaPlayer g){
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
        else{
            playingone.seekTo(0);
            playingone.start();
        }
    }
    public void hayvansesdurdur(MediaPlayer a,MediaPlayer b,MediaPlayer c,MediaPlayer d,MediaPlayer e,MediaPlayer f,MediaPlayer g){
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
    protected void onPause() {
        hayvansesdurdur(mediaPlayerfirtina,mediaPlayerorman,mediaPlayerruzgar,mediaPlayerdeniz,mediaPlayerselale,mediaPlayersehir,mediaPlayeryagmur);


        super.onPause();
    }

    @Override
    protected void onStop() {
        hayvansesdurdur(mediaPlayerfirtina,mediaPlayerorman,mediaPlayerruzgar,mediaPlayerdeniz,mediaPlayerselale,mediaPlayersehir,mediaPlayeryagmur);

        super.onStop();
    }
}