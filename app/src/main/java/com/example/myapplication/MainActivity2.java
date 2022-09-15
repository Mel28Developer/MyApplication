package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText txtResult, txt1, txt2;
    Button btn_result, btn_next;
    TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1=(EditText) findViewById(R.id.txt1);
        txt2=(EditText) findViewById(R.id.txt2);
        txtResult=(EditText) findViewById(R.id.txtResult);
        txt3=(TextView) findViewById(R.id.txt3);
        btn_result=(Button) findViewById(R.id.btn_result);
        btn_result.setOnClickListener((View.OnClickListener) this);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });
    }
    public void onClick (View v){
        int n1 = Integer.parseInt(txt1.getText().toString());
        int n2 = Integer.parseInt(txt2.getText().toString());
        int r = n1 + n2;
        txtResult.setText("La suma es:"+r);
        Toast.makeText(getApplicationContext(), "El resultado es"+r, Toast.LENGTH_LONG).show();
    }
}