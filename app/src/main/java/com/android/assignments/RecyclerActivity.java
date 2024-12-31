package com.android.assignments;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler);
        RecyclerView recyclerView = findViewById(R.id.postRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PostAdapter adapter = new PostAdapter(this, 10);
        recyclerView.setAdapter(adapter);

    }
}