package com.leskovskij.homework1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.leskovskij.androidcourse.R;

public class HomeWork1Activity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work1);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        Button startButton = (Button) findViewById(R.id.button);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CharSequence charSeq = textView1.getText();
                textView1.setText(textView2.getText());
                textView2.setText(charSeq);
            }
        });
        textView1.setOnClickListener(new MyOnTextClickListener());
        textView2.setOnClickListener(new MyOnTextClickListener());
    }
    class MyOnTextClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            CharSequence charSeq = textView1.getText();
            textView1.setText(textView2.getText());
            textView2.setText(charSeq);
        }
    }

}
