package uk.co.jmwdesigns.easysupplement.Protein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.jmwdesigns.easysupplement.Protein.Protein;
import uk.co.jmwdesigns.easysupplement.R;

public class ProteinActivity extends AppCompatActivity {

    public static final String EXTRA_PROTEINID = "proteinId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein);

        int proteinId = (Integer)getIntent().getExtras().get(EXTRA_PROTEINID);
        Protein protein = Protein.proteins[proteinId];

        TextView name = findViewById(R.id.name);
        name.setText(protein.getName());

        TextView description = findViewById(R.id.description);
        description.setText(protein.getDescription());
        description.setMovementMethod(new ScrollingMovementMethod());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(protein.getImageResourceId());
        photo.setContentDescription(protein.getName());

        TextView use = findViewById(R.id.use);
        use.setText(protein.getRecommendedUse());
        use.setMovementMethod(new ScrollingMovementMethod());





    }
}
