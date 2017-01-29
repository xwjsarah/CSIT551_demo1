package com.example.willl.csit551_demo1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;

import android.view.View;
import android.widget.Button;
import android.R.color.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int i=0;

    /*public void sayHello (View view)
    {
       Button V= (Button) view;
        V.setText("I am new  " + (i++) );
    } */


    public void sayHello (View view)
    {
        i++;
        Button V= (Button) view;
        V.setText("I am new  " + (i) );
        if(i%10==0) {
           V.setTextColor(Color.RED);
            V.setBackgroundColor(Color.WHITE);}
        else {  V.setTextColor(Color.WHITE);
              V.setBackgroundColor(Color.BLACK);}




    }


}
