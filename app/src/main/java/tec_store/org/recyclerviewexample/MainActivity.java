package tec_store.org.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Mobile> mobileList = new ArrayList<>();

        Mobile mobile = new Mobile();
        mobile.setMobileName("Nexus 6P");
        mobile.setMobileManufacture("Huawei");
        mobile.setMobileImage(R.drawable.img1);


        Mobile mobile2 = new Mobile();
        mobile2.setMobileName("Nexus 5X");
        mobile2.setMobileManufacture("LG");
        mobile2.setMobileImage(R.drawable.img2);

        Mobile mobile3 = new Mobile();
        mobile3.setMobileName("Nexus 6");
        mobile3.setMobileManufacture("Motorola");
        mobile3.setMobileImage(R.drawable.img3);

        Mobile mobile4 = new Mobile();
        mobile4.setMobileName("Nexus 5");
        mobile4.setMobileManufacture("LG");
        mobile4.setMobileImage(R.drawable.img4);


        Mobile mobile5 = new Mobile();
        mobile5.setMobileName("Nexus 4");
        mobile5.setMobileManufacture("LG");
        mobile5.setMobileImage(R.drawable.img5);

        Mobile mobile6 = new Mobile();
        mobile6.setMobileName("Galaxy Nexus");
        mobile6.setMobileManufacture("Samsung");
        mobile6.setMobileImage(R.drawable.img6);


        Mobile mobile7 = new Mobile();
        mobile7.setMobileName("Nexus S");
        mobile7.setMobileManufacture("Samsung");
        mobile7.setMobileImage(R.drawable.img7);

        Mobile mobile8 = new Mobile();
        mobile8.setMobileName("Nexus One");
        mobile8.setMobileManufacture("HTC");
        mobile8.setMobileImage(R.drawable.img8);



        mobileList.add(mobile);
        mobileList.add(mobile2);
        mobileList.add(mobile3);
        mobileList.add(mobile4);
        mobileList.add(mobile5);
        mobileList.add(mobile6);
        mobileList.add(mobile7);
        mobileList.add(mobile8);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        MobileAdapter adapter = new MobileAdapter(mobileList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}
