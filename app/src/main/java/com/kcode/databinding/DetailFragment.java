package com.kcode.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kcode.databinding.bean.User;
import com.kcode.databinding.databinding.FramentDetailBinding;

/**
 * Created by caik on 2017/3/5.
 */

public class DetailFragment extends Fragment {
    public static DetailFragment newInstance(User user) {

        Bundle args = new Bundle();
        args.putSerializable("user",user);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private User mUser;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mUser = (User) getArguments().getSerializable("user");
        FramentDetailBinding binding = DataBindingUtil.inflate(inflater, R.layout.frament_detail, container, false);
        binding.setUser(mUser);
        return binding.getRoot();
    }
}
