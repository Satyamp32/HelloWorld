package com.rohit.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  public   EditText editText;
  public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        textView = findViewById(R.id.textview);

    }


    public void showResult(View view) {

        String name = editText.getText().toString();
        textView.setText(name);

        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();

    }
}
