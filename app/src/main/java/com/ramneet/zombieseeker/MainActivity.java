package com.ramneet.zombieseeker;

//import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 5;

    Button buttons[][] = new Button[NUM_ROWS][NUM_COLS];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = WelcomeScreen.makeLaunchIntent(MainActivity.this);
        startActivity(i);

        setupLaunchGameScreen();
        setupHelpScreen();
        setupOptionScreen();
//        setupMainMenu();
    }

    private void setupLaunchGameScreen() {
        Button button = findViewById(R.id.playButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = GameScreen.makeLaunchIntent(MainActivity.this);
                startActivity(i);
            }
        });
    }

    private void setupHelpScreen() {
        Button button = findViewById(R.id.helpButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HelpScreen.class);
                startActivity(intent);
            }
        });
    }

    private void setupOptionScreen() {
        Button button = findViewById(R.id.optionsButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = OptionScreen.makeLaunchIntent(MainActivity.this);
                startActivity(i);
            }
        });
    }


}
