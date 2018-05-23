package com.milnow5555.restaurantproject.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.milnow5555.restaurantproject.Adapter.MealAdapter;
import com.milnow5555.restaurantproject.Domain.Meal;
import com.milnow5555.restaurantproject.R;

import java.util.ArrayList;
import java.util.List;

public class MyMealsView extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Meal> mealitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_meals_view);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        mealitems = new ArrayList<>();
        for(int i=0 ;i<20;i++){
            Meal item = new Meal("Meal" + i,"100 pln");
            mealitems.add(item);
        }

        adapter = new MealAdapter(mealitems,this);
        recyclerView.setAdapter(adapter);
    }
}

