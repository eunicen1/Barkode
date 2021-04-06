package com.barkode.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

import butterknife.ButterKnife;

public class ViewAll extends AppCompatActivity {
    //TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.viewall);

        TextView textView = findViewById(R.id.textView2);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        DatabaseReference ventilatorsRef = ref.child("ventilators");
        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("ventilators");
        */
        ventilatorsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Map<String, Object> ventilators =  (Map<String, Object>)snapshot.getValue();
                textView.setText("Ventilators");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        Switch mapbtn =(Switch) findViewById(R.id.mapSwitch);
        mapbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                gotoActivity(view);
            }
        });
    }
    public void gotoActivity(View view){
        Intent intent = new Intent(ViewAll.this, MapView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    }

