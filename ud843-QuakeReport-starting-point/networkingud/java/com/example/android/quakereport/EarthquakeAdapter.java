package com.example.android.quakereport;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView = null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);

            Earthquake currentEarthquake=getItem(position);

            TextView magnitudeView=(TextView) listItemView.findViewById(R.id.magnitude);
            magnitudeView.setText(currentEarthquake.getMagnitude());

            TextView locationView=(TextView) listItemView.findViewById(R.id.location);
            magnitudeView.setText(currentEarthquake.getLocation());

            TextView dateView=(TextView) listItemView.findViewById(R.id.date);
            magnitudeView.setText(currentEarthquake.getDate());


        }

    }
}
