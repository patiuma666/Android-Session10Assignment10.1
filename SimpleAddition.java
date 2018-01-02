package com.example.iis5.fragmentapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class SimpleAddition extends Fragment {
    TextView txt;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simpleaddition, container, false);
        //Using findViewById method to link with java class
        txt=(TextView)view.findViewById(R.id.textView);
        return view;
    }

}
