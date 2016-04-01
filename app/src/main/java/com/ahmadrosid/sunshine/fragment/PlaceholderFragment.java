package com.ahmadrosid.sunshine.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ahmadrosid.sunshine.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ocittwo on 4/1/16.
 */
public class PlaceholderFragment extends Fragment{
    private ListView lvForecast;

    public PlaceholderFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, null);

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tommorrow - Foggu - 70/40",
                "Wends - Cloudy - 72/63",
                "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/56",
                "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
                "Sun - Sunny - 80/68"
        };

        List<String> weekForecast = new ArrayList<>(
                Arrays.asList(forecastArray)
        );

        lvForecast = (ListView)view.findViewById(R.id.listview_forecast);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);
        lvForecast.setAdapter(adapter);

        return view;
    }
}
