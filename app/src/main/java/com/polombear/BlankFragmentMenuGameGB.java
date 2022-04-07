package com.polombear;

import static com.polombear.GB.navController;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class BlankFragmentMenuGameGB extends Fragment {

    EditText editTextTextPersonName, editTextTextEmailAddress;
    Button buttonSave;
    String name = "a";
    String email = "a";
    public static GB gb;
    TextView textViewEmail,textViewName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank_menu_game_g_b, container, false);
        buttonSave = view.findViewById(R.id.buttonSave);
        editTextTextPersonName = view.findViewById(R.id.editTextTextPersonName);
        editTextTextEmailAddress = view.findViewById(R.id.editTextTextEmailAddress);
        textViewEmail = view.findViewById(R.id.textViewEmail);
        textViewName = view.findViewById(R.id.textViewName);

        name = gb.getSharedPreferences(gb.getPackageName(), gb.MODE_PRIVATE).getString("name", "a");
        email = gb.getSharedPreferences(gb.getPackageName(), gb.MODE_PRIVATE).getString("email", "a");
        if (name.equals("a") || email.equals("a")){
            buttonSave.setVisibility(View.VISIBLE);
            editTextTextPersonName.setVisibility(View.VISIBLE);
            editTextTextEmailAddress.setVisibility(View.VISIBLE);
            textViewName.setVisibility(View.INVISIBLE);
            textViewEmail.setVisibility(View.INVISIBLE);
        }else {

            buttonSave.setVisibility(View.INVISIBLE);
            editTextTextPersonName.setVisibility(View.INVISIBLE);
            editTextTextEmailAddress.setVisibility(View.INVISIBLE);
            textViewName.setText(name);
            textViewEmail.setText(email);
            textViewName.setVisibility(View.VISIBLE);
            textViewEmail.setVisibility(View.VISIBLE);

        }



        editTextTextPersonName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                name = charSequence.toString();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        editTextTextEmailAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email = charSequence.toString();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!name.equals("a") || !email.equals("a")){
                    gb.getSharedPreferences( gb.getPackageName(),  gb.MODE_PRIVATE).edit().putString("name", name).apply();
                    gb.getSharedPreferences( gb.getPackageName(),  gb.MODE_PRIVATE).edit().putString("email", email).apply();
                    navController.navigate(R.id.blankFragmentGameGb);
                }

            }
        });


        return view;
    }
}