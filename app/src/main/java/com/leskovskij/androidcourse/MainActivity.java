package com.leskovskij.androidcourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.leskovskij.classwork4.ClassWork4Activity;
import com.leskovskij.classwork5.ClassWork5Activity;
import com.leskovskij.classwork6.ClassWork6Activity;
import com.leskovskij.homework1.HomeWork1Activity;
import com.leskovskij.homework4.HomeWork4Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonHW1 = (Button) findViewById(R.id.buttonHW1);
        buttonHW1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeWork1Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.rotate,R.anim.rotate);
            }
        });

        Button buttonCW4 = (Button) findViewById(R.id.buttonCW4);
        buttonCW4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClassWork4Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.diagonaltranslate,R.anim.alpha);
            }
        });
        Button buttonHW4 = (Button) findViewById(R.id.buttonHW4);
        buttonHW4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeWork4Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.rotate,R.anim.diagonaltranslate);//TODO: to change the animation
            }
        });
        Button buttonCW5 = (Button) findViewById(R.id.buttonCW5);
        buttonCW5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClassWork5Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.diagonaltranslate,R.anim.diagonaltranslate);
            }
        });
        Button buttonCW6 = (Button) findViewById(R.id.buttonCW6);
        buttonCW6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClassWork6Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.alpha,R.anim.alpha);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
