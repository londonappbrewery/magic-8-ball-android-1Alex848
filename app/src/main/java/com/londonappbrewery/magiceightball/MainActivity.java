package com.londonappbrewery.magiceightball;

import android.provider.ContactsContract;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button askButton;
    private ImageView eightBallImage;
    private final int[] eightBallArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        askButton = (Button) findViewById(R.id.ask_button);
        eightBallImage = (ImageView) findViewById(R.id.image_eightBall);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random  random = new Random();
                int randomNum = random.nextInt(5);
                eightBallImage.setImageResource(eightBallArray[randomNum]);
            }
        });
    }
}
