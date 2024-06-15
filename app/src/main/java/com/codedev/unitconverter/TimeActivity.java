package com.codedev.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {
    EditText getn;
    TextView answer;
    Spinner s1,s2;
    private String unitf,unitto;
    Button c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        getn=findViewById(R.id.editTextNumber1);
        answer=findViewById(R.id.answer);
        s1=findViewById(R.id.spinner1);
        s2=findViewById(R.id.spinner2);
        c=findViewById(R.id.convertButton);

        String[] items=new String[]{"Select Unit","Miliseconds","Seconds","Minutes","Hours","Days","Weeks"};
        s1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,items));

        s2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,items));
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                unitf=s1.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                unitto=s2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n=Integer.parseInt(String.valueOf(getn.getText()));


                double convo = 0;
                if(unitf==items[1]&& unitto==items[1]){
                    convo=1;
                }else if(unitf==items[1]&& unitto==items[2]){
                    convo=0.001;
                }else if(unitf==items[1]&& unitto==items[3]){
                    convo = 0.0000166667;
                }else if(unitf==items[1]&& unitto==items[4]){
                    convo = 2.777777778e-7;
                }
                else if(unitf==items[1]&& unitto==items[5]){
                    convo = 1.15740741e-8;
                }
                else if(unitf==items[1]&& unitto==items[6]){
                    convo = 1.65343915e-9;
                }
                else if(unitf==items[2]&& unitto==items[1]){
                    convo = 1000;
                }else if(unitf==items[2]&& unitto==items[2]){
                    convo = 1;
                }else if(unitf==items[2]&& unitto==items[3]){
                    convo = 0.166666667;
                }else if(unitf==items[2]&& unitto==items[4]){
                    convo = 0.0002777778;
                }else if(unitf==items[2]&& unitto==items[5]){
                    convo = 0.0000115741;
                }else if(unitf==items[2]&& unitto==items[6]){
                    convo = 0.0000016534;
                }else if(unitf==items[3]&& unitto==items[1]){
                    convo=60000;
                }else if(unitf==items[3]&& unitto==items[2]){
                    convo= 60;
                }else if(unitf==items[3]&& unitto==items[3]){
                    convo = 1;
                }else if(unitf==items[3]&& unitto==items[4]){
                    convo = 0.0166666667;
                }else if(unitf==items[3]&& unitto==items[5]){
                    convo = 0.0006944444;
                }else if(unitf==items[3]&& unitto==items[6]){
                    convo = 0.0000992063;
                }else if(unitf==items[4]&& unitto==items[1]){
                    convo=3600000;
                }else if(unitf==items[4]&& unitto==items[2]){
                    convo=3600;
                }else if(unitf==items[4]&& unitto==items[3]){
                    convo= 60;
                }else if(unitf==items[4]&& unitto==items[4]){
                    convo = 1;
                }else if(unitf==items[4]&& unitto==items[5]){
                    convo = 0.0416666667;
                }else if(unitf==items[4]&& unitto==items[6]){
                    convo = 0.005952381;
                }else if(unitf==items[5]&& unitto==items[1]){
                    convo=86400000;
                }else if(unitf==items[5]&& unitto==items[2]){
                    convo=86400;
                }else if(unitf==items[5]&& unitto==items[3]){
                    convo=1440;
                }else if(unitf==items[5]&& unitto==items[4]){
                    convo=24;
                }else if(unitf==items[5]&& unitto==items[5]){
                    convo = 1;
                }else if(unitf==items[5]&& unitto==items[6]){
                    convo = 0.1428571429;
                }else if(unitf==items[6]&& unitto==items[1]){
                    convo =604800000;
                }else if(unitf==items[6]&& unitto==items[2]){
                    convo =604800;
                }else if(unitf==items[6]&& unitto==items[3]){
                    convo =10080;
                }else if(unitf==items[6]&& unitto==items[4]){
                    convo =168;
                }else if(unitf==items[6]&& unitto==items[5]){
                    convo =7;
                }else if(unitf==items[6]&& unitto==items[6]){
                    convo = 1;
                }
                double a=convo*n;
                answer.setText(String.valueOf(a));

            }
        });
    }
}