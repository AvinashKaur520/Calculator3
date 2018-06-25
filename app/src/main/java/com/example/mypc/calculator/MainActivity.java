package com.example.mypc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Switch s1;
    double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button2);
        btn2 = (Button) findViewById(R.id.button3);
        btn3 = (Button) findViewById(R.id.button4);
        btn4 = (Button) findViewById(R.id.button5) ;
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        s1 = (Switch) findViewById(R.id.switch1);

        e1.setVisibility(View.INVISIBLE);
        e2.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked==false)    //Enable
                {
                    e1.setVisibility(View.INVISIBLE);
                    e2.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                }
                else
                {
                    e1.setVisibility(View.VISIBLE);
                    e2.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                }

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
              if(e1.getText().toString().equals(""))
              {
                  e1.setError("Please enter number...");
              }
              else if(e2.getText().toString().equals(""))
              {
                  e2.setError("Please enter number...");
              }
              else
              {
                  a = Double.valueOf(e1.getText().toString());
                  b = Double.valueOf(e2.getText().toString());
                  c = a+b;
                  Toast.makeText(MainActivity.this,"Addition of two numbers = "+c,Toast.LENGTH_SHORT).show();
                  e1.setText("");
                  e2.setText("");
              }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                    public void onClick(View v)
                    {
                        if(e1.getText().toString().equals(""))
                        {
                            e1.setError("Please enter number...");
                        }

                        else if(e2.getText().toString().equals(""))
                        {
                            e2.setError("Please enter number...");
                        }
                        else
                        {
                            a= Double.valueOf(e1.getText().toString());
                            b= Double.valueOf(e2.getText().toString());
                            c= a-b;
                            Toast.makeText(MainActivity.this,"Subtraction of two numbers = "+c,Toast.LENGTH_SHORT).show();
                            e1.setText("");
                            e2.setText("");

                        }
                    }
                });
                btn3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v)
                            {
                                if(e1.getText().toString().equals(""))
                                {
                                    e1.setError("Please enter number...");
                                }

                                else if(e2.getText().toString().equals(""))
                                {
                                    e2.setError("Please enter number...");
                                }
                                else
                                {
                                    a= Double.valueOf(e1.getText().toString());
                                    b= Double.valueOf(e2.getText().toString());
                                    c= a*b;
                                    Toast.makeText(MainActivity.this,"Multiplication of two numbers = "+c,Toast.LENGTH_SHORT).show();
                                    e1.setText("");
                                    e2.setText("");

                                }
                            }
                        });
                        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v)
                                    {
                                        if(e1.getText().toString().equals(""))
                                        {
                                            e1.setError("Please enter number...");
                                        }

                                        else if(e2.getText().toString().equals(""))
                                        {
                                            e2.setError("Please enter number...");
                                        }

                                        else
                                        {
                                            a= Double.valueOf(e1.getText().toString());
                                            b= Double.valueOf(e2.getText().toString());
                                            c= a/b;
                                            Toast.makeText(MainActivity.this,"Division of two numbers = "+c,Toast.LENGTH_SHORT).show();
                                            e1.setText("");
                                            e2.setText("");

                                        }
                                    }
                                }
        );
    }
}
