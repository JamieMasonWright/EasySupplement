package uk.co.jmwdesigns.easysupplement.NitricOxide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import uk.co.jmwdesigns.easysupplement.R;

public class NitricOxideCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nitric_oxide_category);

        ArrayAdapter<NitricOxide> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                NitricOxide.nitricOxides);
        ListView listNitricOxides = findViewById(R.id.list_no);
        listNitricOxides.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long Id) {
                        Intent intent = new Intent(NitricOxideCategoryActivity.this, NitricOxideActivity.class);
                        intent.putExtra(NitricOxideActivity.EXTRA_NO, (int) Id);
                        startActivity(intent);

                    }
                };
        listNitricOxides.setOnItemClickListener(itemClickListener);
    }
}
