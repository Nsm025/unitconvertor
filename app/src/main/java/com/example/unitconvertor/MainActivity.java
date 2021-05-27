package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private com.google.android.material.textfield.TextInputEditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);

        editText = findViewById(R.id.textInputEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Your Answer is Ready", Toast.LENGTH_SHORT).show();
               String s = editText.getText().toString();
               float c = Integer.parseInt(s);
               double f = (c * 9 / 5) + 32;
               textView.setText("The corresponding value in Fahrenheit is " + f);


            }
        });
    }
}