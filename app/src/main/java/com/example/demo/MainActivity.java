package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseObject;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {






    public  void myFunction(View view){

        EditText username = (EditText) findViewById(R.id.first);
        EditText password = (EditText) findViewById(R.id.sec);

        ParseUser user = new ParseUser();
        user.setUsername(username.getText().toString());
        user.setPassword(password.getText().toString());

        Log.i("username" , username.getText().toString());
        Log.i("password", password.getText().toString());
        Toast.makeText(this, "hi " + username.getText().toString(), Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
