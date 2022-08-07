package com.example.intent_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        define();
        click();

    }

    private void define() {
        btn = (Button) findViewById(R.id.button);
    }

    public void pass() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void click() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pass();
            }
        });
    }
}