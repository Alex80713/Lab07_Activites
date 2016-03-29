package com.example.android.lab07_activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
private TextView m_tv_main_activity_message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        init();
    }
    private void init() {
        m_tv_main_activity_message = (TextView)findViewById(R.id.tv_main_activity_message);
        initBackground();
    }
    private void initBackground() {
        int color = getIntent().getIntExtra(ColorPickerActivity.BUNDLE_KEY_COLOR_INT, -1);
        if (color == -1) {
            return;
        }
        m_tv_main_activity_message.setBackgroundColor(color);
            }

    public void next(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
