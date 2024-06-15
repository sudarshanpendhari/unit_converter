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

public class volumeActivity extends AppCompatActivity {
    EditText getn;
    TextView answer;
    Spinner s1,s2;
    private String unitf,unitto;
    Button c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        getn=findViewById(R.id.editTextNumber1);
        answer=findViewById(R.id.answer);
        s1=findViewById(R.id.spinner1);
        s2=findViewById(R.id.spinner2);
        c=findViewById(R.id.convertButton);

        String[] items=new String[]{"Select Unit","mililitres","litres","Cubic feet","Cubic metres","US gallons"};
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
                    convo = 0.0000353147;
                }else if(unitf==items[1]&& unitto==items[4]){
                    convo = 0.000001;
                }
                else if(unitf==items[1]&& unitto==items[5]){
                    convo = 0.0002641721;
                }
                else if(unitf==items[2]&& unitto==items[1]){
                    convo = 1000;
                }else if(unitf==items[2]&& unitto==items[2]){
                    convo = 1;
                }else if(unitf==items[2]&& unitto==items[3]){
                    convo = 0.0353146667;
                }else if(unitf==items[2]&& unitto==items[4]){
                    convo = 0.001;
                }else if(unitf==items[2]&& unitto==items[5]){
                    convo = 0.2199692483;
                }else if(unitf==items[3]&& unitto==items[1]){
                    convo=28316.846592;
                }else if(unitf==items[3]&& unitto==items[2]){
                    convo= 28.316846592;
                }else if(unitf==items[3]&& unitto==items[3]){
                    convo = 1;
                }else if(unitf==items[3]&& unitto==items[4]){
                    convo = 0.0283168466;
                }else if(unitf==items[3]&& unitto==items[5]){
                    convo = 7.4805194805;
                }else if(unitf==items[4]&& unitto==items[1]){
                    convo=1000000;
                }else if(unitf==items[4]&& unitto==items[2]){
                    convo=1000;
                }else if(unitf==items[4]&& unitto==items[3]){
                    convo= 35.3146667215;
                }else if(unitf==items[4]&& unitto==items[4]){
                    convo = 1;
                }else if(unitf==items[4]&& unitto==items[5]){
                    convo = 264.1720523581;
                }else if(unitf==items[5]&& unitto==items[1]){
                    convo=3785.411784;
                }else if(unitf==items[5]&& unitto==items[2]){
                    convo=3.785411784;
                }else if(unitf==items[5]&& unitto==items[3]){
                    convo=0.1336805556;
                }else if(unitf==items[5]&& unitto==items[4]){
                    convo=0.0037854118;
                }else if(unitf==items[5]&& unitto==items[5]){
                    convo = 1;
                }
                double a=convo*n;
                answer.setText(String.valueOf(a));

            }
        });

    }
}