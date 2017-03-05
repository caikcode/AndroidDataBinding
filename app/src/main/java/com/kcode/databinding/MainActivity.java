package com.kcode.databinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kcode.databinding.adapter.UserAdapter;
import com.kcode.databinding.bean.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.setAdapter(new UserAdapter(createUserList()));
    }

    private List<User> createUserList() {
        List<User> users = new ArrayList<>();
        User user;
        for (int i=0 ; i<10;i++) {
            user = new User();
            user.setAge(11 + i);
            user.setName("张三" + i);
            user.setMoney(i);
            user.setMan(false);

            users.add(user);
        }
        return users;
    }

}
