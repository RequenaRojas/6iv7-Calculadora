package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
LinearLayout columna1, columna2;
String promat1,promat2,promat3,promat4,promat5,promat6,promat7,promat8,promat9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        columna1= findViewById(R.id.Extras);
        columna1= findViewById(R.id.masamenos);
         promat1= getIntent().getStringExtra("promat1");
         promat2= getIntent().getStringExtra("promat2");
         promat3=getIntent().getStringExtra("promat3");
         promat4= getIntent().getStringExtra("promat4");
         promat5= getIntent().getStringExtra("promat5");
         promat6= getIntent().getStringExtra("promat6");
         promat7= getIntent().getStringExtra("promat7");
         promat8= getIntent().getStringExtra("promat8");
         promat9= getIntent().getStringExtra("promat9");
    extras();
    lista();
    }
    public void lista (){
        Double m1= Double.parseDouble(promat1);
        Double m2= Double.parseDouble(promat2);
        Double m3= Double.parseDouble(promat3);
        Double m4= Double.parseDouble(promat4);
        Double m5= Double.parseDouble(promat5);
        Double m6= Double.parseDouble(promat6);
        Double m7= Double.parseDouble(promat7);
        Double m8= Double.parseDouble(promat8);
        Double m9= Double.parseDouble(promat9);
        Double [] a  = {m1,m2,m3,m4,m5,m6,m7,m8,m9};
        Double menor;
        int M1= 0;
        int M2= 0;
        int M3= 0;
        int M4= 0;
        int M5= 0;
        int M6= 0;
        int M7= 0;
        int M8= 0;
        int M9= 0;


        for(int i = 0; i < 9; i++){
            menor = a[0];

            if (a[i] < menor){
                menor = a[i];
            }
            else{
                if (a[i] > menor){
                    menor = menor;
                }
            }
        }
        TextView M= new TextView(MainActivity2.this);
        for(int i = 0; i < 9; i++){
            if(a[i]==m1){

                if(M1 != 1 ) {
                    M.setText("materia 1");
                    columna2.addView(M);
                    M1=1;
                }
            }
            if(a[i]==m2){

                if(M2 != 1 ) {
                    M.setText("materia 2");
                    columna2.addView(M);
                    M2=1;
                }
            }
            if(a[i]==m3){

                if(M3 != 1 ) {
                    M.setText("materia 3");
                    columna2.addView(M);
                    M3=1;
                }
            }
            if(a[i]==m4){

                if(M4 != 1 ) {
                    M.setText("materia 4");
                    columna2.addView(M);
                    M4=1;
                }
            }
            if(a[i]==m5){

                if(M5 != 1 ) {
                    M.setText("materia 5");
                    columna2.addView(M);
                    M5=1;
                }
            }
            if(a[i]==m6){

                if(M6 != 1 ) {
                    M.setText("materia 6");
                    columna2.addView(M);
                    M6=1;
                }
            }
            if(a[i]==m7){

                if(M7 != 1 ) {
                    M.setText("materia 7");
                    columna2.addView(M);
                    M7=1;
                }
            }
            if(a[i]==m8){

                if(M8 != 1 ) {
                    M.setText("materia 8");
                    columna2.addView(M);
                    M8=1;
                }
            }
            if(a[i]==m9){

                if(M9 != 1 ) {
                    M.setText("materia 9");
                    columna2.addView(M);
                    M9=1;
                }
            }

        }
    }
    public void extras(){
        Double m1= Double.parseDouble(promat1);
        Double m2= Double.parseDouble(promat2);
        Double m3= Double.parseDouble(promat3);
        Double m4= Double.parseDouble(promat4);
        Double m5= Double.parseDouble(promat5);
        Double m6= Double.parseDouble(promat6);
        Double m7= Double.parseDouble(promat7);
        Double m8= Double.parseDouble(promat8);
        Double m9= Double.parseDouble(promat9);
        TextView M= new TextView(MainActivity2.this);
        if(m1<6){

            M.setText("materia 1");
            columna1.addView(M);
        }
        if(m2<6){

            M.setText("materia 1");
            columna1.addView(M);
        }
        if(m3<6){

            M.setText("materia 1");
            columna1.addView(M);
        }
        if(m4<6){

            M.setText("materia 1");
            columna1.addView(M);
        }
        if(m5<6){

            M.setText("materia 1");
            columna1.addView(M);
        }
        if(m6<6){

            M.setText("materia 1");
            columna1.addView(M);
        }
        if(m7<6){

            M.setText("materia 1");
            columna1.addView(M);
        }
        if(m8<6){

            M.setText("materia 1");
            columna1.addView(M);
        }
        if(m9<6){

            M.setText("materia 1");
            columna1.addView(M);
        }

    }
    public void cambio(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}