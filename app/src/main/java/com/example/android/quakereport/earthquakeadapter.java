package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by LAPTOP on 24-12-2017.
 */

public class earthquakeadapter extends ArrayAdapter<earthquake> {
    public earthquakeadapter(Context context, List<earthquake> eths) {
        super(context, 0, eths);
    }

@Override
    public View getView(int pos, View convertview, ViewGroup parent)
    {
View Listitemview=convertview;
if(Listitemview==null)
{
    Listitemview= LayoutInflater.from(getContext()).inflate(R.layout.activity_earthquake_listitems,parent,false);
}
        earthquake curr=getItem(pos);
        TextView mag=(TextView)Listitemview.findViewById(R.id.magnitude);
        mag.setText(curr.CallMagnitude());
        TextView loc=(TextView)Listitemview.findViewById(R.id.location);
        loc.setText(curr.CallLocation());
        TextView dt=(TextView)Listitemview.findViewById(R.id.date);
        dt.setText(curr.CallDate());
        return Listitemview;

    }

}