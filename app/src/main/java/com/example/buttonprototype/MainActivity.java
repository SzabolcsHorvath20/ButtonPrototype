package com.example.buttonprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout pRelLayout;
    private Button btnChange;
    private Random rnd;
    private int seged = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        (new Thread(new Runprototype())).start();

    }
    public void init()
    {
        pRelLayout = findViewById(R.id.pRelLayout);
        btnChange = findViewById(R.id.btnChange);
    }
    public void handler()
    {
        while (seged != 0) {
            btnChange.setBackgroundColor(Color.rgb(255,0,0));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            btnChange.setBackgroundColor(Color.rgb(0,255,0));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seged--;
        }
    }
    public class Runprototype implements Runnable
    {
        public void run() {
            handler();
        }
    }

}
