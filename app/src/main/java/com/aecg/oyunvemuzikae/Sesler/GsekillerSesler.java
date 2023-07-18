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
import com.aecg.oyunvemuzikae.databinding.ActivityGsekillerSeslerBinding;
import com.aecg.oyunvemuzikae.databinding.ActivityRakamSeslerBinding;

public class GsekillerSesler extends AppCompatActivity {
    private ActivityGsekillerSeslerBinding binding;
      MediaPlayer mediaPlayerkare;
      MediaPlayer mediaPlayerdikdortgen;
      MediaPlayer mediaPlayercember;
      MediaPlayer mediaPlayerdaire;
      MediaPlayer mediaPlayerucgen;
      MediaPlayer mediaPlayerkup;
      MediaPlayer mediaPlayerbesgen;
      MediaPlayer mediaPlayerkure;
      MediaPlayer mediaPlayersilindir;
      MediaPlayer mediaPlayerpiramit;
      MediaPlayer mediaPlayerhuni;
    Animation animationzoom;
    private  View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGsekillerSeslerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        animationzoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_inshort);
        decorView=getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int i) {
                if(i==0){
                    decorView.setSystemUiVisibility(hideSystemBars());
                }
            }
        });
       mediaPlayerkare = MediaPlayer.create(this, R.raw.kare);
           mediaPlayerdikdortgen = MediaPlayer.create(this, R.raw.dikdortgen);
           mediaPlayercember = MediaPlayer.create(this,R.raw.oval);
           mediaPlayerdaire = MediaPlayer.create(this,R.raw.daire);
           mediaPlayerucgen = MediaPlayer.create(this,R.raw.ucgen);
           mediaPlayerkup = MediaPlayer.create(this,R.raw.kup);
           mediaPlayerbesgen = MediaPlayer.create(this,R.raw.besgen);
           mediaPlayerkure = MediaPlayer.create(this,R.raw.kure);
           mediaPlayersilindir = MediaPlayer.create(this,R.raw.silindir);
           mediaPlayerpiramit = MediaPlayer.create(this,R.raw.piramit);
           mediaPlayerhuni = MediaPlayer.create(this,R.raw.koni);


        binding.Geritususekil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayerkare,mediaPlayerdikdortgen,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
                Intent intent = new Intent(GsekillerSesler.this, SesMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.Anasayfayadonsekil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayerkare,mediaPlayerdikdortgen,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
                Intent intent = new Intent(GsekillerSesler.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });

        binding.karecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.karecard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerkare,mediaPlayerdikdortgen,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.dikdortgencard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dikdortgencard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerdikdortgen,mediaPlayerkare,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.cembercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.cembercard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayercember,mediaPlayerkare,mediaPlayerdikdortgen,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.dairecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dairecard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerdaire,mediaPlayerkare,mediaPlayercember,mediaPlayerdikdortgen,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.ucgencard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ucgencard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerucgen,mediaPlayerkare,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerdikdortgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.kupcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.kupcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerkup,mediaPlayerkare,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerdikdortgen,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.besgencard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.besgencard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerbesgen,mediaPlayerkare,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerdikdortgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.kurecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.kurecard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerkure,mediaPlayerkare,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerdikdortgen,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.silindircard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.silindircard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayersilindir,mediaPlayerkare,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayerdikdortgen,
                        mediaPlayerpiramit,mediaPlayerhuni);
            }
        });
        binding.piramitcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.piramitcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerpiramit,mediaPlayerkare,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerdikdortgen,mediaPlayerhuni);
            }
        });
        binding.hunicard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.hunicard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerhuni,mediaPlayerkare,mediaPlayercember,mediaPlayerdaire,
                        mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                        mediaPlayerpiramit,mediaPlayerdikdortgen);
            }
        });



    }
    public void hayvansesbaslatma(MediaPlayer playingone, MediaPlayer b, MediaPlayer c, MediaPlayer d, MediaPlayer e,MediaPlayer f,MediaPlayer g, MediaPlayer h,MediaPlayer i,MediaPlayer j,MediaPlayer k){
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
        else if (k.isPlaying()) {
            k.pause();
            k.seekTo(0);
            playingone.start();
        }
        else{
            playingone.seekTo(0);
            playingone.start();
        }
    }
    public void hayvansesdurdur(MediaPlayer a,MediaPlayer b,MediaPlayer c,MediaPlayer d,MediaPlayer e,MediaPlayer f,MediaPlayer g,MediaPlayer h,MediaPlayer i,MediaPlayer j,MediaPlayer k){
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
        else if (k.isPlaying()==true){
            k.pause();
            k.seekTo(0);
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
        hayvansesdurdur(mediaPlayerkare,mediaPlayerdikdortgen,mediaPlayercember,mediaPlayerdaire,
                mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                mediaPlayerpiramit,mediaPlayerhuni);

        super.onPause();
    }

    @Override
    protected void onStop() {
        hayvansesdurdur(mediaPlayerkare,mediaPlayerdikdortgen,mediaPlayercember,mediaPlayerdaire,
                mediaPlayerucgen,mediaPlayerkup,mediaPlayerbesgen,mediaPlayerkure,mediaPlayersilindir,
                mediaPlayerpiramit,mediaPlayerhuni);
        super.onStop();
    }
}