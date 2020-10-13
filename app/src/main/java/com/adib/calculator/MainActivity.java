package com.adib.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    TextView result;
    Button add, subtract, multiply, divide, ac;

    Float num1, num2;
    Float answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        number1 = findViewById( R.id.editText1 );
        number2 = findViewById( R.id.editText2 );
        result = findViewById( R.id.textView );
        add = findViewById( R.id.add );
        subtract = findViewById( R.id.subtract );
        multiply = findViewById( R.id.multiply );
        divide = findViewById( R.id.divide );
        ac = findViewById( R.id.buttonC );

        add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(number1.getText().toString().equals( "" ) || number2.getText().toString().equals( "" ))
                {
                    Toast.makeText( MainActivity.this, "Enter some number for God's sake!", Toast.LENGTH_SHORT ).show();
                }
                else
                {
                    num1 = Float.parseFloat( number1.getText().toString() );
                    num2 = Float.parseFloat( number2.getText().toString() );
                    answer = num1+num2;
                    result.setText( String.valueOf( answer ) );
                }


            }
        } );

        subtract.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().equals( "" ) || number2.getText().toString().equals( "" ))
                {
                    Toast.makeText( MainActivity.this, "Enter some number for God's sake!", Toast.LENGTH_SHORT ).show();
                }
                else
                {
                    num1 = Float.parseFloat( number1.getText().toString() );
                    num2 = Float.parseFloat( number2.getText().toString() );
                    answer = num1-num2;
                    result.setText( String.valueOf( answer ) );
                }
            }
        } );

        multiply.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().equals( "" ) || number2.getText().toString().equals( "" ))
                {
                    Toast.makeText( MainActivity.this, "Enter some number for God's sake!", Toast.LENGTH_SHORT ).show();
                }
                else
                {
                    num1 = Float.parseFloat( number1.getText().toString() );
                    num2 = Float.parseFloat( number2.getText().toString() );
                    answer = num1*num2;
                    result.setText( String.valueOf( answer ) );
                }
            }
        } );

        divide.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().equals( "" ) || number2.getText().toString().equals( "" ))
                {
                    Toast.makeText( MainActivity.this, "Enter some number for God's sake!", Toast.LENGTH_SHORT ).show();
                }
                else
                {
                    num1 = Float.parseFloat( number1.getText().toString() );
                    num2 = Float.parseFloat( number2.getText().toString() );
                    answer = num1/num2;
                    result.setText( String.valueOf( answer ) );
                }
            }
        } );

        ac.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.setText( "" );
                number2.setText( "" );
            }
        } );

    }
}
