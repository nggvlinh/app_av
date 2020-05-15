package com.example.lotof.nlcs.slide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lotof.nlcs.R;
import com.example.lotof.nlcs.question.Question;

import java.util.ArrayList;

/**
 * Created by lotof on 11/3/2019.
 */

public class CheckAnswerAdapter extends BaseAdapter {

    ArrayList lsData;
    LayoutInflater inflater;

    public CheckAnswerAdapter(ArrayList lsData, Context context) {
        this.lsData = lsData;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return lsData.size();
    }

    @Override
    public Object getItem(int position) {
        return lsData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Question data=(Question) getItem(position);
        ViewHolder holder;
        if(convertView == null){
            holder =new ViewHolder();
            convertView= inflater.inflate(R.layout.item_gridview_list_answer, null);
            holder.tvNumAns= (TextView) convertView.findViewById(R.id.tvNumAns);
            holder.tvYourAns=(TextView) convertView.findViewById(R.id.tvAnswer);
            convertView.setTag(holder);
        }else {
            holder=(ViewHolder) convertView.getTag();
        }
        int i= position +1;
        holder.tvNumAns.setText("Sentence "+i+": ");
        holder.tvYourAns.setText(data.getTraloi());
        return convertView;
    }

    private static class ViewHolder{
        TextView tvNumAns, tvYourAns;
    }

}
