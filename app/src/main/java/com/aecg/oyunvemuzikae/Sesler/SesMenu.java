package com.aecg.oyunvemuzikae.Sesler;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.BaseKeyListener;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import com.aecg.oyunvemuzikae.MainActivity;
import com.aecg.oyunvemuzikae.R;
import com.aecg.oyunvemuzikae.databinding.ActivitySesMenuBinding;
public class SesMenu extends AppCompatActivity {

    private ActivitySesMenuBinding binding;
    Animation animationzoom;
    private  View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySesMenuBinding.inflate(getLayoutInflater());
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

        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        binding.sesmenuscrollgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.sesmenuscroll.arrowScroll(ScrollView.FOCUS_LEFT);
            }
        });
        binding.sesmenuscrollileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.sesmenuscroll.arrowScroll(ScrollView.FOCUS_RIGHT);

            }
        });
        binding.Anasayfayadonsesmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SesMenu.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.Geritususesmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SesMenu.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.hayvanmenuimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.hayvanmenuimg.startAnimation(animationzoom);
                Intent intent = new Intent(SesMenu.this, HayvanSesler.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.rakammenuimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.rakammenuimg.startAnimation(animationzoom);
                Intent intent = new Intent(SesMenu.this, RakamSesler.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.seklmenucard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.seklmenucard.startAnimation(animationzoom);
                Intent intent = new Intent(SesMenu.this, GsekillerSesler.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.enstrumanmenuimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.ensmenucard.startAnimation(animationzoom);
                Intent intent = new Intent(SesMenu.this, EnstrumanSesler.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        binding.insanmenuimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.insanmenuimg.startAnimation(animationzoom);
                Intent intent = new Intent(SesMenu.this, InsanSesler.class);
                startActivity(intent);
                finish();
            }
        });
        binding.cansizmenuimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.cansizmenuimage.startAnimation(animationzoom);
                Intent intent = new Intent(SesMenu.this, AracSesler.class);
                startActivity(intent);
                finish();
            }
        });
        binding.dogaseslerimenuimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.dogaseslerimenuimg.startAnimation(animationzoom);
                Intent intent = new Intent(SesMenu.this, DogaSesler.class);
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