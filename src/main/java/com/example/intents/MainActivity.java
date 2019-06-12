package com.example.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText etText, etNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        etNumber = findViewById(R.id.etNumber);
    }

    public void buttonGoPressed(View view)
    {
        //Recoger el valor del EditText de texto:
        String valor1 = etText.getText().toString();
        //Recoger el valor del EditText de number (parseInt para hacer el cast):
        int valor2 = Integer.parseInt(etNumber.getText().toString());

        //código para abrir SecondActivity y mandar los dos extras:
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("valor_num", valor2);
        intent.putExtra("valor_texto", valor1);
        startActivity(intent);
    }
}
