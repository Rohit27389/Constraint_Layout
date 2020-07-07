package com.rohit.constraints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {
    Group group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline_barriers_group);
        group=findViewById(R.id.gone);
        
    }
}
