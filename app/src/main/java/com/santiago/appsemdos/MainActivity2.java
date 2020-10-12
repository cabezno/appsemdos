package com.santiago.appsemdos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);

        String dato1 = getIntent().getStringExtra("dato1");
        tv1.setText("nombre :" + dato1);
        String dato2 = getIntent().getStringExtra("dato2");
        tv2.setText("fecha de naciemiento:" + dato2);
        String dato3 = getIntent().getStringExtra("dato3");
        tv3.setText("telefono :" + dato3);
        String dato4 = getIntent().getStringExtra("dato4");
        tv4.setText("email :" + dato4);
        String dato5 = getIntent().getStringExtra("dato5");
        tv5.setText("descricpion :" + dato5);
    }

    //Método para el botón Regresar
    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}