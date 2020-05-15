package com.example.lotof.nlcs.monhoc;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.lotof.nlcs.MainActivity;
import com.example.lotof.nlcs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class tuvungFragment extends Fragment {


    public tuvungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Vocabulary");
        return inflater.inflate(R.layout.fragment_tuvung, container, false);

    }

}
