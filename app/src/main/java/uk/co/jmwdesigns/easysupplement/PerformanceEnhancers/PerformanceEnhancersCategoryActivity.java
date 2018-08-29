package uk.co.jmwdesigns.easysupplement.PerformanceEnhancers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import uk.co.jmwdesigns.easysupplement.R;


public class PerformanceEnhancersCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance_enhancers_category);

        ArrayAdapter<PerformanceEnhancers> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                PerformanceEnhancers.performanceEnhancers);
        ListView listPerformanceEnhancers = findViewById(R.id.list_enhancers);
        listPerformanceEnhancers.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long Id) {
                        Intent intent = new Intent(PerformanceEnhancersCategoryActivity.this, PerformanceEnhancersActivity.class);
                        intent.putExtra(PerformanceEnhancersActivity.EXTRA_PERFORMANCE, (int) Id);
                        startActivity(intent);

                    }
                };
        listPerformanceEnhancers.setOnItemClickListener(itemClickListener);
    }
}
