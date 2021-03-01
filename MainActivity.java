package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    EditText edtNumber1;
    EditText edtNumber2;
    Button btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edtNumber1.getText().toString().trim();
                String chuoi2 = edtNumber2.getText().toString().trim();

                if(chuoi1.length() == 0 || chuoi2.length() == 0)
                {
                    Toast.makeText(MainActivity.this, "Please Enter Right Type", Toast.LENGTH_LONG).show();
                }
                else
                {
                    int Min = Integer.parseInt(chuoi1);
                    int Max = Integer.parseInt(chuoi2);

                    Random random = new Random();
                    int number = random.nextInt(Max - Min + 1) + Min;
                    txtNumber.setText(String.valueOf(number));
                }

            }
        });

    }
    private void Anhxa()
    {
        txtNumber = (TextView) findViewById(R.id.textView3);
        btnRandom = (Button) findViewById(R.id.button);
        edtNumber1 = (EditText) findViewById(R.id.editTextMin);
        edtNumber2 = (EditText) findViewById(R.id.editTextMax);
    }
}