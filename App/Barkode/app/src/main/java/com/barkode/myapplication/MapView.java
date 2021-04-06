package com.barkode.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MapView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.mapview);
        Switch mapbtn = (Switch) findViewById(R.id.switch2);
        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoActivity(view);
            }
        });
    }

    public void gotoActivity(View view) {
        Intent intent = new Intent(MapView.this, ViewAll.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}