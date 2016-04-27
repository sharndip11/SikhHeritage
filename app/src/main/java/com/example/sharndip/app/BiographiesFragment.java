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
public class BiographiesFragment extends Fragment {


    public BiographiesFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootview = inflater.inflate(R.layout.fragment_biographies, container, false);                    //ASSOCIATION DE CHAQUE IMAGE BUTTON A UNE ACTION =>
        final TextView sa = (TextView) rootview.findViewById(R.id.textView);                                            //EXTENSION DE LA TEXTVIEW "textView" + AFFICAHGE DE TEXTE
        final TextView as = (TextView) rootview.findViewById(R.id.titre_bio);
        final int heigth = (getResources().getConfiguration().screenHeightDp) * (int)(getResources().getDisplayMetrics().density) + (getResources().getConfiguration().screenHeightDp / 11);

        rootview.findViewById(R.id.titre_bio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                                                //EN FONCTION DE L'IMAGE SELECTIONNEE
                LinearLayout.LayoutParams ll_titre_bio = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                ll_titre_bio.setMargins(3, 0, 3, 0);
                lll.removeAllViews();
                sa.setLayoutParams(ll_titre_bio);
                sa.setText(R.string.desc_bio);
                lll.addView(sa);
                as.setText(R.string.titre_bio);

            }
        });
        rootview.findViewById(R.id.ib_bio1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_bio1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ll_bio1.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.perso);
                sa.setLayoutParams(ll_bio1);                                                                                 //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.bio_1);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_bio2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_bio2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ll_bio2.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.perso);
                sa.setLayoutParams(ll_bio2);
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.bio_2);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_bio3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_bio3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ll_bio3.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.perso);
                sa.setLayoutParams(ll_bio3);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.bio_3);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_bio4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_bio4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ll_bio4.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.perso);
                sa.setLayoutParams(ll_bio4);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.bio_4);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_bio5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_bio5 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ll_bio5.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.perso);
                sa.setLayoutParams(ll_bio5);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.bio_5);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_bio6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_bio6 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ll_bio6.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.perso);
                sa.setLayoutParams(ll_bio6);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.bio_6);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_bio7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_bio7 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ll_bio7.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.perso);
                sa.setLayoutParams(ll_bio7);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.bio_7);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        rootview.findViewById(R.id.ib_bio8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams ll_bio8 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                ll_bio8.setMargins(3, 0, 3, 3);
                RelativeLayout.LayoutParams imParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
                ImageView imSex = new ImageView(getContext());
                imSex.setImageResource(R.drawable.perso);
                sa.setLayoutParams(ll_bio8);                                                                                //OU WRAP_CONTENT
                LinearLayout lll = (LinearLayout) rootview.findViewById(R.id.lll);
                lll.removeAllViews();
                lll.setBackgroundColor(Color.parseColor("#FF9800"));
                lll.setPadding(50, 50, 50, 50);
                lll.addView(imSex, imParams);
                sa.setText(R.string.bio_8);
                sa.setTextSize(20);
                sa.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                lll.addView(sa);
                as.setText("Retour");
            }
        });
        return rootview;
    }


}
