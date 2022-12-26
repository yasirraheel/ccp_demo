package com.unitytech.ccpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.hbb20.CCPCountry;
import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {
    CountryCodePicker countryCodePicker;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryCodePicker=findViewById(R.id.countryCodePicker);
        textView=findViewById(R.id.codetv);
        countryCodePicker.setAutoDetectedCountry(true);

        String DefaultCountry= countryCodePicker.getDefaultCountryName();
        String DefaultcountCode = countryCodePicker.getDefaultCountryCode();


        textView.setText("Default Country is "+DefaultCountry+" and Code is "+DefaultcountCode);
        countryCodePicker.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                String CountryName = countryCodePicker.getSelectedCountryName();
                String CountryCode = countryCodePicker.getSelectedCountryCode();
                textView.setText("Selected Country is "+CountryName+" and Code is "+CountryCode);
            }
        });

    }
}