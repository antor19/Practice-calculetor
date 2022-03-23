package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    double num1, num2, ans;
    char c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.rslt1);
    }

    public void clear(View view){

        result.setText("");
    }

    public void back(View view){

        String s = result.getText().toString();
        if (s.length() != 0) {
            s = s.substring(0, s.length() - 1);
            result.setText(s);
        }
    }


    public void numOne(View view){

        String s = result.getText().toString();
        result.setText(s+1);


    }public void numTwo(View view){

        String s = result.getText().toString();
        result.setText(s+2);


    }public void numThree(View view){

        String s = result.getText().toString();
        result.setText(s+3);


    }public void numFour(View view){

        String s = result.getText().toString();
        result.setText(s+4);


    }public void numFive(View view){

        String s = result.getText().toString();
        result.setText(s+5);


    }public void numSix(View view){

        String s = result.getText().toString();
        result.setText(s+6);


    }public void numSeven(View view){

        String s = result.getText().toString();
        result.setText(s+7);


    }public void numEight(View view){

        String s = result.getText().toString();
        result.setText(s+8);


    }public void numNine(View view){

        String s = result.getText().toString();
        result.setText(s+9);


    }
    public void numZero(View view){

        String s = result.getText().toString();
        if (s.length() != 0){
            result.setText(s+0);
        }


    }
    public void numPlus(View view){

        String s = result.getText().toString();
        num1 = Double.parseDouble(s);
        result.setText("");
        c = '+';

    }public void numMinus(View view){

        String s = result.getText().toString();
        num1 = Double.parseDouble(s);
        result.setText("");
        c = '-';

    }public void numGun(View view){

        String s = result.getText().toString();
        num1 = Double.parseDouble(s);
        result.setText("");
        c = '*';

    }public void numvag(View view){

        String s = result.getText().toString();
        num1 = Double.parseDouble(s);
        result.setText("");
        c = '/';

    }public void numEqual(View view){

        String s = result.getText().toString();
        num2 = Double.parseDouble(s);
        if (c == '+'){
            ans = num1+num2;
            s = String.valueOf(ans);
            result.setText(s);
            c = '0';
        }if (c == '-'){
            ans = num1-num2;
            s = String.valueOf(ans);
            result.setText(s);
            c = '0';
        }if (c == '*'){
            ans = num1*num2;
            s = String.valueOf(ans);
            result.setText(s);
            c = '0';
        }if (c == '/'){
            ans = num1/num2;
            s = String.valueOf(ans);
            result.setText(s);
            c = '0';
        }

    }


}