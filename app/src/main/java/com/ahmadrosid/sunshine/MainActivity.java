package com.ahmadrosid.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.ahmadrosid.sunshine.fragment.PlaceholderFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment placeholderFragment = new PlaceholderFragment();
        if (findViewById(R.id.container) != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, placeholderFragment).commit();
        }
    }
}
