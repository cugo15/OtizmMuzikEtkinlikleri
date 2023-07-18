package com.aecg.oyunvemuzikae.Sesler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import android.widget.Toast;

import com.aecg.oyunvemuzikae.MainActivity;
import com.aecg.oyunvemuzikae.R;
import com.aecg.oyunvemuzikae.databinding.ActivityEnstrumanSeslerBinding;
import com.aecg.oyunvemuzikae.databinding.ActivityResimdenBulZilBinding;

public class EnstrumanSesler extends AppCompatActivity {
      MediaPlayer mediaPlayerbaglama;
      MediaPlayer mediaPlayerbateri;
      MediaPlayer mediaPlayerdavul;
      MediaPlayer mediaPlayerdef;
      MediaPlayer mediaPlayerflut;
      MediaPlayer mediaPlayerkeman;
      MediaPlayer mediaPlayerksi;
      MediaPlayer mediaPlayermetro;
      MediaPlayer mediaPlayerobua;
      MediaPlayer mediaPlayerpiyano;
      MediaPlayer mediaPlayertrombon;
      MediaPlayer mediaPlayertrompet;
    MediaPlayer mediaPlayerzil;
    MediaPlayer mediaPlayerzurna;
    MediaPlayer mediaPlayergitar;
    MediaPlayer mediaPlayerud;
    MediaPlayer mediaPlayerkanun;
    private ActivityEnstrumanSeslerBinding binding;
    Animation animationzoom;
    private boolean isBackPressedone = false;
    private  View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnstrumanSeslerBinding.inflate(getLayoutInflater());
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
          mediaPlayerbaglama = MediaPlayer.create(this, R.raw.baglama);
          mediaPlayerbateri = MediaPlayer.create(this,R.raw.bateri);
          mediaPlayerdavul = MediaPlayer.create(this,R.raw.davul);
          mediaPlayerdef = MediaPlayer.create(this,R.raw.tef);
          mediaPlayerflut = MediaPlayer.create(this,R.raw.flut);
          mediaPlayerkeman = MediaPlayer.create(this,R.raw.keman);
          mediaPlayerksi = MediaPlayer.create(this,R.raw.ksilafon);
          mediaPlayermetro = MediaPlayer.create(this,R.raw.metronomses);
          mediaPlayerobua = MediaPlayer.create(this,R.raw.obua);
          mediaPlayerpiyano = MediaPlayer.create(this,R.raw.piyanoses);
          mediaPlayertrombon = MediaPlayer.create(this,R.raw.trombon);
          mediaPlayertrompet = MediaPlayer.create(this,R.raw.trompet);
          mediaPlayerzil = MediaPlayer.create(this,R.raw.zil);
          mediaPlayerzurna = MediaPlayer.create(this,R.raw.zurnases);
          mediaPlayergitar = MediaPlayer.create(this,R.raw.gitar);
          mediaPlayerud = MediaPlayer.create(this,R.raw.ud);
          mediaPlayerkanun = MediaPlayer.create(this,R.raw.kanun);



