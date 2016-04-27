package com.example.sharndip.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.logging.Handler;


public class HomeFragment extends Fragment implements View.OnClickListener {                //ACCUEIL
    private ImageButton btn, btn2, btn3, btn4, btn5, btn6, btn7;                            //DECLARATIOIN DES IMAGES BUTTON
    private int selection = 0;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btn = (ImageButton) view.findViewById(R.id.imageButton);                            //ASSOCIATION DE VIEW AU IMAGE BUTTON
        btn2 = (ImageButton) view.findViewById(R.id.imageButton2);
        btn3 = (ImageButton) view.findViewById(R.id.imageButton3);
        btn4 = (ImageButton) view.findViewById(R.id.imageButton4);
        btn5 = (ImageButton) view.findViewById(R.id.imageButton5);
        btn6 = (ImageButton) view.findViewById(R.id.imageButton6);
        btn7 = (ImageButton) view.findViewById(R.id.imageButton7);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);                                                      //ECOUTE SUR LES BOUTON POUR EFFECTUER UNE ACTION
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);

        return view;
       //return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {                                                                       //ACTION SI CLIQUE SUR UNE IMAGE BOUTON => REDIRECTION VERS LA RUBRIQUE CORRESPONDANTE
        if (btn.isPressed()) {
            this.selection = 1;
            Toast.makeText(this.getActivity(), "Vie d'un Sikh", Toast.LENGTH_SHORT).show();
        } else if (btn2.isPressed()) {
            this.selection = 2;
            Toast.makeText(this.getActivity(), "Histoire", Toast.LENGTH_SHORT).show();
        } else if (btn3.isPressed()) {
            this.selection = 3;
            Toast.makeText(this.getActivity(), "Biographies", Toast.LENGTH_SHORT).show();
        } else if (btn4.isPressed()) {
            this.selection = 4;
            Toast.makeText(this.getActivity(), "Temples", Toast.LENGTH_SHORT).show();
        } else if (btn5.isPressed()) {
            this.selection = 5;
            Toast.makeText(this.getActivity(), "FAQ", Toast.LENGTH_SHORT).show();
        } else if (btn6.isPressed()) {
            this.selection = 6;
            Toast.makeText(this.getActivity(), "Quizz", Toast.LENGTH_SHORT).show();
        } else if (btn7.isPressed()) {
            this.selection = 7;
            Toast.makeText(this.getActivity(), "Actualités", Toast.LENGTH_SHORT).show();
        }
        if (this.selection != 0) {
            MainActivity.loadSelection(this.selection);
        }
    }
}
