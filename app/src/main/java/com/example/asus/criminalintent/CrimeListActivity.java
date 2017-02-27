package com.example.asus.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by ASUS on 2017/2/20.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
