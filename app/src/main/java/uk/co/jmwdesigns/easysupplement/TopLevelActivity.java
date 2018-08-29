package uk.co.jmwdesigns.easysupplement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import uk.co.jmwdesigns.easysupplement.AminAcids.AminoAcidsCategoryActivity;
import uk.co.jmwdesigns.easysupplement.NitricOxide.NitricOxideCategoryActivity;
import uk.co.jmwdesigns.easysupplement.PerformanceEnhancers.PerformanceEnhancersCategoryActivity;
import uk.co.jmwdesigns.easysupplement.Protein.ProteinCategoryActivity;
import uk.co.jmwdesigns.easysupplement.TestSupport.TestSupportCategoryActivity;

public class TopLevelActivity extends AppCompatActivity {

    private ListView mSupplementType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_level_activity);



        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    Intent intent  = new Intent(TopLevelActivity.this, ProteinCategoryActivity.class);
                    startActivity(intent);
                }else if(position == 1 ){
                    Intent intent = new Intent (TopLevelActivity.this, AminoAcidsCategoryActivity.class);
                    startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(TopLevelActivity.this, PerformanceEnhancersCategoryActivity.class);
                    startActivity(intent);
                }else if(position == 3){
                    Intent intent = new Intent(TopLevelActivity.this, NitricOxideCategoryActivity.class);
                    startActivity(intent);
                }else if(position == 4){
                    Intent intent = new Intent(TopLevelActivity.this, TestSupportCategoryActivity.class);
                    startActivity(intent  );
                }

            }
        };

        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);







    }
}
