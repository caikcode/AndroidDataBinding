package com.kcode.databinding.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kcode.databinding.R;
import com.kcode.databinding.bean.User;
import com.kcode.databinding.databinding.ItemUserBinding;

import java.util.List;

/**
 * Created by caik on 2017/3/5.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<User> data;

    public UserAdapter(List<User> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final User user = data.get(position);
        holder.setUser(user);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ItemUserBinding mBinding;

        public ViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        public void setUser(User user) {
            if (mBinding != null) {
                mBinding.setUser(user);
            }
        }
    }
}
