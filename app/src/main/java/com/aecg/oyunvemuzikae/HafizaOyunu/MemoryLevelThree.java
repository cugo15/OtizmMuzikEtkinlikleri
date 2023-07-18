package com.aecg.oyunvemuzikae.HafizaOyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.aecg.oyunvemuzikae.MainActivity;
import com.aecg.oyunvemuzikae.R;
import com.aecg.oyunvemuzikae.databinding.ActivityMemoryLevelThreeBinding;
import com.aecg.oyunvemuzikae.databinding.ActivityMemoryLevelTwoBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MemoryLevelThree extends AppCompatActivity {
    private ActivityMemoryLevelThreeBinding binding;
    Integer[] cardsArray = {101,102,103,201,202,203};
    int r,r2,r3,selectedimg,selectedimg2,selectedimg3
            ,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17;
    Handler handler;
    MediaPlayer mediaPlayeryanliscevap;
    MediaPlayer mediaPlayerdogrucevap;
    int firstcard,secondcard;
    int clickedfirst,clickedsecond;
    private  View decorView;
    int cardNumber=1;
    int dogrucevapsure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMemoryLevelThreeBinding.inflate(getLayoutInflater());
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
        mediaPlayeryanliscevap = MediaPlayer.create(this,R.raw.yanliscevap);
        mediaPlayerdogrucevap = MediaPlayer.create(this,R.raw.dogrucingil);
        dogrucevapsure = mediaPlayerdogrucevap.getDuration();

        Bundle extras = getIntent().getExtras();
        int intentpicker = (Integer) extras.get("LVL3");
        if(intentpicker==1){
            binding.mlth.setText("11");
        }
        else if(intentpicker==2){
            binding.mlth.setText("12");
        }
        else if(intentpicker==3){
            binding.mlth.setText("13");
        }
        else if(intentpicker==4){
            binding.mlth.setText("14");
        }
        else if(intentpicker==5){
            binding.mlth.setText("15");
        }
        binding.iv11.setEnabled(false);
        binding.iv12.setEnabled(false);
        binding.iv21.setEnabled(false);
        binding.iv22.setEnabled(false);
        binding.iv31.setEnabled(false);
        binding.iv32.setEnabled(false);
        binding.openforsecondlv3.setEnabled(false);

        randomimg();
        Handler handler = new Handler();
        Runnable runable = new Runnable() {
            @Override
            public void run() {

                if (cardsArray[0] == 101) {
                    binding.iv11.setImageResource(selectedimg);
                } else if (cardsArray[0] == 102) {
                    binding.iv11.setImageResource(selectedimg2);
                }else if (cardsArray[0] == 103) {
                    binding.iv11.setImageResource(selectedimg3);
                } else if (cardsArray[0] == 201) {
                    binding.iv11.setImageResource(selectedimg);
                } else if (cardsArray[0] == 202) {
                    binding.iv11.setImageResource(selectedimg2);
                }else if (cardsArray[0] == 203) {
                    binding.iv11.setImageResource(selectedimg3);
                }


                if (cardsArray[1] == 101) {
                    binding.iv12.setImageResource(selectedimg);
                } else if (cardsArray[1] == 102) {
                    binding.iv12.setImageResource(selectedimg2);
                }else if (cardsArray[1] == 103) {
                    binding.iv12.setImageResource(selectedimg3);
                } else if (cardsArray[1] == 201) {
                    binding.iv12.setImageResource(selectedimg);
                } else if (cardsArray[1] == 202) {
                    binding.iv12.setImageResource(selectedimg2);
                }else if (cardsArray[1] == 203) {
                    binding.iv12.setImageResource(selectedimg3);
                }

                if (cardsArray[2] == 101) {
                    binding.iv21.setImageResource(selectedimg);
                } else if (cardsArray[2] == 102) {
                    binding.iv21.setImageResource(selectedimg2);
                }else if (cardsArray[2] == 103) {
                    binding.iv21.setImageResource(selectedimg3);
                } else if (cardsArray[2] == 201) {
                    binding.iv21.setImageResource(selectedimg);
                } else if (cardsArray[2] == 202) {
                    binding.iv21.setImageResource(selectedimg2);
                }else if (cardsArray[2] == 203) {
                    binding.iv21.setImageResource(selectedimg3);
                }

                if (cardsArray[3] == 101) {
                    binding.iv22.setImageResource(selectedimg);
                } else if (cardsArray[3] == 102) {
                    binding.iv22.setImageResource(selectedimg2);
                }else if (cardsArray[3] == 103) {
                    binding.iv22.setImageResource(selectedimg3);
                } else if (cardsArray[3] == 201) {
                    binding.iv22.setImageResource(selectedimg);
                } else if (cardsArray[3] == 202) {
                    binding.iv22.setImageResource(selectedimg2);
                }else if (cardsArray[3] == 203) {
                    binding.iv22.setImageResource(selectedimg3);
                }


                if (cardsArray[4] == 101) {
                    binding.iv31.setImageResource(selectedimg);
                } else if (cardsArray[4] == 102) {
                    binding.iv31.setImageResource(selectedimg2);
                }else if (cardsArray[4] == 103) {
                    binding.iv31.setImageResource(selectedimg3);
                } else if (cardsArray[4] == 201) {
                    binding.iv31.setImageResource(selectedimg);
                } else if (cardsArray[4] == 202) {
                    binding.iv31.setImageResource(selectedimg2);
                }else if (cardsArray[4] == 203) {
                    binding.iv31.setImageResource(selectedimg3);
                }


                if (cardsArray[5] == 101) {
                    binding.iv32.setImageResource(selectedimg);
                } else if (cardsArray[5] == 102) {
                    binding.iv32.setImageResource(selectedimg2);
                }else if (cardsArray[5] == 103) {
                    binding.iv32.setImageResource(selectedimg3);
                } else if (cardsArray[5] == 201) {
                    binding.iv32.setImageResource(selectedimg);
                } else if (cardsArray[5] == 202) {
                    binding.iv32.setImageResource(selectedimg2);
                }else if (cardsArray[5] == 203) {
                    binding.iv32.setImageResource(selectedimg3);
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        binding.iv11.setImageResource(R.drawable.questionmark2);
                        binding.iv12.setImageResource(R.drawable.questionmark2);
                        binding.iv21.setImageResource(R.drawable.questionmark2);
                        binding.iv22.setImageResource(R.drawable.questionmark2);
                        binding.iv31.setImageResource(R.drawable.questionmark2);
                        binding.iv32.setImageResource(R.drawable.questionmark2);
                        binding.iv11.setEnabled(true);
                        binding.iv12.setEnabled(true);
                        binding.iv21.setEnabled(true);
                        binding.iv22.setEnabled(true);
                        binding.iv31.setEnabled(true);
                        binding.iv32.setEnabled(true);
                        binding.openforsecondlv3.setEnabled(true);

                    }
                },1000);
            }
        };handler.postDelayed(runable,1000);
        binding.iv11.setTag("0");
        binding.iv12.setTag("1");
        binding.iv21.setTag("2");
        binding.iv22.setTag("3");
        binding.iv31.setTag("4");
        binding.iv32.setTag("5");
        Collections.shuffle(Arrays.asList(cardsArray));


        binding.openforsecondlv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.openforsecondlv3.setEnabled(false);


                if(binding.iv11.getVisibility() != View.INVISIBLE){
                    binding.iv11.setEnabled(false);
                    if (cardsArray[0] == 101) {
                        binding.iv11.setImageResource(selectedimg);
                    } else if (cardsArray[0] == 102) {
                        binding.iv11.setImageResource(selectedimg2);
                    }else if (cardsArray[0] == 103) {
                        binding.iv11.setImageResource(selectedimg3);
                    } else if (cardsArray[0] == 201) {
                        binding.iv11.setImageResource(selectedimg);
                    } else if (cardsArray[0] == 202) {
                        binding.iv11.setImageResource(selectedimg2);
                    }else if (cardsArray[0] == 203) {
                        binding.iv11.setImageResource(selectedimg3);
                    }


                }
                if(binding.iv12.getVisibility() != View.INVISIBLE){
                    binding.iv12.setEnabled(false);
                    if (cardsArray[1] == 101) {
                        binding.iv12.setImageResource(selectedimg);
                    } else if (cardsArray[1] == 102) {
                        binding.iv12.setImageResource(selectedimg2);
                    }else if (cardsArray[1] == 103) {
                        binding.iv12.setImageResource(selectedimg3);
                    } else if (cardsArray[1] == 201) {
                        binding.iv12.setImageResource(selectedimg);
                    } else if (cardsArray[1] == 202) {
                        binding.iv12.setImageResource(selectedimg2);
                    }else if (cardsArray[1] == 203) {
                        binding.iv12.setImageResource(selectedimg3);
                    }


                }
                if(binding.iv21.getVisibility() != View.INVISIBLE){
                    binding.iv21.setEnabled(false);
                    if (cardsArray[2] == 101) {
                        binding.iv21.setImageResource(selectedimg);
                    } else if (cardsArray[2] == 102) {
                        binding.iv21.setImageResource(selectedimg2);
                    }else if (cardsArray[2] == 103) {
                        binding.iv21.setImageResource(selectedimg3);
                    } else if (cardsArray[2] == 201) {
                        binding.iv21.setImageResource(selectedimg);
                    } else if (cardsArray[2] == 202) {
                        binding.iv21.setImageResource(selectedimg2);
                    }else if (cardsArray[2] == 203) {
                        binding.iv21.setImageResource(selectedimg3);
                    }



                }
                if(binding.iv22.getVisibility() != View.INVISIBLE){
                    binding.iv22.setEnabled(false);
                    if (cardsArray[3] == 101) {
                        binding.iv22.setImageResource(selectedimg);
                    } else if (cardsArray[3] == 102) {
                        binding.iv22.setImageResource(selectedimg2);
                    }else if (cardsArray[3] == 103) {
                        binding.iv22.setImageResource(selectedimg3);
                    } else if (cardsArray[3] == 201) {
                        binding.iv22.setImageResource(selectedimg);
                    } else if (cardsArray[3] == 202) {
                        binding.iv22.setImageResource(selectedimg2);
                    }else if (cardsArray[3] == 203) {
                        binding.iv22.setImageResource(selectedimg3);
                    }
                }

                if(binding.iv31.getVisibility() != View.INVISIBLE){
                    binding.iv31.setEnabled(false);
                    if (cardsArray[4] == 101) {
                        binding.iv31.setImageResource(selectedimg);
                    } else if (cardsArray[4] == 102) {
                        binding.iv31.setImageResource(selectedimg2);
                    }else if (cardsArray[4] == 103) {
                        binding.iv31.setImageResource(selectedimg3);
                    } else if (cardsArray[4] == 201) {
                        binding.iv31.setImageResource(selectedimg);
                    } else if (cardsArray[4] == 202) {
                        binding.iv31.setImageResource(selectedimg2);
                    }else if (cardsArray[4] == 203) {
                        binding.iv31.setImageResource(selectedimg3);
                    }
                }

                if(binding.iv32.getVisibility() != View.INVISIBLE){
                    binding.iv32.setEnabled(false);
                    if (cardsArray[5] == 101) {
                        binding.iv32.setImageResource(selectedimg);
                    } else if (cardsArray[5] == 102) {
                        binding.iv32.setImageResource(selectedimg2);
                    }else if (cardsArray[5] == 103) {
                        binding.iv32.setImageResource(selectedimg3);
                    } else if (cardsArray[5] == 201) {
                        binding.iv32.setImageResource(selectedimg);
                    } else if (cardsArray[5] == 202) {
                        binding.iv32.setImageResource(selectedimg2);
                    }else if (cardsArray[5] == 203) {
                        binding.iv32.setImageResource(selectedimg3);
                    }
                }


                Handler handler = new Handler();
                Runnable runable = new Runnable() {
                    @Override
                    public void run() {
                        if(binding.iv11.getVisibility() != View.INVISIBLE){
                            binding.iv11.setImageResource(R.drawable.questionmark2);
                            binding.iv11.setEnabled(true);
                        }
                        if(binding.iv12.getVisibility() != View.INVISIBLE){
                            binding.iv12.setImageResource(R.drawable.questionmark2);
                            binding.iv12.setEnabled(true);
                        }
                        if(binding.iv21.getVisibility() != View.INVISIBLE){
                            binding.iv21.setImageResource(R.drawable.questionmark2);
                            binding.iv21.setEnabled(true);

                        }
                        if(binding.iv22.getVisibility() != View.INVISIBLE){
                            binding.iv22.setImageResource(R.drawable.questionmark2);
                            binding.iv22.setEnabled(true);
                        }
                        if(binding.iv31.getVisibility() != View.INVISIBLE){
                            binding.iv31.setImageResource(R.drawable.questionmark2);
                            binding.iv31.setEnabled(true);
                        }
                        if(binding.iv32.getVisibility() != View.INVISIBLE){
                            binding.iv32.setImageResource(R.drawable.questionmark2);
                            binding.iv32.setEnabled(true);
                        }
                        binding.openforsecondlv3.setEnabled(true);
                    }
                };
                handler.postDelayed(runable, 1000);
            }
        });



        binding.Geritusumlvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seskes();
                Intent intent = new Intent(MemoryLevelThree.this, MemoryMap.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });

        binding.Anasayfayadonmlvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seskes();
                Intent intent = new Intent(MemoryLevelThree.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });

        binding.iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(binding.iv11,theCard);
            }
        });

        binding.iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(binding.iv12,theCard);
            }
        });

        binding.iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(binding.iv21,theCard);
            }
        });

        binding.iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(binding.iv22,theCard);
            }
        });
        binding.iv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(binding.iv31,theCard);
            }
        });
        binding.iv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String)view.getTag());
                doStuff(binding.iv32,theCard);
            }
        });


    }
    private void randomimg(){
        ArrayList<Integer> pics= new ArrayList<>();
        img1 =R.drawable.baglama;
        img2 =R.drawable.bateri;
        img3 =R.drawable.davul;
        img4 =R.drawable.tef;
        img5 =R.drawable.flut;
        img6 =R.drawable.gitar;
        img7 =R.drawable.kanun;
        img8 =R.drawable.keman;
        img9 =R.drawable.ksilofon;
        img10 =R.drawable.metronom;
        img11 =R.drawable.obua;
        img12 =R.drawable.piyano;
        img13 =R.drawable.trombon;
        img14 =R.drawable.trompetimg;
        img15 =R.drawable.ud;
        img16 =R.drawable.zil;
        img17 =R.drawable.zurna;
        pics.add(img1);pics.add(img2);pics.add(img3);pics.add(img4);pics.add(img5);pics.add(img6);pics.add(img7);pics.add(img8);
        pics.add(img9);pics.add(img10);pics.add(img11);pics.add(img12);pics.add(img13);pics.add(img14);pics.add(img15);pics.add(img16);
        pics.add(img17);
        Random generator = new Random();
        r = generator.nextInt(17);
        selectedimg = pics.get(r);
        pics.remove(r);
        r2= generator.nextInt(16);
        selectedimg2=pics.get(r2);
        pics.remove(r2);
        r3= generator.nextInt(15);
        selectedimg3=pics.get(r3);
    }

    private void doStuff(ImageView iv, int card) {
        //hangi resim seçildi ve geçici olarak kaydedildi

        if(cardsArray[card]==101){
            iv.setImageResource(selectedimg);
        }
        else if(cardsArray[card]==102){
            iv.setImageResource(selectedimg2);
        }
        else if(cardsArray[card]==103){
            iv.setImageResource(selectedimg3);
        }
        else if(cardsArray[card]==201){
            iv.setImageResource(selectedimg);
        }
        else if(cardsArray[card]==202){
            iv.setImageResource(selectedimg2);
        }
        else if(cardsArray[card]==203){
            iv.setImageResource(selectedimg3);
        }

        if (cardNumber==1){
            firstcard=cardsArray[card];
            if(firstcard>200){
                firstcard = firstcard-100;
            }
            cardNumber=2;
            clickedfirst = card;
            binding.openforsecondlv3.setEnabled(false);
            iv.setEnabled(false);

        }else if(cardNumber==2){
            secondcard = cardsArray[card];
            if(secondcard>200){
                secondcard = secondcard-100;
            }
            cardNumber=1;
            clickedsecond=card;
            binding.iv11.setEnabled(false);
            binding.iv12.setEnabled(false);
            binding.iv21.setEnabled(false);
            binding.iv22.setEnabled(false);
            binding.iv31.setEnabled(false);
            binding.iv32.setEnabled(false);
            binding.openforsecondlv3.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }

    private void calculate() {
        if(firstcard==secondcard){
            if(clickedfirst==0){
                Drawable a = binding.iv11.getDrawable();
                binding.iv11.setVisibility(View.INVISIBLE);
                binding.trueiv11.setImageDrawable(a);
                binding.trueiv11.setVisibility(View.VISIBLE);
                binding.iv11card.setBackgroundResource(R.drawable.border);
            }
            else if(clickedfirst==1){
                Drawable a = binding.iv12.getDrawable();
                binding.iv12.setVisibility(View.INVISIBLE);
                binding.trueiv12.setImageDrawable(a);
                binding.trueiv12.setVisibility(View.VISIBLE);
                binding.iv12card.setBackgroundResource(R.drawable.border);
            }
            else if(clickedfirst==2){
                Drawable a = binding.iv21.getDrawable();
                binding.iv21.setVisibility(View.INVISIBLE);
                binding.trueiv21.setImageDrawable(a);
                binding.trueiv21.setVisibility(View.VISIBLE);
                binding.iv21card.setBackgroundResource(R.drawable.border);
            }
            else if(clickedfirst==3){
                Drawable a = binding.iv22.getDrawable();
                binding.iv22.setVisibility(View.INVISIBLE);
                binding.trueiv22.setImageDrawable(a);
                binding.trueiv22.setVisibility(View.VISIBLE);
                binding.iv22card.setBackgroundResource(R.drawable.border);

            }
            else if(clickedfirst==4){
                Drawable a = binding.iv31.getDrawable();
                binding.iv31.setVisibility(View.INVISIBLE);
                binding.trueiv31.setImageDrawable(a);
                binding.trueiv31.setVisibility(View.VISIBLE);
                binding.iv31card.setBackgroundResource(R.drawable.border);
            }
            else if(clickedfirst==5){
                Drawable a = binding.iv32.getDrawable();
                binding.iv32.setVisibility(View.INVISIBLE);
                binding.trueiv32.setImageDrawable(a);
                binding.trueiv32.setVisibility(View.VISIBLE);
                binding.iv32card.setBackgroundResource(R.drawable.border);
            }


            if(clickedsecond==0){
                Drawable a = binding.iv11.getDrawable();
                binding.iv11.setVisibility(View.INVISIBLE);
                binding.trueiv11.setImageDrawable(a);
                binding.trueiv11.setVisibility(View.VISIBLE);
                binding.iv11card.setBackgroundResource(R.drawable.border);

            }
            else if(clickedsecond==1){
                Drawable a = binding.iv12.getDrawable();
                binding.iv12.setVisibility(View.INVISIBLE);
                binding.trueiv12.setImageDrawable(a);
                binding.trueiv12.setVisibility(View.VISIBLE);
                binding.iv12card.setBackgroundResource(R.drawable.border);

            }
            else if(clickedsecond==2){
                Drawable a = binding.iv21.getDrawable();
                binding.iv21.setVisibility(View.INVISIBLE);
                binding.trueiv21.setImageDrawable(a);
                binding.trueiv21.setVisibility(View.VISIBLE);
                binding.iv21card.setBackgroundResource(R.drawable.border);

            }
            else if(clickedsecond==3){
                Drawable a = binding.iv22.getDrawable();
                binding.iv22.setVisibility(View.INVISIBLE);
                binding.trueiv22.setImageDrawable(a);
                binding.trueiv22.setVisibility(View.VISIBLE);
                binding.iv22card.setBackgroundResource(R.drawable.border);
            }
            else if(clickedsecond==4){
                Drawable a = binding.iv31.getDrawable();
                binding.iv31.setVisibility(View.INVISIBLE);
                binding.trueiv31.setImageDrawable(a);
                binding.trueiv31.setVisibility(View.VISIBLE);
                binding.iv31card.setBackgroundResource(R.drawable.border);
            }
            else if(clickedsecond==5){
                Drawable a = binding.iv32.getDrawable();
                binding.iv32.setVisibility(View.INVISIBLE);
                binding.trueiv32.setImageDrawable(a);
                binding.trueiv32.setVisibility(View.VISIBLE);
                binding.iv32card.setBackgroundResource(R.drawable.border);
            }
        }
        else{
            sesfalse();

            binding.iv11.setImageResource(R.drawable.questionmark2);
            binding.iv12.setImageResource(R.drawable.questionmark2);
            binding.iv21.setImageResource(R.drawable.questionmark2);
            binding.iv22.setImageResource(R.drawable.questionmark2);
            binding.iv31.setImageResource(R.drawable.questionmark2);
            binding.iv32.setImageResource(R.drawable.questionmark2);
        }
        binding.iv11.setEnabled(true);
        binding.iv12.setEnabled(true);
        binding.iv21.setEnabled(true);
        binding.iv22.setEnabled(true);
        binding.iv31.setEnabled(true);
        binding.iv32.setEnabled(true);
        binding.openforsecondlv3.setEnabled(true);
        checkEnd();
    }

    private void checkEnd() {
        if(binding.iv11.getVisibility()==View.INVISIBLE&&
                binding.iv12.getVisibility()==View.INVISIBLE&&
                binding.iv21.getVisibility()==View.INVISIBLE&&
                binding.iv22.getVisibility()==View.INVISIBLE&&
                binding.iv31.getVisibility()==View.INVISIBLE&&
                binding.iv32.getVisibility()==View.INVISIBLE){
            sestrue();
            Bundle extras = getIntent().getExtras();
            int intentpicker = (Integer) extras.get("LVL3");
            mediaPlayerdogrucevap.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    if (intentpicker == 1) {
                        Intent intent = new Intent(MemoryLevelThree.this, MemoryLevelThree.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        intent.putExtra("LVL3", 2);
                        startActivity(intent);
                        finish();
                    } else if (intentpicker == 2) {
                        Intent intent = new Intent(MemoryLevelThree.this, MemoryLevelThree.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        intent.putExtra("LVL3", 3);
                        startActivity(intent);
                        finish();
                    } else if (intentpicker == 3) {
                        Intent intent = new Intent(MemoryLevelThree.this, MemoryLevelThree.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        intent.putExtra("LVL3", 4);
                        startActivity(intent);
                        finish();
                    } else if (intentpicker == 4) {
                        Intent intent = new Intent(MemoryLevelThree.this, MemoryLevelThree.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        intent.putExtra("LVL3", 5);
                        startActivity(intent);
                        finish();
                    } else if (intentpicker == 5) {
                        Intent intent = new Intent(MemoryLevelThree.this, MemoryLevelFour.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        intent.putExtra("LVL4", 1);
                        startActivity(intent);
                        finish();
                    }
                }
            });
        }
    }
    private void sesfalse(){
        if(mediaPlayeryanliscevap.isPlaying()){
            mediaPlayeryanliscevap.pause();
            mediaPlayeryanliscevap.seekTo(0);
        }
        if(mediaPlayerdogrucevap.isPlaying()){
            mediaPlayerdogrucevap.pause();
            mediaPlayerdogrucevap.seekTo(0);
        }
        mediaPlayeryanliscevap.start();
    }
    private void sestrue(){
        if(mediaPlayerdogrucevap.isPlaying()){
            mediaPlayerdogrucevap.pause();
            mediaPlayerdogrucevap.seekTo(0);
        }
        if(mediaPlayeryanliscevap.isPlaying()){
            mediaPlayeryanliscevap.pause();
            mediaPlayeryanliscevap.seekTo(0);
        }
        mediaPlayerdogrucevap.start();
    }
    private void seskes(){
        if(mediaPlayeryanliscevap!=null){
            mediaPlayeryanliscevap.stop();
            mediaPlayeryanliscevap.release();
            mediaPlayeryanliscevap = null;
        }
        if(mediaPlayerdogrucevap!=null){
            mediaPlayerdogrucevap.stop();
            mediaPlayerdogrucevap.release();
            mediaPlayerdogrucevap = null;
        }
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