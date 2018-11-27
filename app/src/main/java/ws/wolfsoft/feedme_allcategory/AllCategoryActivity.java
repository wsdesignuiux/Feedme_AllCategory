package ws.wolfsoft.feedme_allcategory;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AllCategoryActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    StarterFragmentAdapter starterFragmentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);

        tabLayout=findViewById(R.id.tablayout);

        viewPager=findViewById(R.id.viewpager);


        tabLayout.addTab(tabLayout.newTab().setText("STARTERS"));
        tabLayout.addTab(tabLayout.newTab().setText("MAINS"));
        tabLayout.addTab(tabLayout.newTab().setText("SIDES"));
        tabLayout.addTab(tabLayout.newTab().setText("DESSERT"));

        starterFragmentAdapter= new StarterFragmentAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setOffscreenPageLimit(4);
        viewPager.setAdapter(starterFragmentAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tabLayout.getSelectedTabPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
