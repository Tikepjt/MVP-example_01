package com.example.summit.mvp_example_01.scene.friends;

import android.content.Context;

public class FriendsPresenter implements FriendsContractor.Presenter {

    Context mContext;
    FriendsContractor.View mView;

    public FriendsPresenter(Context context, FriendsContractor.View view) {
        mContext = context;
        mView = view;
    }

    @Override
    public void onClickRequestTl(){

    }

    @Override
    public void onClickFriendsTl(){

    }


}
