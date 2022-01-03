package com.example.yashlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.my_library.Yash;

public class MainActivity extends AppCompatActivity {

    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yash.dialog(MainActivity.this,"Alert For You !", "Your Battery is Low",R.color.cardview_light_background,R.color.white,R.drawable.ic_baseline_battery_alert_24,R.font.montserratmedium);
            }
        });
    }
}