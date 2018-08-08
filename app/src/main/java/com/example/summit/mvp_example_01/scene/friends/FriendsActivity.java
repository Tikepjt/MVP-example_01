package com.example.summit.mvp_example_01.scene.friends;

import android.app.FragmentManager;
import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.summit.mvp_example_01.R;
import com.example.summit.mvp_example_01.databinding.ActivityFriendsBinding;

public class FriendsActivity extends AppCompatActivity implements FriendsContractor.View {

    ActivityFriendsBinding mBinding;
    FriendsPresenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_friends);

        class FriendsFriendsFragment extends FragmentPagerAdapter {

            public FriendsFriendsFragment(FragmentManager fm) {
                super(fm);
            }
        }

        class FriendsRequestFragment extends FragmentPagerAdapter {
            public FriendsRequestFragment(FragmentManager fm) {
                super(fm);
            }
        }


        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_friends);

        mBinding.requesTi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onClickRequestTl();
            }
        });

        mBinding.friendsTi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onClickFriendsTl();
            }
        });


        FriendsViewPagerAdapter mFriendsViewPagerAdapter = new FriendsViewPagerAdapter(getFragmentManager());

        ViewPager mViewPager = findViewById(R.id.viewpager);

        mViewPager.setAdapter(mFriendsViewPagerAdapter);

        TabLayout mTab = findViewById(R.id.friends_tl);

        mTab.setupWithViewPager(mViewPager);

    }
}
