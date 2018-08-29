package uk.co.jmwdesigns.easysupplement.NitricOxide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.jmwdesigns.easysupplement.NitricOxide.NitricOxide;
import uk.co.jmwdesigns.easysupplement.R;

public class NitricOxideActivity extends AppCompatActivity {

    public static final String EXTRA_NO = "noId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nitric_oxide);

        int noId = (Integer)getIntent().getExtras().get(EXTRA_NO);
        NitricOxide nitricOxides = NitricOxide.nitricOxides[noId];

        TextView name = findViewById(R.id.name);
        name.setText(nitricOxides.getName());

        TextView description = findViewById(R.id.description);
        description.setText(nitricOxides.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(nitricOxides.getImageResourceId());
        photo.setContentDescription(nitricOxides.getName());
    }
}
