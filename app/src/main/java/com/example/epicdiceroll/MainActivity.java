package com.example.epicdiceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random rng = new Random();
    MediaPlayer critRoll;
    MediaPlayer normalRoll;
    MediaPlayer lameRoll;
    String critString = "critical hit";
    String lameString = "lame hit";

    public class SplashActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice =  findViewById(R.id.image_view_dice);
        normalRoll = MediaPlayer.create(this, R.raw._normalRoll);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();

            }
        });
    }
    private void rollDice()
    {
        int randomNumber = rng.nextInt(20) +1;

        switch(randomNumber) {
            case 1:
                Toast.makeText(getApplicationContext(),lameString,Toast,LENGTH_LONG.show());
                imageViewDice.setImageResource(R.drawable.d201);
                lameRoll = MediaPlayer.create(this, R.raw._lameRoll);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d202);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d203);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d204);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d205);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d206);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d207);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d208);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d209);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d2010);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d2011);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d2012);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d2013);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d2014);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d2015);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d2016);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d2017);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d2018);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d2019);
                break;
            case 20:
                Toast.makeText(getApplicationContext(),critString,Toast,LENGTH_LONG.show());
                imageViewDice.setImageResource(R.drawable.d2020);

                critRoll = MediaPlayer.create(this, R.raw._critRoll);
                break;


        }
    }
}
