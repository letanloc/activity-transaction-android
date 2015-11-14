package com.loc.layouttransaction;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @Bind(R.id.button2)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
//            if(MainActivity.transactionleft==true){
                overridePendingTransition(R.anim.transaction_left_in, R.anim.transaction_left_out);
//            }
//                if(MainActivity.TransactionRight==true){
//
//                    overridePendingTransition(R.anim.transaction_right_in, R.anim.transaction_right_out);
//                }

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
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        if(MainActivity.transactionleft==true){

            overridePendingTransition(R.anim.transaction_right_in, R.anim.transaction_right_out);
//        }
//        if(MainActivity.TransactionRight==true){
//
//            overridePendingTransition(R.anim.transaction_left_in, R.anim.transaction_left_out);
//        }

    }

}
