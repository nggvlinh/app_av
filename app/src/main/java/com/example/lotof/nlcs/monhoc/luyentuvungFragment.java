package com.example.lotof.nlcs.monhoc;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.lotof.nlcs.MainActivity;
import com.example.lotof.nlcs.R;
import com.example.lotof.nlcs.slide.ScreenSlideActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class luyentuvungFragment extends Fragment {

    ExamAdapter examAdapter;
    GridView gvExam;
    ArrayList<Exam> arr_exam= new ArrayList<Exam>();

    public luyentuvungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Practice Vocabulary");
        return inflater.inflate(R.layout.fragment_luyentuvung, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        gvExam=(GridView) getActivity().findViewById(R.id.gvExam);
        arr_exam.add(new Exam("Exam 1"));
        arr_exam.add(new Exam("Exam 2"));

        examAdapter=new ExamAdapter(getActivity(),arr_exam);
        gvExam.setAdapter(examAdapter);
        gvExam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(getActivity(), ScreenSlideActivity.class);
                intent.putExtra("num_exam",i+1);
                intent.putExtra("subject","luyentuvung");
                intent.putExtra("test","yes");
                startActivity(intent);
            }
        });

    }
}
