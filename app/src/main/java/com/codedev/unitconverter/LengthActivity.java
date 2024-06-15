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

public class LengthActivity extends AppCompatActivity {
    EditText getn;
    TextView answer;
    Spinner s1,s2;
    private String unitf,unitto;
    Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        getn=findViewById(R.id.editTextNumber1);
        answer=findViewById(R.id.answer);
        s1=findViewById(R.id.spinner1);
        s2=findViewById(R.id.spinner2);
        c=findViewById(R.id.convertButton);

        String[] items=new String[]{"Select Unit","milimeter","centimeter","kilometer","meter","feet","yards","mile"};
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
                    convo=0.1;
                }else if(unitf==items[1]&& unitto==items[3]){
                    convo = 0.000001;
                }else if(unitf==items[1]&& unitto==items[4]){
                    convo = 0.001;
                }
                else if(unitf==items[1]&& unitto==items[5]){
                    convo = 0.00328084;
                }
                else if(unitf==items[1]&& unitto==items[6]){
                    convo = 0.00109361;
                }
                else if(unitf==items[1]&& unitto==items[7]){
                    convo = 6.2137e-7;
                }else if(unitf==items[2]&& unitto==items[1]){
                    convo = 10;
                }else if(unitf==items[2]&& unitto==items[2]){
                    convo = 1;
                }else if(unitf==items[2]&& unitto==items[3]){
                    convo = 0.00001;
                }else if(unitf==items[2]&& unitto==items[4]){
                    convo = 0.01;
                }else if(unitf==items[2]&& unitto==items[5]){
                    convo = 0.0328084;
                }else if(unitf==items[2]&& unitto==items[6]){
                    convo = 0.0109361;
                }else if(unitf==items[2]&& unitto==items[7]){
                    convo = 6.2137e-6;
                }else if(unitf==items[3]&& unitto==items[1]){
                    convo=1e9;
                }else if(unitf==items[3]&& unitto==items[2]){
                    convo= 1e7;
                }else if(unitf==items[3]&& unitto==items[3]){
                    convo = 1;
                }else if(unitf==items[3]&& unitto==items[4]){
                    convo = 0.001;
                }else if(unitf==items[3]&& unitto==items[5]){
                    convo = 3.28084;
                }else if(unitf==items[3]&& unitto==items[6]){
                    convo = 1.09361;
                }else if(unitf==items[3]&& unitto==items[7]){
                    convo = 6.2137e-4;
                }else if(unitf==items[4]&& unitto==items[1]){
                    convo=1e3;
                }else if(unitf==items[4]&& unitto==items[2]){
                    convo=1e2;
                }else if(unitf==items[4]&& unitto==items[3]){
                    convo= 1e-3;
                }else if(unitf==items[4]&& unitto==items[4]){
                    convo = 1;
                }else if(unitf==items[4]&& unitto==items[5]){
                    convo = 3.28084;
                }else if(unitf==items[4]&& unitto==items[6]){
                    convo = 1.09361;
                }else if(unitf==items[4]&& unitto==items[7]){
                    convo = 6.2137e-4;
                }else if(unitf==items[5]&& unitto==items[1]){
                    convo=304.8;
                }else if(unitf==items[5]&& unitto==items[2]){
                    convo=30.48;
                }else if(unitf==items[5]&& unitto==items[3]){
                    convo=3.048e-4;
                }else if(unitf==items[5]&& unitto==items[4]){
                    convo=0.3048;
                }else if(unitf==items[5]&& unitto==items[5]){
                    convo = 1;
                }else if(unitf==items[5]&& unitto==items[6]){
                    convo = 0.333333;
                }else if(unitf==items[5]&& unitto==items[7]){
                    convo = 1.894e-4;
                }else if(unitf==items[6]&& unitto==items[1]){
                    convo =914.400;
                }else if(unitf==items[6]&& unitto==items[2]){
                    convo =91.44;
                }else if(unitf==items[6]&& unitto==items[3]){
                    convo =0.0009144;
                }else if(unitf==items[6]&& unitto==items[4]){
                    convo =0.9144;
                }else if(unitf==items[6]&& unitto==items[5]){
                    convo =3;
                }else if(unitf==items[6]&& unitto==items[6]){
                    convo = 1;
                }else if(unitf==items[6]&& unitto==items[7]){
                    convo = 0.0005681818;
                }else if(unitf==items[7]&& unitto==items[1]){
                    convo=1609344;
                }else if(unitf==items[7]&& unitto==items[2]){
                    convo=160934.4;
                }else if(unitf==items[7]&& unitto==items[3]){
                    convo=1.60934;
                }else if(unitf==items[7]&& unitto==items[4]){
                    convo=1609.34;
                }else if(unitf==items[7]&& unitto==items[5]){
                    convo=5280 ;
                }else if(unitf==items[7]&& unitto==items[6]){
                    convo=1760 ;
                }else if(unitf==items[7]&& unitto==items[7]){
                    convo = 1;
                }
                double a=convo*n;
                answer.setText(String.valueOf(a));

            }
        });


    }
}