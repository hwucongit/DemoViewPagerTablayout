package com.huucong.demoviewpagertablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment("FIRST FRAGMENT"), "FIRST");
        adapter.addFragment(new FirstFragment("SECOND FRAGMENT"), "SECOND");
        adapter.addFragment(new FirstFragment("THIRD FRAGMENT"), "THIRD");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setIcon(R.drawable.icon);
        }
    }
}