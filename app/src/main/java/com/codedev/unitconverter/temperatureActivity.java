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

public class temperatureActivity extends AppCompatActivity {
    EditText getn;
    TextView answer;
    Spinner s1,s2;
    private String unitf,unitto;
    Button c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        getn=findViewById(R.id.editTextNumber1);
        answer=findViewById(R.id.answer);
        s1=findViewById(R.id.spinner1);
        s2=findViewById(R.id.spinner2);
        c=findViewById(R.id.convertButton);

        String[] items=new String[]{"Select Unit","Celsius","Fahrenheit","Kelvin"};
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
                    convo=33.8;
                }else if(unitf==items[1]&& unitto==items[3]){
                    convo = 274.15;
                }
                else if(unitf==items[2]&& unitto==items[1]){
                    convo = -17.2222222222;
                }else if(unitf==items[2]&& unitto==items[2]){
                    convo = 1;
                }else if(unitf==items[2]&& unitto==items[3]){
                    convo = 255.9277777778;
                }else if(unitf==items[3]&& unitto==items[1]){
                    convo=-272.15;
                }else if(unitf==items[3]&& unitto==items[2]){
                    convo= -457.87;
                }else if(unitf==items[3]&& unitto==items[3]){
                    convo = 1;
                }
                double a=convo*n;
                answer.setText(String.valueOf(a));
            }
        });
    }
}