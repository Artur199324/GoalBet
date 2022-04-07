package com.polombear;

import static com.polombear.GB.navController;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlankFragmentButtonGB extends Fragment {

    Button buttonStart,buttonClose;
    public static GB gb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank_button_g_b, container, false);
        buttonStart = view.findViewById(R.id.buttonSave);
        buttonClose = view.findViewById(R.id.buttonClose);


        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.blankFragmentGameGb);
            }
        });

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               gb.finishAffinity();
            }
        });

        return view;
    }
}