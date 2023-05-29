package com.example.tab_layuot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity
{
    TabLayout tab;
    ViewPager pager;
    View_pager_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=findViewById(R.id.tab);
        pager=findViewById(R.id.pager);

        adapter=new View_pager_Adapter(getSupportFragmentManager());
        adapter.addFragment(new InfoFragment(), "Info");
        adapter.addFragment(new LiveFragment(), "Live");
        adapter.addFragment(new ScorecardFragment(), "Scorecard");
        adapter.addFragment(new SquadsFragment(), "Squads");

    }
}