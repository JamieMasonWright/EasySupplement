package uk.co.jmwdesigns.easysupplement.FatBurners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import uk.co.jmwdesigns.easysupplement.R;

public class FatBurnersCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat_burners_category);

        ArrayAdapter<FatBurners> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                FatBurners.fatBurners);
        ListView listFatBurners = findViewById(R.id.list_fat);
        listFatBurners.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long Id) {
                        Intent intent = new Intent(FatBurnersCategoryActivity.this, FatBurnersActivity.class);
                        intent.putExtra(FatBurnersActivity.EXTRA_FAT, (int) Id);
                        startActivity(intent);
                    }
                };
        listFatBurners.setOnItemClickListener(itemClickListener);
    }
}

