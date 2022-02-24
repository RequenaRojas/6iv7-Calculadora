package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private EditText par1mat1, par1mat2, par1mat3, par1mat4, par1mat5, par1mat6, par1mat7, par1mat8, par1mat9;
    private EditText par2mat1, par2mat2, par2mat3, par2mat4, par2mat5, par2mat6, par2mat7, par2mat8, par2mat9;
    private EditText par3mat1, par3mat2, par3mat3, par3mat4, par3mat5, par3mat6, par3mat7, par3mat8,par3mat9;
    private EditText promat1, promat2, promat3, promat4, promat5, promat6, promat7, promat8, promat9;
    private EditText propa1,propa2,propa3,semestre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        propa1 = (EditText)findViewById(R.id.propar1);
        propa2=  (EditText)findViewById(R.id.propar2);
        propa3=  (EditText)findViewById(R.id.propar3);
        semestre=  (EditText)findViewById(R.id.semestre);

        par1mat1 = (EditText)findViewById(R.id.par1mat1);
        par1mat2 = (EditText)findViewById(R.id.par1mat2);
        par1mat3 = (EditText)findViewById(R.id.par1mat3);
        par1mat4 = (EditText)findViewById(R.id.par1mat4);
        par1mat5 = (EditText)findViewById(R.id.par1mat5);
        par1mat6 = (EditText)findViewById(R.id.par1mat6);
        par1mat7 = (EditText)findViewById(R.id.par1mat7);
        par1mat8 = (EditText)findViewById(R.id.par1mat8);
        par1mat9 = (EditText)findViewById(R.id.par1mat9);


        par1mat1.setText("0");
        par1mat2.setText("0");
        par1mat3.setText("0");
        par1mat4.setText("0");
        par1mat5.setText("0");
        par1mat6.setText("0");
        par1mat7.setText("0");
        par1mat8.setText("0");
        par1mat9.setText("0");


        par2mat1 = (EditText)findViewById(R.id.par2mat1);
        par2mat2 = (EditText)findViewById(R.id.par2mat2);
        par2mat3 = (EditText)findViewById(R.id.par2mat3);
        par2mat4 = (EditText)findViewById(R.id.par2mat4);
        par2mat5 = (EditText)findViewById(R.id.par2mat5);
        par2mat6 = (EditText)findViewById(R.id.par2mat6);
        par2mat7 = (EditText)findViewById(R.id.par2mat7);
        par2mat8 = (EditText)findViewById(R.id.par2mat8);
        par2mat9 = (EditText)findViewById(R.id.par2mat9);

        par2mat1.setText("0");
        par2mat2.setText("0");
        par2mat3.setText("0");
        par2mat4.setText("0");
        par2mat5.setText("0");
        par2mat6.setText("0");
        par2mat7.setText("0");
        par2mat8.setText("0");
        par2mat9.setText("0");

        par3mat1 = (EditText)findViewById(R.id.par3mat1);
        par3mat2 = (EditText)findViewById(R.id.par3mat2);
        par3mat3 = (EditText)findViewById(R.id.par3mat3);
        par3mat4 = (EditText)findViewById(R.id.par3mat4);
        par3mat5 = (EditText)findViewById(R.id.par3mat5);
        par3mat6 = (EditText)findViewById(R.id.par3mat6);
        par3mat7 = (EditText)findViewById(R.id.par3mat7);
        par3mat8 = (EditText)findViewById(R.id.par3mat8);
        par3mat9 = (EditText)findViewById(R.id.par3mat9);

        par3mat1.setText("0");
        par3mat2.setText("0");
        par3mat3.setText("0");
        par3mat4.setText("0");
        par3mat5.setText("0");
        par3mat6.setText("0");
        par3mat7.setText("0");
        par3mat8.setText("0");
        par3mat9.setText("0");

        promat1= (EditText)findViewById(R.id.promat1);
        promat2= (EditText)findViewById(R.id.promat2);
        promat3= (EditText)findViewById(R.id.promat3);
        promat4= (EditText)findViewById(R.id.promat4);
        promat5= (EditText)findViewById(R.id.promat5);
        promat6= (EditText)findViewById(R.id.promat6);
        promat7= (EditText)findViewById(R.id.promat7);
        promat8= (EditText)findViewById(R.id.promat8);
        promat9= (EditText)findViewById(R.id.promat9);





    }
        public void promat1 (View view){
            double parcial1 = Double.parseDouble(par1mat1.getText().toString());
            double parcial2 = Double.parseDouble(par2mat1.getText().toString());
            double parcial3 = Double.parseDouble(par3mat1.getText().toString());
            promat1.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
            propar1(view);
            propar2(view);
            propar3(view);
            semestre(view);
        }
    public void promat2 (View view){
        double parcial1 = Double.parseDouble(par1mat2.getText().toString());
        double parcial2 = Double.parseDouble(par2mat2.getText().toString());
        double parcial3 = Double.parseDouble(par3mat2.getText().toString());
        promat2.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
        propar1(view);
        propar2(view);
        propar3(view);
    }
    public void promat3 (View view){
        double parcial1 = Double.parseDouble(par1mat3.getText().toString());
        double parcial2 = Double.parseDouble(par2mat3.getText().toString());
        double parcial3 = Double.parseDouble(par3mat3.getText().toString());
        promat3.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
        propar1(view);
        propar2(view);
        propar3(view);
        semestre(view);
    }
    public void promat4 (View view){
        double parcial1 = Double.parseDouble(par1mat4.getText().toString());
        double parcial2 = Double.parseDouble(par2mat4.getText().toString());
        double parcial3 = Double.parseDouble(par3mat4.getText().toString());
        promat4.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
        propar1(view);
        propar2(view);
        propar3(view);
        semestre(view);
    }
    public void promat5 (View view){
        double parcial1 = Double.parseDouble(par1mat5.getText().toString());
        double parcial2 = Double.parseDouble(par2mat5.getText().toString());
        double parcial3 = Double.parseDouble(par3mat5.getText().toString());
        promat5.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
        propar1(view);
        propar2(view);
        propar3(view);
        semestre(view);
    }
    public void promat6 (View view){
        double parcial1 = Double.parseDouble(par1mat6.getText().toString());
        double parcial2 = Double.parseDouble(par2mat6.getText().toString());
        double parcial3 = Double.parseDouble(par3mat6.getText().toString());
        promat6.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
        propar1(view);
        propar2(view);
        propar3(view);
        semestre(view);
    }
    public void promat7 (View view){
        double parcial1 = Double.parseDouble(par1mat7.getText().toString());
        double parcial2 = Double.parseDouble(par2mat7.getText().toString());
        double parcial3 = Double.parseDouble(par3mat7.getText().toString());
        promat7.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
        propar1(view);
        propar2(view);
        propar3(view);
        semestre(view);
    }
    public void promat8 (View view){
        double parcial1 = Double.parseDouble(par1mat8.getText().toString());
        double parcial2 = Double.parseDouble(par2mat8.getText().toString());
        double parcial3 = Double.parseDouble(par3mat8.getText().toString());
        promat8.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
        propar1(view);
        propar2(view);
        propar3(view);
        semestre(view);
    }
    public void promat9 (View view){
        double parcial1 = Double.parseDouble(par1mat9.getText().toString());
        double parcial2 = Double.parseDouble(par2mat9.getText().toString());
        double parcial3 = Double.parseDouble(par3mat9.getText().toString());
        promat9.setText(String.valueOf((parcial1+parcial2+parcial3)/3));
        propar1(view);
        propar2(view);
        propar3(view);
        semestre(view);
    }
    public void propar1 (View view){
        double meteria1 = Double.parseDouble(par1mat1.getText().toString());
        double meteria2 = Double.parseDouble(par1mat2.getText().toString());
        double meteria3 = Double.parseDouble(par1mat3.getText().toString());
        double meteria4 = Double.parseDouble(par1mat4.getText().toString());
        double meteria5 = Double.parseDouble(par1mat5.getText().toString());
        double meteria6 = Double.parseDouble(par1mat6.getText().toString());
        double meteria7 = Double.parseDouble(par1mat7.getText().toString());
        double meteria8 = Double.parseDouble(par1mat8.getText().toString());
        double meteria9 = Double.parseDouble(par1mat9.getText().toString());
       propa1.setText(String.valueOf((meteria1+meteria2+meteria3+meteria4+meteria5+meteria6+meteria7+meteria8+meteria9)/9));

    }
    public void propar2 (View view){
        double meteria1 = Double.parseDouble(par2mat1.getText().toString());
        double meteria2 = Double.parseDouble(par2mat2.getText().toString());
        double meteria3 = Double.parseDouble(par2mat3.getText().toString());
        double meteria4 = Double.parseDouble(par2mat4.getText().toString());
        double meteria5 = Double.parseDouble(par2mat5.getText().toString());
        double meteria6 = Double.parseDouble(par2mat6.getText().toString());
        double meteria7 = Double.parseDouble(par2mat7.getText().toString());
        double meteria8 = Double.parseDouble(par2mat8.getText().toString());
        double meteria9 = Double.parseDouble(par2mat9.getText().toString());
        propa2.setText(String.valueOf((meteria1+meteria2+meteria3+meteria4+meteria5+meteria6+meteria7+meteria8+meteria9)/9));

    }
    public void propar3 (View view){
        double meteria1 = Double.parseDouble(par3mat1.getText().toString());
        double meteria2 = Double.parseDouble(par3mat2.getText().toString());
        double meteria3 = Double.parseDouble(par3mat3.getText().toString());
        double meteria4 = Double.parseDouble(par3mat4.getText().toString());
        double meteria5 = Double.parseDouble(par3mat5.getText().toString());
        double meteria6 = Double.parseDouble(par3mat6.getText().toString());
        double meteria7 = Double.parseDouble(par3mat7.getText().toString());
        double meteria8 = Double.parseDouble(par3mat8.getText().toString());
        double meteria9 = Double.parseDouble(par3mat9.getText().toString());
        propa3.setText(String.valueOf((meteria1+meteria2+meteria3+meteria4+meteria5+meteria6+meteria7+meteria8+meteria9)/9));

    }
    public void semestre (View view){
        double propar1 = Double.parseDouble(propa1.getText().toString());
        double propar2 = Double.parseDouble(propa2.getText().toString());
        double propar3 = Double.parseDouble(propa3.getText().toString());
        semestre.setText(String.valueOf((propar1+propar2+propar3)/3));

    }
    public  void  cambio (View view){

        try{
            Intent i = new Intent(this,MainActivity2.class);
            i.putExtra("promat1", promat1.getText());
            i.putExtra("promat2", promat2.getText());
            i.putExtra("promat3", promat3.getText());
            i.putExtra("promat4", promat4.getText());
            i.putExtra("promat5", promat5.getText());
            i.putExtra("promat6", promat6.getText());
            i.putExtra("promat7", promat7.getText());
            i.putExtra("promat8", promat8.getText());
            i.putExtra("promat9", promat9.getText());
            startActivity(i);
        }catch(Exception e){
            System.out.println(e.toString());
            Toast.makeText(this, "Inserta todo los datos por favor", Toast.LENGTH_SHORT).show();
        }



    }
}