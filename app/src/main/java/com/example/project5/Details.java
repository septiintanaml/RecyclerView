package com.example.project5;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {

    ImageView ivPhoto;
    TextView tvTitle;
    TextView tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ivPhoto = findViewById(R.id.ivDetail);
        tvTitle = findViewById(R.id.tvDetailName);
        tvDetail = findViewById(R.id.tvDetailSum);

        ivPhoto.setImageResource(getIntent().getIntExtra("Photo",0));
        tvTitle.setText(getIntent().getStringExtra("Judul"));
        tvDetail.setText(getIntent().getStringExtra("Description"));

        final Button button = findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Details.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}
