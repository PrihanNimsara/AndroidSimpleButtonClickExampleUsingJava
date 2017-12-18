package com.developer.android.prihannimsara.testapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_submit,R.id.button_submit2})
    public void submit(View view) {
        Intent intent = new Intent(getApplicationContext(),FirstPageActivity.class);
        startActivity(intent);
    }
}
