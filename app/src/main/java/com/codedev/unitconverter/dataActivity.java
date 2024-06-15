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

public class dataActivity extends AppCompatActivity {
    EditText getn;
    TextView answer;
    Spinner s1,s2;
    private String unitf,unitto;
    Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        getn=findViewById(R.id.editTextNumber1);
        answer=findViewById(R.id.answerd);
        s1=findViewById(R.id.spinnerd1);
        s2=findViewById(R.id.spinnerd2);
        c=findViewById(R.id.convertButtond);
        String[] items=new String[]{"Select Unit","Bits","Bytes","kilobytes","Megabytes","Gigabytes","Terabytes"};
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
                    convo=0.125;
                }else if(unitf==items[1]&& unitto==items[3]){
                    convo = 0.000125;
                }else if(unitf==items[1]&& unitto==items[4]){
                    convo = 1.25000000e-7;
                }
                else if(unitf==items[1]&& unitto==items[5]){
                    convo = 1.25000000e-10;
                }
                else if(unitf==items[1]&& unitto==items[6]){
                    convo = 1.25000000e-13;
                }
               else if(unitf==items[2]&& unitto==items[1]){
                    convo = 8;
                }else if(unitf==items[2]&& unitto==items[2]){
                    convo = 1;
                }else if(unitf==items[2]&& unitto==items[3]){
                    convo = 0.001;
                }else if(unitf==items[2]&& unitto==items[4]){
                    convo = 0.000001;
                }else if(unitf==items[2]&& unitto==items[5]){
                    convo = 1.00000000e-9;
                }else if(unitf==items[2]&& unitto==items[6]){
                    convo = 1.00000000e-12;
                }else if(unitf==items[3]&& unitto==items[1]){
                    convo=8000;
                }else if(unitf==items[3]&& unitto==items[2]){
                    convo= 1000;
                }else if(unitf==items[3]&& unitto==items[3]){
                    convo = 1;
                }else if(unitf==items[3]&& unitto==items[4]){
                    convo = 0.001;
                }else if(unitf==items[3]&& unitto==items[5]){
                    convo = 0.000001;
                }else if(unitf==items[3]&& unitto==items[6]){
                    convo = 1.00000000e-7;
                }else if(unitf==items[4]&& unitto==items[1]){
                    convo=8000000;
                }else if(unitf==items[4]&& unitto==items[2]){
                    convo=1000000;
                }else if(unitf==items[4]&& unitto==items[3]){
                    convo= 1000;
                }else if(unitf==items[4]&& unitto==items[4]){
                    convo = 1;
                }else if(unitf==items[4]&& unitto==items[5]){
                    convo = 0.001;
                }else if(unitf==items[4]&& unitto==items[6]){
                    convo = 0.000001;
                }else if(unitf==items[5]&& unitto==items[1]){
                    convo=8e9;
                }else if(unitf==items[5]&& unitto==items[2]){
                    convo=1e9;
                }else if(unitf==items[5]&& unitto==items[3]){
                    convo=1000000;
                }else if(unitf==items[5]&& unitto==items[4]){
                    convo=1000;
                }else if(unitf==items[5]&& unitto==items[5]){
                    convo = 1;
                }else if(unitf==items[5]&& unitto==items[6]){
                    convo = 0.001;
                }else if(unitf==items[6]&& unitto==items[1]){
                    convo =8e12;
                }else if(unitf==items[6]&& unitto==items[2]){
                    convo =1e12;
                }else if(unitf==items[6]&& unitto==items[3]){
                    convo =1e9;
                }else if(unitf==items[6]&& unitto==items[4]){
                    convo =1000000;
                }else if(unitf==items[6]&& unitto==items[5]){
                    convo =1000;
                }else if(unitf==items[6]&& unitto==items[6]){
                    convo = 1;
                }
                double a=convo*n;
                answer.setText(String.valueOf(a));
            }
        });
    }
}