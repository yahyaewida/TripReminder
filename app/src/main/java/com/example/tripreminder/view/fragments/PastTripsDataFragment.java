package com.example.tripreminder.view.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tripreminder.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PastTripsDataFragment extends Fragment {


    public PastTripsDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_past_trips_data, container, false);
    }

}
