package com.example.lotof.nlcs.monhoc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lotof.nlcs.MainActivity;
import com.example.lotof.nlcs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GrammarFragment extends Fragment {


    public GrammarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Grammar");
        return inflater.inflate(R.layout.fragment_grammar, container, false);
    }

}
