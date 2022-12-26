package com.unitytech.ccpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.hbb20.CCPCountry;
import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {
    CountryCodePicker countryCodePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryCodePicker=findViewById(R.id.countryCode_picker);
        countryCodePicker.setAutoDetectedCountry(true);

        countryCodePicker.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                String cc = countryCodePicker.getSelectedCountryCode();
                String countryname = countryCodePicker.getSelectedCountryName();
                Toast.makeText(MainActivity.this, "Country selected "+cc+"" +
                        "and Name is "+countryname, Toast.LENGTH_SHORT).show();
            }
        });

    }
}