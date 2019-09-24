package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        change_text();


    }

    private void change_text(){
        final String[] strings_base = {"You da best!", "What if the dramatic practice ate the hurry?", "The unripe county can't rain the option.", "Is the question independence better than the might?",
        "Is the unite classroom better than the landscape?", "What if the aromatic beach ate the top?"};

        final TextView changing_text = (TextView) findViewById(R.id.text_to_change);
        Button button_change_text = (Button) findViewById(R.id.button_change_text);

        button_change_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int) (Math.random() * strings_base.length);

                changing_text.setText(strings_base[random]);

            }
        });

    }

}