        binding.enstrumanscrollileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.enstrumanscroll.arrowScroll(ScrollView.FOCUS_RIGHT);
            }
        });
        binding.enstrumanscrollgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.enstrumanscroll.arrowScroll(ScrollView.FOCUS_LEFT);

            }
        });

        binding.Anasayfayadonenstruman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayerbaglama,mediaPlayerbateri,mediaPlayerdavul,mediaPlayerdef,
                        mediaPlayerflut,mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,mediaPlayerobua,
                        mediaPlayerpiyano,mediaPlayertrombon,mediaPlayertrompet,mediaPlayerzil,mediaPlayerzurna,
                        mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
                Intent intent = new Intent(EnstrumanSesler.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.Geritusuenstruman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hayvansesdurdur(mediaPlayerbaglama,mediaPlayerbateri,mediaPlayerdavul,mediaPlayerdef,
                        mediaPlayerflut,mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,mediaPlayerobua,
                        mediaPlayerpiyano,mediaPlayertrombon,mediaPlayertrompet,mediaPlayerzil,mediaPlayerzurna,
                        mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
                Intent intent = new Intent(EnstrumanSesler.this, SesMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        //5,935
        binding.kanuncard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.kanuncard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerkanun,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerzurna,mediaPlayergitar,
                        mediaPlayerbaglama,mediaPlayerud);
            }
        });
        binding.udcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.udcard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerud,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerzurna,mediaPlayergitar,
                        mediaPlayerbaglama,mediaPlayerkanun);
            }
        });
        binding.baglamacard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.baglamacard.startAnimation(animationzoom);
                hayvansesbaslatma(mediaPlayerbaglama,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerzurna,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.batericard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.batericard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerbateri,mediaPlayerzurna
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.davcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.davcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerdavul,mediaPlayerbateri
                        ,mediaPlayerzurna,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.defcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.defcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerdef,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerzurna,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.flutcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.flutcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerflut,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerzurna,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.kemancard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.kemancard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerkeman,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerzurna,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.ksicard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ksicard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerksi,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerzurna,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.metrocard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.metrocard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayermetro,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayerzurna,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.obuacard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.obuacard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerobua,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerzurna,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.piycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.piycard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerpiyano,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerzurna,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.trompcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.trompcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayertrompet,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayerzurna,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.trombcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.trombcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayertrombon,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayerzurna,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.zilcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.zilcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerzil,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzurna,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.zurnacard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.zurnacard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayerzurna,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
            }
        });
        binding.gitcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gitcard.startAnimation(animationzoom);

                hayvansesbaslatma(mediaPlayergitar,mediaPlayerbateri
                        ,mediaPlayerdavul,mediaPlayerdef,mediaPlayerflut,
                        mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,
                        mediaPlayerobua,mediaPlayerpiyano,mediaPlayertrombon,
                        mediaPlayertrompet,mediaPlayerzil,mediaPlayerbaglama,mediaPlayerzurna,mediaPlayerud,mediaPlayerkanun);
            }
        });


    }
    public void hayvansesbaslatma(MediaPlayer playingone,MediaPlayer b,MediaPlayer c,MediaPlayer d,MediaPlayer e,MediaPlayer f,MediaPlayer g,MediaPlayer h,MediaPlayer i,MediaPlayer j,MediaPlayer k,MediaPlayer l,MediaPlayer m,MediaPlayer n,MediaPlayer o,MediaPlayer p,MediaPlayer q){
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
        else if (k.isPlaying()) {
            k.pause();
            k.seekTo(0);
            playingone.start();
        }
        else if (l.isPlaying()) {
            l.pause();
            l.seekTo(0);
            playingone.start();
        }
        else if (m.isPlaying()) {
            m.pause();
            m.seekTo(0);
            playingone.start();
        }
        else if (n.isPlaying()) {
            n.pause();
            n.seekTo(0);
            playingone.start();
        }
        else if (o.isPlaying()) {
            o.pause();
            o.seekTo(0);
            playingone.start();
        }
        else if (p.isPlaying()) {
            p.pause();
            p.seekTo(0);
            playingone.start();
        }
        else if (q.isPlaying()) {
            q.pause();
            q.seekTo(0);
            playingone.start();
        }
        else{
            playingone.seekTo(0);
            playingone.start();
        }
    }
    public void hayvansesdurdur(MediaPlayer playingone,MediaPlayer b,MediaPlayer c,MediaPlayer d,MediaPlayer e,MediaPlayer f,MediaPlayer g,MediaPlayer h,MediaPlayer i,MediaPlayer j,MediaPlayer k,MediaPlayer l,MediaPlayer m,MediaPlayer n,MediaPlayer o,MediaPlayer p,MediaPlayer q){
        if (b.isPlaying()==true) {
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
        }else if (g.isPlaying()==true){
            g.pause();
            g.seekTo(0);
        }else if (h.isPlaying()==true){
            h.pause();
            h.seekTo(0);
        }else if (i.isPlaying()==true){
            i.pause();
            i.seekTo(0);
        }else if (j.isPlaying()==true){
            j.pause();
            j.seekTo(0);
        }else if (k.isPlaying()==true){
            k.pause();
            k.seekTo(0);
        }else if (l.isPlaying()==true){
            l.pause();
            l.seekTo(0);
        }else if (m.isPlaying()==true){
            m.pause();
            m.seekTo(0);
        }else if (n.isPlaying()==true){
            n.pause();
            n.seekTo(0);
        }
        else if (playingone.isPlaying()==true){
            playingone.pause();
            playingone.seekTo(0);
        }
        else if (o.isPlaying()==true){
            o.pause();
            o.seekTo(0);
        }
        else if (p.isPlaying()==true){
            p.pause();
            p.seekTo(0);
        }
        else if (q.isPlaying()==true){
            q.pause();
            q.seekTo(0);
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
        hayvansesdurdur(mediaPlayerbaglama,mediaPlayerbateri,mediaPlayerdavul,mediaPlayerdef,
                mediaPlayerflut,mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,mediaPlayerobua,
                mediaPlayerpiyano,mediaPlayertrombon,mediaPlayertrompet,mediaPlayerzil,mediaPlayerzurna,
                mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
        super.onPause();
    }

    @Override
    protected void onStop() {
        hayvansesdurdur(mediaPlayerbaglama,mediaPlayerbateri,mediaPlayerdavul,mediaPlayerdef,
                mediaPlayerflut,mediaPlayerkeman,mediaPlayerksi,mediaPlayermetro,mediaPlayerobua,
                mediaPlayerpiyano,mediaPlayertrombon,mediaPlayertrompet,mediaPlayerzil,mediaPlayerzurna,
                mediaPlayergitar,mediaPlayerud,mediaPlayerkanun);
        super.onStop();
    }


}
