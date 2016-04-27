package com.example.sharndip.app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.LayoutDirection;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuizzFragment extends Fragment {


    public QuizzFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rtview = inflater.inflate(R.layout.fragment_quizz, container, false);
        final LinearLayout l_quiz = (LinearLayout) rtview.findViewById(R.id.ll_quiz);

        rtview.findViewById(R.id.b_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView tv_start = new TextView(getContext());
                LinearLayout.LayoutParams ll_start_q = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, 1500);
                ll_start_q.setMargins(3, 0, 3, 3);
                l_quiz.setLayoutParams(ll_start_q);
                tv_start.setText(R.string.tv_start);
                tv_start.setTextSize(20);
                tv_start.setTextColor(0xFFFFFFFF);
                l_quiz.removeAllViewsInLayout();
                l_quiz.addView(tv_start, l_quiz.getLayoutParams());
            }
        });

        rtview.findViewById(R.id.b_option).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView tv_option = new TextView(getContext());
                LinearLayout.LayoutParams ll_start_q = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, 1500);
                ll_start_q.setMargins(3, 0, 3, 3);
                l_quiz.setLayoutParams(ll_start_q);
                tv_option.setText(R.string.tv_option);
                tv_option.setTextSize(20);
                tv_option.setTextColor(0xFFFFFFFF);
                l_quiz.removeAllViewsInLayout();
                l_quiz.addView(tv_option, l_quiz.getLayoutParams());
            }
        });

        rtview.findViewById(R.id.b_help).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView tv_help = new TextView(getContext());
                LinearLayout.LayoutParams ll_start_q = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, 1500);
                ll_start_q.setMargins(3, 0, 3, 3);
                l_quiz.setLayoutParams(ll_start_q);
                tv_help.setText(R.string.tv_help);
                tv_help.setTextSize(20);
                tv_help.setTextColor(0xFFFFFFFF);
                l_quiz.removeAllViewsInLayout();
                l_quiz.addView(tv_help, l_quiz.getLayoutParams());
            }
        });
        return rtview;

    }
}