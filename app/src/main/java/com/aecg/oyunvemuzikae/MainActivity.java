package com.aecg.oyunvemuzikae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.aecg.oyunvemuzikae.Sesler.SesMenu;
import com.aecg.oyunvemuzikae.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private  View decorView;
    Animation animationzoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
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
        animationzoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_inshort);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        binding.seslerimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.seslerimg.startAnimation(animationzoom);

                Intent intent = new Intent(MainActivity.this, SesMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.oyunlarimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.oyunlarimg.startAnimation(animationzoom);

                Intent intent = new Intent(MainActivity.this, OyunlarMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.mainpiyanoimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.mainpiyanoimg.startAnimation(animationzoom);

                Intent intent = new Intent(MainActivity.this, PlayPiyano.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.muzikimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.muzikimg.startAnimation(animationzoom);
                Intent intent = new Intent(MainActivity.this, Muzikler.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
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
}