package com.codedev.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CardView l,m,v,d,temp,ti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.length);
        m=findViewById(R.id.mass);
        v=findViewById(R.id.volume);
        d=findViewById(R.id.data);
        temp=findViewById(R.id.temp);
        ti=findViewById(R.id.time);

        l.setOnClickListener(this);
        m.setOnClickListener(this);
        temp.setOnClickListener(this);
        v.setOnClickListener(this);
        d.setOnClickListener(this);
        ti.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.length:
                intent = new Intent(MainActivity.this, LengthActivity.class);
                startActivity(intent);
                break;
            case R.id.mass:
                intent = new Intent(MainActivity.this, MassActivity.class);
                startActivity(intent);
                break;
            case R.id.temp:
                intent = new Intent(MainActivity.this, temperatureActivity.class);
                startActivity(intent);
                break;
            case R.id.volume:
                intent = new Intent(MainActivity.this, volumeActivity.class);
                startActivity(intent);
                break;
            case R.id.data:
                intent = new Intent(MainActivity.this, dataActivity.class);
                startActivity(intent);
                break;
            case R.id.time:
                intent = new Intent(MainActivity.this, TimeActivity.class);
                startActivity(intent);
                break;
        }
    }
}