package tec_store.org.recyclerviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView mobileName = (TextView) findViewById(R.id.mobile_name_details);
        TextView mobileManufacture = (TextView) findViewById(R.id.mobile_manufacture_details);
        ImageView mobileImg = (ImageView) findViewById(R.id.mobile_image_details);

        Intent intent = getIntent();
        String theName = intent.getStringExtra("name");
        String theManufacture = intent.getStringExtra("manufacture");
        int theImg = intent.getIntExtra("img", 0);


        mobileName.setText(theName);
        mobileManufacture.setText(theManufacture);
        mobileImg.setImageResource(theImg);

    }
}

