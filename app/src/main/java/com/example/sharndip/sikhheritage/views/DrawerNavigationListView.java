package com.example.sharndip.sikhheritage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Adapter;
import android.widget.AdapterView;

import com.example.sharndip.sikhheritage.adapters.DrawerNavigationListAdapter;
import com.example.sharndip.sikhheritage.events.DrawerSectionItemClickedEvent;
import com.example.sharndip.sikhheritage.utils.EventBus;

/**
 * Created by Sharndip on 16/12/2015.
 */
public class DrawerNavigationListView {

    public DrawerNavigationListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        DrawerNavigationListAdapter adapter = new DrawerNavigationListAdapter(getContext(), 0);
        adapter.add("Jeevan d'un Gursikh");
        adapter.add("Histoire");
        adapter.add("Fakre Kaum");
        adapter.add("Temples");
        adapter.add("Question/Reponses");
        adapter.add("Actualites");
        adapter.add("Map");

        setAdapter(adapter );

        setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        EventBus.getInstance().post(new DrawerSectionItemClickedEvent((String) parent.getItemAtPosition( position) ) );
    }

}
