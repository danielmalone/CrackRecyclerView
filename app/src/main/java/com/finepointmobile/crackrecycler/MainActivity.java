package com.finepointmobile.crackrecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    String[] individualCountries = {"asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf",
            "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf",
            "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf",
            "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf", "asdf"};
    private ArrayList<String> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        countries = new ArrayList<>();
        for (int i = 0; i < individualCountries.length; i++) {
            countries.add(individualCountries[i]);
        }
        RecyclerView.Adapter adapter = new DataAdapter(countries);
        recyclerView.setAdapter(adapter);
    }
}
