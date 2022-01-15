package com.example.a6_recyclerviewinsidenestedscrollviewjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<User> userArrayList;
    private UserAdapter userAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
        userArrayList = new ArrayList<>();
        userAdapter = new UserAdapter(this, userArrayList);

        for(int i = 0; i < 50; i++){
                userArrayList.add(new User("James"));
        }

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(userAdapter);
        recyclerView.setNestedScrollingEnabled(true);
    }

}