package com.example.sharndip.app;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GurdwaraFragment extends Fragment {


    public GurdwaraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {                                                                   //MEME FONCTIONNEMENT QUE LE FRAGMENT BIOGRAPHIE
        // Inflate the layout for this fragment
        final View rootview = inflater.inflate(R.layout.fragment_gurdwara, container, false);
        final TextView sa = (TextView) rootview.findViewById(R.id.textView);
        final TextView as = (TextView) rootview.findViewById(R.id.titre_temp);
        //final int heigth = (getResources().getConfiguration().screenHeightDp) * (int)(getResources().getDisplayMetrics().density) + (getResources().getConfiguration().screenHeightDp / 11);

        rootview.findViewById(R.id.titre_temp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_titre_temp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                ll_titre_temp.setMargins(3, 0, 3, 0);
                lll.removeAllViews();
                sa.setLayoutParams(ll_titre_temp);
                sa.setText(R.string.desc_temp);
                lll.addView(sa);
                as.setText(R.string.titre_temp);
            }
        });
        rootview.findViewById(R.id.ib_temp1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp1.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.nankanasahib);
                sa.setLayoutParams(ll_temp1);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_1);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp2.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.akaaltakht);
                sa.setLayoutParams(ll_temp2);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_2);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp3.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.chamkaursahib);
                sa.setLayoutParams(ll_temp3);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_3);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp4.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.damdamasahib);
                sa.setLayoutParams(ll_temp4);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_4);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp5 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp5.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.fatehgarh);
                sa.setLayoutParams(ll_temp5);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_5);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp6 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp6.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.hazoorsahib);
                sa.setLayoutParams(ll_temp6);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_6);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp7 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp7.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.hemkunts);
                sa.setLayoutParams(ll_temp7);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_7);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp8 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp8.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.kesgarh_sahib);
                sa.setLayoutParams(ll_temp8);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_8);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp9 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp9.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.patnasahib);
                sa.setLayoutParams(ll_temp9);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_9);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp10 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp10.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.seesganjsahib);
                sa.setLayoutParams(ll_temp10);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_10);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_temp11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_temp11 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);                             //OU WRAP_CONTENT
                ll_temp11.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.templedor);
                sa.setLayoutParams(ll_temp11);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.temp_11);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        return rootview;
    }


}
