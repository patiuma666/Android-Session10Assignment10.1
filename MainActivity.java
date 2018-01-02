package com.example.iis5.fragmentapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText editText;
    EditText edt;
    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bring the fragment to our mainactivity
        getFragmentManager().findFragmentById(R.id.fragment);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simpleaddition, container, false);
        //Using findViewById method to link with java class
        edt = (EditText) view.findViewById(R.id.editText);

        btn = (Button) view.findViewById(R.id.button);
        //Setting Onclicklistener on button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Storing the entered text in input
                String input = edt.getText().toString();
                Toast.makeText(MainActivity.this, "Input is called",Toast.LENGTH_LONG).show();
                //changing the text of textview with the input on button click
                txt.setText(input);
            }
        });
        return view;
    }
}
