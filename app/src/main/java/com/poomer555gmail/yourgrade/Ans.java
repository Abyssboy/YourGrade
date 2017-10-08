package com.poomer555gmail.yourgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ans extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans);

        Intent intent = getIntent();
        String Grade = intent.getStringExtra("GradeText");
        String Name = intent.getStringExtra("Name");

        TextView T1 = (TextView) findViewById(R.id.NameOut);
        TextView T2 = (TextView) findViewById(R.id.AnsOut);

        T1.setText(Name);
        T2.setText(Grade);

    }
}
