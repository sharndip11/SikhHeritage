package com.example.sharndip.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import static com.example.sharndip.app.R.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoireFragment extends Fragment {                                //MEME FONCTIONNEMENT QUE POUR LE FRAGMENT GURSIKHJEEVAN
    int[] tab = {string.hist_1, string.hist_2,
            string.hist_3};
    int i = 0;
    ListView lv;
    /*public static int [] prgmImages1={drawable.vg11, drawable.vg12};
    public static int [] prgmNameList1={R.string._vg11, string._vg12};
    public static int [] prgmImages2={drawable.vg21};
    public static int [] prgmNameList2={string._vg21};
    public static int [] prgmImages3={};
    public static int [] prgmNameList3={string._vg31};*/
    public static int [] prgmImages1={drawable.histoire};
    public static int [] prgmNameList1={R.string._h11, string._h12};
    public static int [] prgmImages2={};
    public static int [] prgmNameList2={string._h21};
    public static int [] prgmImages3={};
    public static int [] prgmNameList3={};
    public static int [][] prgmimag_tab = {prgmImages1, prgmImages2, prgmImages3};
    public static int [][] prgmnl_tab = {prgmNameList1, prgmNameList2, prgmNameList3};

    public HistoireFragment() {
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
        // Inflate the layout for this fragment
        final View rootview = inflater.inflate(layout.fragment_histoire, container, false);
        final TextView sa = (TextView) rootview.findViewById(id.hist_1);
        lv=(ListView) rootview.findViewById(id.listView2);
        sa.setText(tab[i]);
        lv.setAdapter(new CustomAdapterHist(getContext(), prgmNameList1, prgmImages1, i));
        rootview.findViewById(id.previous).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (i > 0) {
                    i--;
                    sa.setText(tab[i]);
                    lv.setAdapter(new CustomAdapterHist(getContext(), prgmnl_tab[i], prgmimag_tab[i], i));
                } else {
                    i = 2;
                    sa.setText(tab[i]);
                    lv.setAdapter(new CustomAdapterHist(getContext(), prgmnl_tab[i], prgmimag_tab[i], i));
                }
                //Toast.makeText(getContext(), "Previous", Toast.LENGTH_SHORT).show();
            }
        });

        rootview.findViewById(id.next).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (i < 2) {
                    i++;
                    sa.setText(tab[i]);
                    lv.setAdapter(new CustomAdapterHist(getContext(), prgmnl_tab[i], prgmimag_tab[i], i));
                } else {
                    i = 0;
                    sa.setText(tab[i]);
                    lv.setAdapter(new CustomAdapterHist(getContext(), prgmnl_tab[i], prgmimag_tab[i], i));
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
