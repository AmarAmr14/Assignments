package com.android.assignments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.assignments.R;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private Context context;
    private int itemCount;

    public PostAdapter(Context context, int itemCount) {
        this.context = context;
        this.itemCount = itemCount;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return itemCount;
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
