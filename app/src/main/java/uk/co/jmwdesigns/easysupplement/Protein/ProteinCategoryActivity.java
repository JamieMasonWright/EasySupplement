package uk.co.jmwdesigns.easysupplement.Protein;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import uk.co.jmwdesigns.easysupplement.R;

public class ProteinCategoryActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein_category);


        ArrayAdapter<Protein> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Protein.proteins);
        ListView listProtein = findViewById(R.id.list_protein);
        listProtein.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long Id) {
                        Intent intent = new Intent(ProteinCategoryActivity.this, ProteinActivity.class);
                        intent.putExtra(ProteinActivity.EXTRA_PROTEINID, (int) Id);
                        startActivity(intent);

                    }
                };


        listProtein.setOnItemClickListener(itemClickListener);

    }

    public void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}
