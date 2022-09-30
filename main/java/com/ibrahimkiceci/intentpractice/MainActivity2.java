package com.ibrahimkiceci.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);

        // Burada gonderilen degeri alalim; yani girilen degerleri diger sayfaya tasiyalim;

        Intent intent = getIntent();

        String user_name = intent.getStringExtra("nameInput"); // girilen key degerleri ile ayni olmali
        String user_surname = intent.getStringExtra("surnameInput");
        int user_age = intent.getIntExtra("ageInput",0 ); // tek basina birakamazsin bir de default deger vermen gerek int lerde.

        textView.setText(user_name + "\n" + user_surname + "\n" + user_age);



    }

    public void changeSecond(View view){

        // ilk aktiviteye donusu saglayalim;

        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);






    }

}