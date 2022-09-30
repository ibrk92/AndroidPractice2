package com.ibrahimkiceci.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    String userName;
    String userSurName;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
    }

    public void changeFirst(View view){

        // kullanicinin girdi degerleri alalim;

        userName = editText1.getText().toString();
        userSurName = editText2.getText().toString();
        age = Integer.parseInt(editText3.getText().toString());

        //  Intent objesinden aktiviteler arasi gecisi sagliyoruz;

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("nameInput", userName); // key ve deger giriyoruz; butun degerleri gir
        intent.putExtra("surnameInput", userSurName);
        intent.putExtra("ageInput",age);
        startActivity(intent);

    }
}