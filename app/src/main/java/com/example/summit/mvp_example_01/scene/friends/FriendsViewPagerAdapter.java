package com.example.summit.mvp_example_01.scene.friends;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;

public class FriendsViewPagerAdapter extends PagerAdapter {

    LayoutInflater inflater;

    public FriendsViewPagerAdapter(LayoutInflater inflater) {

        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return 2;
    }

}
