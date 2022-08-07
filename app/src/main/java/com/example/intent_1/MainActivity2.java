package com.example.intent_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        define();
        click();

    }

    public void define() {
        textView = (TextView) findViewById(R.id.txt);
    }

    public void pass() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void click() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pass();
            }
        });
    }
}