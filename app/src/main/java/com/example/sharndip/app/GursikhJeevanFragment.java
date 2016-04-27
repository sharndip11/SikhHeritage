package com.example.sharndip.app;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.sharndip.app.R.*;
/**
 * A simple {@link Fragment} subclass.
 */
public class GursikhJeevanFragment extends Fragment {
    int[] tab = {string.vie_gur_1, string.vie_gur_2,                                    //DECLARATION DU TABLEAU DE STRING QUI SERONT AFFICHEES
            string.vie_gur_3, string.vie_gur_4,
            string.vie_gur_5, string.vie_gur_6};
    int i = 0;
    ListView lv;
    public static int [] prgmImages1={drawable.vg11, drawable.vg12};
    public static int [] prgmNameList1={R.string._vg11, string._vg12};
    public static int [] prgmImages2={drawable.vg21};
    public static int [] prgmNameList2={string._vg21};
    public static int [] prgmImages3={};
    public static int [] prgmNameList3={string._vg31};
    public static int [] prgmImages4={drawable.vg41};
    public static int [] prgmNameList4={string._vg41};
    public static int [] prgmImages5={};
    public static int [] prgmNameList5={string._vg51};
    public static int [] prgmImages6={drawable.vg61, drawable.vg62};
    public static int [] prgmNameList6={string._vg61, string._vg62};
    public static int [][] prgmimag_tab = {prgmImages1, prgmImages2, prgmImages3, prgmImages4, prgmImages5, prgmImages6};
    public static int [][] prgmnl_tab = {prgmNameList1, prgmNameList2, prgmNameList3, prgmNameList4, prgmNameList5, prgmNameList6};

    public GursikhJeevanFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootview = inflater.inflate(layout.fragment_gursikh_jeevan, container, false);
        final TextView sa = (TextView) rootview.findViewById(id.vie_gur_1);
        lv=(ListView) rootview.findViewById(id.listView);
        sa.setText(tab[i]);
        lv.setAdapter(new CustomAdapter(getContext(), prgmNameList1, prgmImages1, i));
        rootview.findViewById(id.previous).setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {                          //ACTION SI CLIQUE SUR LE BOUTON PRECEDENT => ONGLET PRECEDENT

                    if (i > 0) {                                                                //LE TEXTE CONTENU DANS LA VIEW EST AFFICHE EN FONCTION DE LONGLET ACTUEL
                        i--;
                        //sa.setText(tab[i]);
                        sa.setText(tab[i]);
                        //lv=(ListView) rootview.findViewById(id.listView);
                        lv.setAdapter(new CustomAdapter(getContext(), prgmnl_tab[i], prgmimag_tab[i], i));
                    } else {
                        i = 5;
                        sa.setText(tab[i]);
                        lv.setAdapter(new CustomAdapter(getContext(), prgmnl_tab[i], prgmimag_tab[i], i));
                    }
                    //Toast.makeText(getContext(), "Previous", Toast.LENGTH_SHORT).show();


                }
        });

        rootview.findViewById(id.next).setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {                               //ACTION SI CLIQUE SUR LE BOUTON SUIVANT => ONGLET SUIVANT
                    if (i < 5) {                                                                //LE TEXTE CONTENU DANS LA VIEW EST AFFICHE EN FONCTION DE LONGLET ACTUEL
                        i++;
                        sa.setText(tab[i]);
                        lv.setAdapter(new CustomAdapter(getContext(), prgmnl_tab[i], prgmimag_tab[i], i));
                    } else {
                        i = 0;
                        sa.setText(tab[i]);
                        lv.setAdapter(new CustomAdapter(getContext(), prgmnl_tab[i], prgmimag_tab[i], i));
                    }
                    //Toast.makeText(getContext(), "Next", Toast.LENGTH_SHORT).show();
                }
        });
        return rootview;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
