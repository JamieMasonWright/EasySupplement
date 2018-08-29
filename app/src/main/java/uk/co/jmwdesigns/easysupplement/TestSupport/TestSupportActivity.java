package uk.co.jmwdesigns.easysupplement.TestSupport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.jmwdesigns.easysupplement.R;
import uk.co.jmwdesigns.easysupplement.TestSupport.TestSupport;

public class TestSupportActivity extends AppCompatActivity {

    public static final String EXTRA_TEST = "testId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_support);

        int testId = (Integer)getIntent().getExtras().get(EXTRA_TEST);
        TestSupport testSupports = TestSupport.testSupports[testId];

        TextView name = findViewById(R.id.name);
        name.setText(testSupports.getName());

        TextView description = findViewById(R.id.description);
        description.setText(testSupports.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(testSupports.getImageResourceId());
        photo.setContentDescription(testSupports.getName());
    }
}
