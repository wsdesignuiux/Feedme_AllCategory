package ws.wolfsoft.feedme_allcategory;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;



/**
 * Created by wolfsoft4 on 18/7/18.
 */

public class StarterFragmentAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;

    public StarterFragmentAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.mNumofTabs = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Starters tab1 = new Starters();
                return tab1;

            case 1:
                Starters tab2 = new Starters();
                return tab2;

            case 2:
                Starters tab3 = new Starters();
                return tab3;

            case 3:
                Starters tab4 = new Starters();
                return tab4;

            default:
                return null;
        }
    }
        @Override
        public int getCount()

        { return mNumofTabs;}

}
