package com.aecg.oyunvemuzikae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;

import com.aecg.oyunvemuzikae.ResimdenBul.ResimdenBulTrompet;
import com.aecg.oyunvemuzikae.databinding.ActivityGeriSaymaVidBinding;
import com.aecg.oyunvemuzikae.databinding.ActivitySesMenuBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;

public class GeriSaymaVid extends AppCompatActivity {
    private ActivityGeriSaymaVidBinding binding;
    Animation animation;
    private  View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGeriSaymaVidBinding.inflate(getLayoutInflater());
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
        if(isNetworkenable()==false){
            binding.loading.setText("Lütfen internet bağlantısını kontrol ediniz.");
        }
        else{
            binding.loading.setText("Video Yükleniyor Lütfen Bekleyiniz...");
        }

        binding.gohom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GeriSaymaVid.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.govideolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GeriSaymaVid.this, Muzikler.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_ani);
        binding.loading.startAnimation(animation);
        MediaController mediaController = new MediaController(this);
        //binding.videoView.setVideoPath("http://www.muzikveoyun.com/wp-content/uploads/2023/04/Geri-Sayma.mp4");
        binding.videoView.setVideoPath("https://www.muzikveoyun.com/wp-content/uploads/2023/06/geri-sayma-filmi-cizgi1.mp4");
        binding.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                binding.loading.clearAnimation();
                binding.loadinglayout.setVisibility(View.GONE);
                mediaController.setAnchorView(binding.videoView);
                binding.videoView.setMediaController(mediaController);
                mediaPlayer.start();
            }
        });
        binding.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
            }
        });
        binding.videoView.start();
    }
    private boolean isNetworkenable(){
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo =connectivityManager.getActiveNetworkInfo();
        return networkInfo !=null && networkInfo.isConnected();
    }

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
}