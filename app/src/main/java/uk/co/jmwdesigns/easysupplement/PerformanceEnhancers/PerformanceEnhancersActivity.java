package uk.co.jmwdesigns.easysupplement.PerformanceEnhancers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.jmwdesigns.easysupplement.PerformanceEnhancers.PerformanceEnhancers;
import uk.co.jmwdesigns.easysupplement.R;


public class PerformanceEnhancersActivity extends AppCompatActivity {

    public static final String EXTRA_PERFORMANCE = "performanceId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance_enhancers);

        int performanceId = (Integer)getIntent().getExtras().get(EXTRA_PERFORMANCE);
        PerformanceEnhancers performanceEnhancers = PerformanceEnhancers.performanceEnhancers[performanceId];

        TextView name = findViewById(R.id.name);
        name.setText(performanceEnhancers.getName());

        TextView description = findViewById(R.id.description);
        description.setText(performanceEnhancers.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(performanceEnhancers.getImageResourceId());
        photo.setContentDescription(performanceEnhancers.getName());
    }
}
