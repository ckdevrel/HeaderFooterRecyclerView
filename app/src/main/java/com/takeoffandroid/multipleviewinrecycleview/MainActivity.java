package com.takeoffandroid.multipleviewinrecycleview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnBoth;
    private Button btnHeader;
    private Button btnFooter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        btnBoth = (Button)findViewById( R.id.btn_both );
        btnHeader = (Button)findViewById( R.id.btn_header );
        btnFooter = (Button)findViewById( R.id.btn_footer );

        btnBoth.setOnClickListener(this);
        btnHeader.setOnClickListener(this);
        btnFooter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_both:

                Intent headerFooterIntent = new Intent(MainActivity.this,HeaderFooterRecyclerActivity.class);
                startActivity(headerFooterIntent);

                break;

            case R.id.btn_header:

                Intent headerIntent = new Intent(MainActivity.this,HeaderRecyclerActivity.class);
                startActivity(headerIntent);

                break;

            case R.id.btn_footer:

                Intent footerIntent = new Intent(MainActivity.this,FooterRecyclerActivity.class);
                startActivity(footerIntent);

                break;
        }
    }
}
