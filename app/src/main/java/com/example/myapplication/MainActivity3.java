package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText txtResultado, txt5, txt6;
    Button btn_restar;
    TextView txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt5=(EditText) findViewById(R.id.txt5);
        txt6=(EditText) findViewById(R.id.txt6);
        txtResultado=(EditText) findViewById(R.id.txt_resultado);
        txt4=(TextView) findViewById(R.id.txt4);
        btn_restar=(Button) findViewById(R.id.btn_restar);
        btn_restar.setOnClickListener((View.OnClickListener) this);

    }
    public void onClick (View view){
        int n1 = Integer.parseInt(txt5.getText().toString());
        int n2 = Integer.parseInt(txt6.getText().toString());
        int r = n1 - n2;
        txtResultado.setText("La resta es:"+r);
    }
}