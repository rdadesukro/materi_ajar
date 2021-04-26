package com.example.minggu_1.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.minggu_1.R;
import com.example.minggu_1.adapter.ViewPagerAdapter_data;
import com.github.squti.guru.Guru;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.ogaclejapan.smarttablayout.SmartTabLayout;


public class menu_materi_layout extends AppCompatActivity {

    private ViewPager viewPager;
    private AppBarLayout appbar;
    private SmartTabLayout baru;
    private TabLayout tabLayout;
    Toolbar toolbar;

    fragment_linier_layout fragment_linier_layout;
    fragment_relativ_layout fragment_relativ_layout;
    fragment_constaraint_layout fragment_constaraint_layout;
    fragment_frame_layout fragment_frame_layout;
    fragment_table_layout fragment_table_layout;
    MenuItem prevMenuItem;
    com.example.minggu_1.adapter.ViewPagerAdapter_data ViewPagerAdapter_data;
    String value;
    BadgeDrawable badge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_materi_layout);
        initView();
        Log.i("get_posisi", "onCreate: "+value);
    }

    private void initView() {
        viewPager = findViewById(R.id.view_pager);
        appbar = findViewById(R.id.appbar);
        baru = findViewById(R.id.baru);
        getSupportActionBar().setTitle("Layout");
        tabLayout = findViewById(R.id.tab_layout);
        ViewPagerAdapter_data = new ViewPagerAdapter_data(getSupportFragmentManager());
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                } else {
                    // bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                if (position == 0) {
//                      Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                    // getSupportActionBar().setTitle("Lokasi Kesehatan");
                } else if (position == 2) {
                    //Toast.makeText(menu_dokter_new.this, "3", Toast.LENGTH_SHORT).show();
                    //getSupportActionBar().setTitle("History");
                } else if (position==3){
                    // getSupportActionBar().setTitle("Profil");
                }else {

                }
                Log.d("page", "onPageSelected: " + position);

                Log.i("posisi", "onPageSelected: " + position);
                // bottomNavigationView.getMenu().getItem(position).setChecked(true);
                // prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupViewPager(viewPager);
        //viewPager.setCurrentItem(0);
       /// baru.getTabAt(1);
        viewPager.setCurrentItem(0);
       baru.setViewPager(viewPager);


    }
    private void setupViewPager(ViewPager viewPager) {

        fragment_linier_layout = new fragment_linier_layout();
        fragment_relativ_layout = new fragment_relativ_layout();
        fragment_constaraint_layout = new fragment_constaraint_layout();
        fragment_frame_layout = new fragment_frame_layout();
        fragment_table_layout = new fragment_table_layout();

        ViewPagerAdapter_data.addFragment(fragment_linier_layout, "Linier Layaout");
        ViewPagerAdapter_data.addFragment(fragment_relativ_layout, "Relative Layout");
        ViewPagerAdapter_data.addFragment(fragment_constaraint_layout, "Constraint Layout");
        ViewPagerAdapter_data.addFragment(fragment_frame_layout, "Frame Layout");
        ViewPagerAdapter_data.addFragment(fragment_table_layout, "Table Layout");

        viewPager.setAdapter(ViewPagerAdapter_data);
    }

}