package uk.co.jmwdesigns.easysupplement.AminAcids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import uk.co.jmwdesigns.easysupplement.R;


public class AminoAcidsCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amino_acids_category);

        ArrayAdapter<AminoAcids> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                AminoAcids.aminoAcids);
        ListView listAminoAcids = findViewById(R.id.list_amino);
        listAminoAcids.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long Id) {
                        Intent intent = new Intent(AminoAcidsCategoryActivity.this, AminoAcidsActivity.class);
                        intent.putExtra(AminoAcidsActivity.EXTRA_AMINO, (int) Id);
                        startActivity(intent);

                    }
                };
        listAminoAcids.setOnItemClickListener(itemClickListener);
    }
}
