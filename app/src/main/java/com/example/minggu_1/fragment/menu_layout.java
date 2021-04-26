package com.example.minggu_1.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.minggu_1.R;
import com.example.minggu_1.adapter.ViewPagerAdapter;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class menu_layout extends AppCompatActivity {

    fragment_home home;
    fragment_news news;
    fragment_notif notif;
    fragment_profil profil;
    ViewPager vg;
    int value;
    MenuItem prevMenuItem;
    BottomNavigationView bottomNavigationView;
    public static BadgeDrawable badge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        badge = bottomNavigationView.getOrCreateBadge(R.id.notif);
        badge.setNumber(2);
        vg = (ViewPager) findViewById(R.id.vg);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.home:
                                vg.setCurrentItem(0);
                                getSupportActionBar().setTitle("Layanan");
                                break;
                            case R.id.news:
                                vg.setCurrentItem(1);
                                getSupportActionBar().setTitle("Status");
                                break;
                            case R.id.notif:
                                vg.setCurrentItem(2);
                                getSupportActionBar().setTitle("Notifikasi");
                                break;
                            case R.id.profil:
                                vg.setCurrentItem(3);
                                getSupportActionBar().setTitle("Profil");
                                break;
                        }
                        return false;
                    }
                });

        vg.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                } else {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                if (position == 0) {
                    getSupportActionBar().setTitle("Home");
                } else if (position == 1) {
                    getSupportActionBar().setTitle("News");
                } else if (position == 2) {
                    getSupportActionBar().setTitle("Notifikasi");
                }else {
                    getSupportActionBar().setTitle("Profil");
                }
                Log.d("page", "onPageSelected: " + position);

                Log.i("posisi", "onPageSelected: " + position);
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupViewPager(vg);
        vg.setCurrentItem(0);


    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        home = new fragment_home();
        news = new fragment_news();
        notif = new fragment_notif();
        profil = new fragment_profil();



        adapter.addFragment(home);
        adapter.addFragment(news);
        adapter.addFragment(notif);
        adapter.addFragment(profil);

        viewPager.setAdapter(adapter);
    }


}