package com.example.user.project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 6/11/2018.
 */

public class Mpc extends AppCompatActivity {

    Button b;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mpc);
        addListnerOnButton();

    }
    public void addListnerOnButton(){
        final Context context=this;
        b=(Button)findViewById(R.id.mpcn1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,AfterInter.class);
                startActivity(intent);
            }
        });
    }

}
