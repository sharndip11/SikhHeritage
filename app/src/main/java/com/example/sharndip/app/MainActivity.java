package com.example.sharndip.app;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private static ListView navList;
    private static FragmentTransaction fragmentTransaction;
    private static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menu
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);

        navList = (ListView)findViewById(R.id.navList);
        ArrayList<String> navArray = new ArrayList<String>();
        navArray.add("Home");
        navArray.add("Vie d'un Gursikh");
        navArray.add("Histoire");
        navArray.add("Biographies");
        navArray.add("Temples");
        navArray.add("FAQ");
        navArray.add("Quizz");
        navArray.add("Actualités");
        navList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,navArray);
        navList.setAdapter(adapter);
        navList.setOnItemClickListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.openDrawer,R.string.closeDrawer);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
        actionBar.setDisplayHomeAsUpEnabled(true);

        fragmentManager = getSupportFragmentManager();

        loadSelection(0);

    }

    public static void loadSelection(int i){

        navList.setItemChecked(i,true);

        switch (i) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentHolder,homeFragment);
                fragmentTransaction.commit();
                break;

            case 1:
                GursikhJeevanFragment gursikhJeevanFragment = new GursikhJeevanFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentHolder,gursikhJeevanFragment);
                fragmentTransaction.commit();
                break;

            case 2:
                HistoireFragment histoireFragment = new HistoireFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentHolder,histoireFragment);
                fragmentTransaction.commit();
                break;

            case 3:
                BiographiesFragment biographiesFragment = new BiographiesFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentHolder,biographiesFragment);
                fragmentTransaction.commit();
                break;

            case 4:
                GurdwaraFragment gurdwaraFragment = new GurdwaraFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentHolder,gurdwaraFragment);
                fragmentTransaction.commit();
                break;

            case 5:
                FaqFragment faqFragment = new FaqFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentHolder,faqFragment);
                fragmentTransaction.commit();
                break;

            case 6:
                QuizzFragment quizzFragment = new QuizzFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentHolder,quizzFragment);
                fragmentTransaction.commit();
                break;

            case 7:
                ActualiteFragment actualiteFragment = new ActualiteFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentHolder,actualiteFragment);
                fragmentTransaction.commit();
                break;
        }

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            if (drawerLayout.isDrawerOpen(navList)){
                drawerLayout.closeDrawer(navList);
            }else {
                drawerLayout.openDrawer(navList);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        loadSelection(position);

        drawerLayout.closeDrawer(navList);
    }
}
