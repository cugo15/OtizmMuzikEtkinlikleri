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
import com.aecg.oyunvemuzikae.databinding.ActivityAracSeslerBinding;

public class AracSesler extends AppCompatActivity {
    private ActivityAracSeslerBinding binding;
       MediaPlayer mediaPlayeratarabası;
       MediaPlayer mediaPlayervapur;
       MediaPlayer mediaPlayeraraba;
       MediaPlayer mediaPlayerucak;
       MediaPlayer mediaPlayermotor;
       MediaPlayer mediaPlayertren;
       MediaPlayer mediaPlayerambulans;
       MediaPlayer mediaPlayeritfaiye;
       MediaPlayer mediaPlayerhelikopter;
    Animation animationzoom;
    private  View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAracSeslerBinding.inflate(getLayoutInflater());
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
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

           mediaPlayeratarabası = MediaPlayer.create(this, R.raw.atarabasises);
           mediaPlayervapur = MediaPlayer.create(this,R.raw.vapur);
           mediaPlayeraraba = MediaPlayer.create(this,R.raw.arabases);
           mediaPlayerucak = MediaPlayer.create(this,R.raw.ucakses);
           mediaPlayermotor = MediaPlayer.create(this,R.raw.motorsiklet);
           mediaPlayertren = MediaPlayer.create(this,R.raw.tren);
           mediaPlayerambulans = MediaPlayer.create(this,R.raw.ambulans);
           mediaPlayeritfaiye = MediaPlayer.create(this,R.raw.horozses);
           mediaPlayerhelikopter = MediaPlayer.create(this,R.raw.helikopter);
        animationzoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_inshort);
        binding.aracscrollgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.aracscroll.arrowScroll(ScrollView.FOCUS_LEFT);

            }
        });
        binding.aracscrollileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.aracscroll.arrowScroll(ScrollView.FOCUS_RIGHT);
            }
        });
        binding.Anasayfayadonarac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayeratarabası,mediaPlayervapur,mediaPlayeraraba,mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans,mediaPlayerhelikopter,mediaPlayeritfaiye);
                Intent intent = new Intent(AracSesler.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.Geritusuarac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayeratarabası,mediaPlayervapur,mediaPlayeraraba,mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans,mediaPlayerhelikopter,mediaPlayeritfaiye);

                Intent intent = new Intent(AracSesler.this, SesMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });

        binding.helikoptercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.helikoptercard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerhelikopter,mediaPlayervapur,mediaPlayeraraba
                        ,mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans
                        ,mediaPlayeratarabası,mediaPlayeritfaiye);
            }
        });
        binding.ambulanscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ambulanscard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerambulans,mediaPlayervapur,mediaPlayeraraba
                        ,mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayeratarabası
                        ,mediaPlayerhelikopter,mediaPlayeritfaiye);
            }
        });

        binding.atarabasCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.atarabasCard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayeratarabası,mediaPlayervapur,mediaPlayeraraba
                        ,mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans
                        ,mediaPlayerhelikopter,mediaPlayeritfaiye);
            }
        });
        binding.vapurcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.vapurcard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayervapur,mediaPlayeratarabası,mediaPlayeraraba,mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans,mediaPlayerhelikopter,mediaPlayeritfaiye);
            }
        });
        binding.arabacard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.arabacard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayeraraba,mediaPlayervapur,mediaPlayeratarabası,mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans,mediaPlayerhelikopter,mediaPlayeritfaiye);
            }
        });
        binding.ucakcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ucakcard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerucak,mediaPlayervapur,mediaPlayeraraba,mediaPlayeratarabası,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans,mediaPlayerhelikopter,mediaPlayeritfaiye);
            }
        });
        binding.motorcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.motorcard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayermotor,mediaPlayervapur,mediaPlayeraraba,mediaPlayerucak,mediaPlayeratarabası,mediaPlayertren,mediaPlayerambulans,mediaPlayerhelikopter,mediaPlayeritfaiye);
            }
        });
        binding.trencard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.trencard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayertren,mediaPlayervapur,mediaPlayeraraba,mediaPlayerucak,mediaPlayermotor,mediaPlayeratarabası,mediaPlayerambulans,mediaPlayerhelikopter,mediaPlayeritfaiye);
            }
        });
    }
    public void hayvansesbaslatma(MediaPlayer playingone, MediaPlayer b, MediaPlayer c, MediaPlayer d, MediaPlayer e,MediaPlayer f, MediaPlayer g, MediaPlayer h,MediaPlayer i){
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


        else{
            playingone.seekTo(0);
            playingone.start();
        }
    }
    public void hayvansesdurdur(MediaPlayer a,MediaPlayer b,MediaPlayer c,MediaPlayer d,MediaPlayer e,MediaPlayer f, MediaPlayer g, MediaPlayer h,MediaPlayer i){
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
        hayvansesdurdur(mediaPlayeratarabası,mediaPlayervapur,mediaPlayeraraba,
                mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans,
                mediaPlayerhelikopter,mediaPlayeritfaiye);

        super.onPause();
    }

    @Override
    protected void onStop() {
        hayvansesdurdur(mediaPlayeratarabası,mediaPlayervapur,mediaPlayeraraba,
                mediaPlayerucak,mediaPlayermotor,mediaPlayertren,mediaPlayerambulans,
                mediaPlayerhelikopter,mediaPlayeritfaiye);
        super.onStop();
    }
}