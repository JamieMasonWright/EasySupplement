package uk.co.jmwdesigns.easysupplement.AminAcids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import uk.co.jmwdesigns.easysupplement.R;

public class AminoAcidsActivity extends AppCompatActivity {

    public static final String EXTRA_AMINO = "aminoId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amino_acids);


        int aminoId = (Integer)getIntent().getExtras().get(EXTRA_AMINO);
        AminoAcids aminoAcids = AminoAcids.aminoAcids[aminoId];

        TextView name = findViewById(R.id.name);
        name.setText(aminoAcids.getName());

        TextView description = findViewById(R.id.description);
        description.setText(aminoAcids.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(aminoAcids.getImageResourceId());
        photo.setContentDescription(aminoAcids.getName());
    }
}
