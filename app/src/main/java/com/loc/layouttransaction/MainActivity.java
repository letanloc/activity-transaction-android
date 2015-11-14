package com.loc.layouttransaction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.radioButton)
    RadioButton Left;
    @Bind(R.id.radioButton2)
    RadioButton right;
    @Bind(R.id.button)
    Button trans;
    ;

    public static boolean transactionleft = false, TransactionRight = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.transaction_right_in, R.anim.transaction_right_out);
        ButterKnife.bind(this);
        MainActivity.transactionleft = (Left.isChecked()) ? true : false;
        MainActivity.TransactionRight = (right.isChecked()) ? true : false;


        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
