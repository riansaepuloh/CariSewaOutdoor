package com.carisewaoutdoor.carisewaoutoor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    EditText etName, etPrice, etQty, etImageUrl;
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageLoader.getInstance().init(UILConfig.config(DetailActivity.this));
        Product product = (Product) getIntent().getSerializableExtra("product");

        etName = (EditText)findViewById(R.id.etName);
        etQty = (EditText)findViewById(R.id.etPrice);
        etQty = (EditText)findViewById(R.id.etQty);
        etImageUrl = (EditText)findViewById(R.id.etImageUrl);
        ivImage = (ImageView) findViewById(R.id.ivImage);

        if (product != null){
            etName.setText(product.name);
            etPrice.setText("" + product.price);
            etQty.setText("" + product.qty);
            etImageUrl.setText(product.image_url);

            ImageLoader.getInstance().displayImage(product.image_url,ivImage);

        }

    }

}
