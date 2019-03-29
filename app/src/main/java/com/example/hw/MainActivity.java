package com.example.hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnFirst, btnSecond;
    private TextView tvOutput, tvWin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        tvOutput = findViewById(R.id.tvOutput);
        tvWin = findViewById(R.id.tvWin);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(btnFirst.getText().toString());
                int second = Integer.parseInt(btnSecond.getText().toString());
                int tv = Integer.parseInt(tvOutput.getText().toString());

                Random r = new Random();
                btnFirst.setText(Integer.toString(r.nextInt(100)+1));
                btnSecond.setText(Integer.toString(r.nextInt(100)+1));


                CheckNum obj = new CheckNum();
                obj.setClicked(first);
                obj.setUnclicked(second);
                int check = obj.Check(tv);

                tvOutput.setText(Integer.toString(obj.Check(tv)));
                if (check >= 10) {
                    tvWin.setText("You Win");
                }


            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(btnSecond.getText().toString());
                int second = Integer.parseInt(btnFirst.getText().toString());
                int tv= Integer.parseInt(tvOutput.getText().toString());

                Random r = new Random();
                btnFirst.setText(Integer.toString(r.nextInt(100)+1));
                btnSecond.setText(Integer.toString(r.nextInt(100)+1));

                CheckNum obj = new CheckNum();
                obj.setClicked(first);
                obj.setUnclicked(second);
                int check = obj.Check(tv);

                tvOutput.setText(Integer.toString(obj.Check(tv)));
                if (check >= 10) {
                    tvWin.setText("You Win");
                }

            }
        });
    }
}   
