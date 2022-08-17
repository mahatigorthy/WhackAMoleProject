package com.example.whackamoleproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Game extends AppCompatActivity {
    static ConstraintLayout layout;
    static ArrayList<ImageView> scoreList;
    static ImageView imgHole1, imgHole2, imgHole3, imgHole4, imgHole5, imgHole6, imgHole7, imgHole8, imgHole9;
    static ImageView mole1, mole2, mole3, mole4, mole5, mole6, mole7, mole8, mole9;
    TimerTask t;
    static TextView timerTextView;
    static int score = 0;
    static AtomicInteger si = new AtomicInteger(60);;
    static int kVal;
    float micVal = .1f;
    static final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
    static int siMole1, siMole2, siMole3, siMole4, siMole5, siMole6, siMole7, siMole8, siMole9;
    static int randPrevValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);timerTextView = findViewById(R.id.timeTextView);

        imgHole1 = findViewById(R.id.imageView1);
        imgHole2 = findViewById(R.id.imageView2);
        imgHole3 = findViewById(R.id.imageView3);
        imgHole4 = findViewById(R.id.imageView4);
        imgHole5 = findViewById(R.id.imageView5);
        imgHole6 = findViewById(R.id.imageView6);
        imgHole7 = findViewById(R.id.imageView7);
        imgHole8 = findViewById(R.id.imageView8);
        imgHole9 = findViewById(R.id.imageView9);

        mole1 = findViewById(R.id.imageViewMole1);
        mole2 = findViewById(R.id.imageViewMole2);
        mole3 = findViewById(R.id.imageViewMole3);
        mole4 = findViewById(R.id.imageViewMole4);
        mole5 = findViewById(R.id.imageViewMole5);
        mole6 = findViewById(R.id.imageViewMole6);
        mole7 = findViewById(R.id.imageViewMole7);
        mole8 = findViewById(R.id.imageViewMole8);
        mole9 = findViewById(R.id.imageViewMole9);

        mole1.setVisibility(View.INVISIBLE);
        mole2.setVisibility(View.INVISIBLE);
        mole3.setVisibility(View.INVISIBLE);
        mole4.setVisibility(View.INVISIBLE);
        mole5.setVisibility(View.INVISIBLE);
        mole6.setVisibility(View.INVISIBLE);
        mole7.setVisibility(View.INVISIBLE);
        mole8.setVisibility(View.INVISIBLE);
        mole9.setVisibility(View.INVISIBLE);

        scoreList = new ArrayList<ImageView>();

        layout = findViewById(R.id.layout);

        //ANIMATIONS
        scaleAnimation.setDuration(400);

        mole1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mole1.setImageResource(R.drawable.harryhit);
                view.startAnimation(scaleAnimation);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mole1.setVisibility(View.INVISIBLE);
                        mole1.setImageResource(R.drawable.harry);
                    }
                }, 1000);
                score++;
                micVal++;
                addImageView(micVal);
            }
        });

        mole2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mole2.setImageResource(R.drawable.louishit);
                view.startAnimation(scaleAnimation);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mole2.setVisibility(View.INVISIBLE);
                        mole2.setImageResource(R.drawable.louis);
                    }
                }, 1000);
                score++;
                micVal++;
                addImageView(micVal);
            }
        });

        mole3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mole3.setImageResource(R.drawable.niallhit);
                view.startAnimation(scaleAnimation);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mole3.setVisibility(View.INVISIBLE);
                        mole3.setImageResource(R.drawable.niall);
                    }
                }, 1000);
                score++;
                micVal++;
                addImageView(micVal);
            }
        });

        mole4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mole4.setImageResource(R.drawable.zaynhit);
                view.startAnimation(scaleAnimation);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mole4.setVisibility(View.INVISIBLE);
                        mole4.setImageResource(R.drawable.zayn);
                    }
                }, 1000);
                score++;
                micVal++;
                addImageView(micVal);
            }
        });

        mole5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mole5.setImageResource(R.drawable.liamhit);
                view.startAnimation(scaleAnimation);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mole5.setVisibility(View.INVISIBLE);
                        mole5.setImageResource(R.drawable.liam);
                    }
                }, 1000);
                score++;
                micVal++;
                addImageView(micVal);
            }
        });

        mole6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mole6.setImageResource(R.drawable.harryhit);
                view.startAnimation(scaleAnimation);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mole6.setVisibility(View.INVISIBLE);
                        mole6.setImageResource(R.drawable.harry);
                    }
                }, 1000);
                score++;
                micVal++;
                addImageView(micVal);
            }
        });

        mole7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(scaleAnimation);
                mole7.setVisibility(View.INVISIBLE);
                si.getAndAdd(3);
                Toast.makeText(Game.this, "fangirl clicked, 3 seconds added", Toast.LENGTH_LONG).show();
            }
        });

        mole8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mole8.setImageResource(R.drawable.niallhit);
                view.startAnimation(scaleAnimation);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mole8.setVisibility(View.INVISIBLE);
                        mole8.setImageResource(R.drawable.niall);
                    }
                }, 1000);
                score++;
                micVal++;
                addImageView(micVal);
            }
        });

        mole9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mole9.setImageResource(R.drawable.zaynhit);
                view.startAnimation(scaleAnimation);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mole9.setVisibility(View.INVISIBLE);
                        mole9.setImageResource(R.drawable.zayn);
                    }
                }, 1000);
                score++;
                micVal++;
                addImageView(micVal);
            }
        });

        //TIMER
        Random random = new Random();

        Timer timer = new Timer();
        t = new TimerTask() {
            @Override
            public void run() {
                if (si.get() > 0) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            addMethod(1);
                            checkMole(si.intValue());
                            boolean val = random.nextBoolean();
                            if (val == true) {
                                int randImage = (int) (Math.random() * 10 + 1);
                                while(randPrevValue == randImage)
                                {
                                    randImage = (int) (Math.random() * 10 + 1);
                                }
                                randPrevValue = randImage;
                                Log.d("randImageVal", String.valueOf(randImage));
                                animationImageAppear(randImage);
                            }
                        }
                    });
                } else {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Game.this, "game over!", Toast.LENGTH_LONG).show();
                            endGame(); }
                    });
                    timer.cancel();
                }
            }
        };


        BackgroundSound mBackgroundSound = new BackgroundSound();
        mBackgroundSound.execute();
        timer.schedule(t, 0, 1 * 1000);
        Toast.makeText(Game.this, "game has begun!", Toast.LENGTH_LONG).show();

    } //end

    public static synchronized void addMethod(int k) {
        kVal = si.intValue() - k;
        si.set(kVal);
        timerTextView.setText("TIME: " + si+" seconds left");
    }

    public void endGame()
    {
        //check if visible
        if(mole1.isShown() == true) {
            mole1.setVisibility(View.INVISIBLE);
        }
        if(mole2.isShown() == true) {
            mole2.setVisibility(View.INVISIBLE);
        }
        if(mole3.isShown() == true) {
            mole3.setVisibility(View.INVISIBLE);
        }
        if(mole4.isShown() == true) {
            mole4.setVisibility(View.INVISIBLE);
        }
        if(mole5.isShown() == true) {
            mole5.setVisibility(View.INVISIBLE);
        }
        if(mole6.isShown() == true) {
            mole6.setVisibility(View.INVISIBLE);
        }
        if(mole7.isShown() == true) {
            mole7.setVisibility(View.INVISIBLE);
        }
        if(mole8.isShown() == true) {
            mole8.setVisibility(View.INVISIBLE);
        }
        if(mole9.isShown() == true) {
            mole9.setVisibility(View.INVISIBLE);
        }

        //add score textview
        TextView textView = new TextView(this);
        textView.setId(View.generateViewId());

        ConstraintLayout.LayoutParams params2 = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        textView.setLayoutParams(params2);
        layout.addView(textView);

        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(layout);

        constraintSet.connect(textView.getId(), ConstraintSet.TOP, layout.getId(), ConstraintSet.TOP);
        constraintSet.connect(textView.getId(), ConstraintSet.BOTTOM, layout.getId(), ConstraintSet.BOTTOM);
        constraintSet.connect(textView.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(textView.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);

        textView.setBackgroundColor(Color.WHITE);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(45);
        Typeface typeface = getResources().getFont(R.font.font);
        textView.setTypeface(typeface);
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setText("FINAL SCORE: \n"+score);

        constraintSet.applyTo(layout);
    }

    public void addImageView(float val) {

        if(score%5==0) {
            ImageView image = new ImageView(this);
            image.setId(View.generateViewId());
            image.setImageResource(R.drawable.mic);

            ConstraintLayout.LayoutParams params1 = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT_PERCENT * 40, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT_PERCENT * 70);
            image.setLayoutParams(params1);

            layout.addView(image);

            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(layout);

            scoreList.add(image);

            View previousItem = null;
            for (int i = 0; i < scoreList.size(); i++) {
                boolean lastItem = scoreList.indexOf(i) == scoreList.size() - 1;
                if (previousItem == null) {
                    constraintSet.connect(scoreList.get(i).getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT);
                    constraintSet.connect(scoreList.get(i).getId(), ConstraintSet.BOTTOM, layout.getId(), ConstraintSet.BOTTOM, 70);
                } else {
                    constraintSet.connect(scoreList.get(i).getId(), ConstraintSet.LEFT, previousItem.getId(), ConstraintSet.RIGHT);
                    constraintSet.connect(scoreList.get(i).getId(), ConstraintSet.BOTTOM, layout.getId(), ConstraintSet.BOTTOM, 70);
                    if (lastItem) {
                        constraintSet.connect(scoreList.get(i).getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT);
                        constraintSet.connect(scoreList.get(i).getId(), ConstraintSet.BOTTOM, layout.getId(), ConstraintSet.BOTTOM, 70);
                    }
                }
                previousItem = scoreList.get(i);
            }

            constraintSet.applyTo(layout);
        }

    }


    public void animationImageAppear(int randVal) {
        Animation scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_up);

        switch (randVal) {
            //if its 10, it will show a one direction fan girl and the si will decrease by 5 and there will be a toast
            case 1: {
                siMole1 = si.intValue();
                mole1.setVisibility(View.VISIBLE);
                mole1.startAnimation(scaleDown);
                break;
            }
            case 2: {
                siMole2 = si.intValue();
                mole2.setVisibility(View.VISIBLE);
                mole2.startAnimation(scaleDown);
                break;
            }
            case 3: {
                siMole3 = si.intValue();
                mole3.setVisibility(View.VISIBLE);
                mole3.startAnimation(scaleDown);
                break;
            }
            case 4: {
                siMole4 = si.intValue();
                mole4.setVisibility(View.VISIBLE);
                mole4.startAnimation(scaleDown);
                break;
            }
            case 5: {
                siMole5 = si.intValue();
                mole5.setVisibility(View.VISIBLE);
                mole5.startAnimation(scaleDown);
                break;
            }
            case 6: {
                siMole6 = si.intValue();
                mole6.setVisibility(View.VISIBLE);
                mole6.startAnimation(scaleDown);
                break;
            }
            case 7: {
                siMole7 = si.intValue();
                mole7.setVisibility(View.VISIBLE);
                mole7.startAnimation(scaleDown);
                break;
            }
            case 8: {
                siMole8 = si.intValue();
                mole8.setVisibility(View.VISIBLE);
                mole8.startAnimation(scaleDown);
                break;
            }
            case 9: {
                siMole9 = si.intValue();
                mole9.setVisibility(View.VISIBLE);
                mole9.startAnimation(scaleDown);
                break;
            }

        } //first switch statement
    } //end

    public class BackgroundSound extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            MediaPlayer player = MediaPlayer.create(Game.this, R.raw.backgroundmusic);
            player.setLooping(true); // Set looping
            player.setVolume(100, 100);
            player.start();
            return null;
        }
    }

    public void checkMole (int siVal)
    {
        if(mole1.isShown() == true) {
            if (siMole1 - 3 >= siVal)
            {
                Log.d("here", "here");
                mole1.setVisibility(View.INVISIBLE);
            }
        }
        if(mole2.isShown() == true) {
            if (siMole2 - 3 >= siVal)
            {
                Log.d("here", "here");
                mole2.setVisibility(View.INVISIBLE);
            }
        }
        if(mole3.isShown() == true) {
            if (siMole3 - 3 >= siVal)
            {
                mole3.setVisibility(View.INVISIBLE);
            }
        }
        if(mole4.isShown() == true) {
            if (siMole4 - 3 >= siVal)
            {
                mole4.setVisibility(View.INVISIBLE);
            }
        }
        if(mole5.isShown() == true) {
            if (siMole5 - 3 >= siVal)
            {
                mole5.setVisibility(View.INVISIBLE);
            }
        }
        if(mole6.isShown() == true) {
            if (siMole6 - 3 >= siVal)
            {
                mole6.setVisibility(View.INVISIBLE);
            }
        }
        if(mole7.isShown() == true) {
            if (siMole7 - 3 >= siVal)
            {
                mole7.setVisibility(View.INVISIBLE);
            }
        }
        if(mole8.isShown() == true) {
            if (siMole8 - 3 >= siVal)
            {
                mole8.setVisibility(View.INVISIBLE);
            }
        }
        if(mole9.isShown() == true) {
            if (siMole9 - 3 >= siVal)
            {
                mole9.setVisibility(View.INVISIBLE);
            }
        }

    }

}