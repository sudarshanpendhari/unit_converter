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

public class MassActivity extends AppCompatActivity {
    EditText getn;
    TextView answer;
    Spinner s1,s2;
    private String unitf,unitto;
    Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        getn=findViewById(R.id.editTextNumber1);
        answer=findViewById(R.id.answer);
        s1=findViewById(R.id.spinner1);
        s2=findViewById(R.id.spinner2);
        c=findViewById(R.id.convertButton);

        String[] items=new String[]{"Select Unit","Grams","Kilograms","Ounces","Pounds","Tons"};
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
                    convo = 0.0352739619;
                }else if(unitf==items[1]&& unitto==items[4]){
                    convo = 0.0022046226;
                }
                else if(unitf==items[1]&& unitto==items[5]){
                    convo = 0.000001;
                }
                else if(unitf==items[2]&& unitto==items[1]){
                    convo = 1000;
                }else if(unitf==items[2]&& unitto==items[2]){
                    convo = 1;
                }else if(unitf==items[2]&& unitto==items[3]){
                    convo = 35.2739619496;
                }else if(unitf==items[2]&& unitto==items[4]){
                    convo = 2.2046226218;
                }else if(unitf==items[2]&& unitto==items[5]){
                    convo = 0.001;
                }else if(unitf==items[3]&& unitto==items[1]){
                    convo=28.349523125;
                }else if(unitf==items[3]&& unitto==items[2]){
                    convo= 0.028349523125;
                }else if(unitf==items[3]&& unitto==items[3]){
                    convo = 1;
                }else if(unitf==items[3]&& unitto==items[4]){
                    convo = 0.0625;
                }else if(unitf==items[3]&& unitto==items[5]){
                    convo = 0.0000283495;
                }else if(unitf==items[4]&& unitto==items[1]){
                    convo=453.59237;
                }else if(unitf==items[4]&& unitto==items[2]){
                    convo=0.45359237;
                }else if(unitf==items[4]&& unitto==items[3]){
                    convo= 16;
                }else if(unitf==items[4]&& unitto==items[4]){
                    convo = 1;
                }else if(unitf==items[4]&& unitto==items[5]){
                    convo = 0.0004535924;
                }else if(unitf==items[5]&& unitto==items[1]){
                    convo=1000000;
                }else if(unitf==items[5]&& unitto==items[2]){
                    convo=1000;
                }else if(unitf==items[5]&& unitto==items[3]){
                    convo=35273.96194958;
                }else if(unitf==items[5]&& unitto==items[4]){
                    convo=2204.6226218488;
                }else if(unitf==items[5]&& unitto==items[5]){
                    convo = 1;
                }
                double a=convo*n;
                answer.setText(String.valueOf(a));
            }
        });
    }
}