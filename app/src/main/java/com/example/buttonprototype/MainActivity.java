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
    private Button btnChange, btnChange2;
    private Random rnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        (new Thread(new Runprototype())).start();
        (new Thread(new Runprototype2())).start();

    }
    public void init()
    {
        pRelLayout = findViewById(R.id.pRelLayout);
        btnChange = findViewById(R.id.btnChange);
        btnChange2 = findViewById(R.id.btnChange2);
    }
    public void handler(Button change)
    {
        int seged = 40;
        while (seged != 0) {
            change.setBackgroundColor(Color.rgb(255,0,0));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            change.setBackgroundColor(Color.rgb(0,255,0));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seged--;
        }
    }
    public class Runprototype implements Runnable
    {
        public void run() {
            handler(btnChange);
        };
    }
    public class Runprototype2 implements Runnable
    {
        public void run() {
            handler(btnChange2);
        };
    }
}

