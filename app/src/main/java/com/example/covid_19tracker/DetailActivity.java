package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private  int positionCountry;
    TextView tvCountry, tvTodayCases, tvCases,tvActive, tvDeaths, tvRecovered, tvCritical,tvTodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+TrackCountries.countryModelList.get(positionCountry).getCountry() );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvCountry = findViewById(R.id.tvCountry);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvCases = findViewById(R.id.tvCases);
        tvActive = findViewById(R.id.tvActive);
        tvDeaths = findViewById(R.id.tvDeaths);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(TrackCountries.countryModelList.get(positionCountry).getCountry());
        tvTodayCases.setText(TrackCountries.countryModelList.get(positionCountry).getTodayCases());
        tvTodayDeaths.setText(TrackCountries.countryModelList.get(positionCountry).getTodayDeaths());
        tvCases.setText(TrackCountries.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(TrackCountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(TrackCountries.countryModelList.get(positionCountry).getCritical());
        tvDeaths.setText(TrackCountries.countryModelList.get(positionCountry).getDeaths());
        tvActive.setText(TrackCountries.countryModelList.get(positionCountry).getActive());
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home);{
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}