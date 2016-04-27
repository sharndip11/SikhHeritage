package com.example.sharndip.app;

import android.content.pm.ActivityInfo;
import android.os.Handler;
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
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private static ListView navList;
    private static FragmentTransaction fragmentTransaction;
    private static FragmentManager fragmentManager;
    public boolean _bool = true;
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {                                                                 //GESTION DE L'ACTION DU BOUTON "RETOUR"
        if (R.layout.fragment_gursikh_jeevan != 0||
                R.layout.fragment_histoire != 0 ||
                R.layout.fragment_biographies != 0 ||
                R.layout.fragment_gurdwara != 0 ||
                R.layout.fragment_faq != 0 ||
                R.layout.fragment_quizz != 0 ||
                R.layout.fragment_actualite != 0) {
            MainActivity.loadSelection(0);
            _bool = false;
        }

        if (_bool == false) {
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed();
                _bool = true;
                return;
            }

            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Double taper pour fermer", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExitPressedOnce=false;
                }
            }, 500);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {                            //CREATION DE LA LISTVIEW QUI CONTIENDRA LES DIFFERENTES RUBRIQUE DU MENU LATERAL
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menu
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);

        navList = (ListView)findViewById(R.id.navList);
        ArrayList<String> navArray = new ArrayList<String>();
        navArray.add("Accueil");
        navArray.add("Vie d'un Sikh");
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

    public static void loadSelection(int i){                                                //SELECTEUR DE RUBRIQUE DEPUIS LA LISTVIEW CREE PRECEDEMENT
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
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {              //ACTION LORS DU CLIQUE SUR UNE RUBRIQUE

        loadSelection(position);

        drawerLayout.closeDrawer(navList);
    }
}
