package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created on 4/4/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
