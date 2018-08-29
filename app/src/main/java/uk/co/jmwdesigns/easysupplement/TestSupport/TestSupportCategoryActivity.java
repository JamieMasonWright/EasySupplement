package uk.co.jmwdesigns.easysupplement.TestSupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import uk.co.jmwdesigns.easysupplement.R;


public class TestSupportCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_support_category);

        ArrayAdapter<TestSupport> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                TestSupport.testSupports);
        ListView listTestSupport = findViewById(R.id.list_test);
        listTestSupport.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long Id) {
                        Intent intent = new Intent(TestSupportCategoryActivity.this, TestSupportActivity.class);
                        intent.putExtra(TestSupportActivity.EXTRA_TEST, (int) Id);
                        startActivity(intent);

                    }
                };
        listTestSupport.setOnItemClickListener(itemClickListener);
    }
}
