package com.example.haseeb.seotutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {



        Intent intent = new Intent(MainActivity.this,Sem1Activity.class);
        startActivity(intent);
    }



    public void button1(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }

    public void button2(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }

    public void button3(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }
    public void button4(View view) {

        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }
    public void button5(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }
    public void button6(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }
    public void button7(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }
    public void button8(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }
    public void button9(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }
    public void button10(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }

    public void button11(View view) {

        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }

    public void button12(View view) {


        Toast.makeText(this, "Button is Pressed", Toast.LENGTH_SHORT).show();
    }

}
