package com.job.ihorak.piechartapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = (PieChart) findViewById(R.id.chart);
//      Creating an array of Entry objects which are used for creating the chart
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f,0));
        entries.add(new Entry(8f,1));
        entries.add(new Entry(4f,2));
        entries.add(new Entry(3f,3));
        entries.add(new Entry(12f,4));
        entries.add(new Entry(17f,5));
        entries.add(new Entry(17f,6));



        PieDataSet dataSet = new PieDataSet(entries, "# of Calls");
//      Creating an array of strings that we will use for labeling different chart sections
        ArrayList<String> labels = new ArrayList<String>();

        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        labels.add("July");

//      Binding data to PieChart object
        PieData data = new PieData(labels, dataSet);
        pieChart.setData(data);
        pieChart.setDescription("My first PieChart! :D");
//      Setting colors
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
//      Setting up animation
        pieChart.animateX(1200);



    }
}
