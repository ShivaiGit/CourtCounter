package ru.osmanov.courtcounter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewTeamA;
    private TextView textViewTeamB;
    private Button button1TeamA, button2TeamA, button3TeamA, button1TeamB, button2TeamB, button3TeamB, reset;
    Counter countTeamA;
    Counter countTeamB;

    private final static String keyCounterA = "CounterA";
    private final static String keyCounterB = "CounterB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTeamA = new Counter();
        countTeamB = new Counter();
        initView();
        setOnClickButton();
    }

    private void setOnClickButton() {

        button1TeamA.setOnClickListener(view -> {
            countTeamA.setCountA(countTeamA.getCountA() + 1);
            textViewTeamA.setText(String.valueOf(countTeamA.getCountA()));
        });
        button2TeamA.setOnClickListener(view -> {
            countTeamA.setCountA(countTeamA.getCountA() + 2);
            textViewTeamA.setText(String.valueOf(countTeamA.getCountA()));
        });
        button3TeamA.setOnClickListener(view -> {
            countTeamA.setCountA(countTeamA.getCountA() + 3);
            textViewTeamA.setText(String.valueOf(countTeamA.getCountA()));
        });
        button1TeamB.setOnClickListener(view -> {
            countTeamB.setCountB(countTeamB.getCountB() + 1);
            textViewTeamB.setText(String.valueOf(countTeamB.getCountB()));
        });
        button2TeamB.setOnClickListener(view -> {
            countTeamB.setCountB(countTeamB.getCountB() + 2);
            textViewTeamB.setText(String.valueOf(countTeamB.getCountB()));
        });
        button3TeamB.setOnClickListener(view -> {
            countTeamB.setCountB(countTeamB.getCountB() + 3);
            textViewTeamB.setText(String.valueOf(countTeamB.getCountB()));
        });

        reset.setOnClickListener(view -> {
            countTeamA.setCountA(0);
            countTeamB.setCountB(0);
            textViewTeamA.setText(String.valueOf(countTeamA.getCountA()));
            textViewTeamB.setText(String.valueOf(countTeamB.getCountB()));
        });
    }

    private void initView() {
        textViewTeamA = findViewById(R.id.tv_displayTeamA);
        textViewTeamB = findViewById(R.id.tv_displayTeamB);
        button1TeamA = findViewById(R.id.btn_1point_teamA);
        button2TeamA = findViewById(R.id.btn_2points_teamA);
        button3TeamA = findViewById(R.id.btn_3points_teamA);
        button1TeamB = findViewById(R.id.btn_1point_teamB);
        button2TeamB = findViewById(R.id.btn_2points_teamB);
        button3TeamB = findViewById(R.id.btn_3points_teamB);
        reset = findViewById(R.id.btn_reset);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(keyCounterA, countTeamA);
        outState.putParcelable(keyCounterB, countTeamB);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        countTeamA = savedInstanceState.getParcelable(keyCounterA);
        textViewTeamA.setText(String.valueOf(countTeamA.getCountA()));
        countTeamB = savedInstanceState.getParcelable(keyCounterB);
        textViewTeamB.setText(String.valueOf(countTeamB.getCountB()));
    }
}