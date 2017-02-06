package com.cokecat.mirag.sunshinemaly;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> entries = new ArrayList<>();
        entries.add("Today - Sunny - 88/63");
        entries.add("Tomorrow - Foggy - 70/40");
        entries.add("Weds - Cloudy - 72/63");
        entries.add("Thurs - Rainy - 64/51");
        entries.add("Fri - Foggy - 70/46");
        entries.add("Sat - Sunny - 76/68");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                entries
        );

        ListView mListView = (ListView)rootView.findViewById(R.id.listview_forecast);
        mListView.setAdapter(adapter);


        return rootView;
    }

}
