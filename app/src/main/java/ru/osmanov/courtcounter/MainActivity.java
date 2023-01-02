package ru.osmanov.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewTeamA;
    private TextView textViewTeamB;
    private Button button1TeamA, button2TeamA, button3TeamA, button1TeamB, button2TeamB, button3TeamB, reset;
    private int countTeamA;
    private int countTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setOnClickButton();
    }

    private void setOnClickButton() {
        button1TeamA.setOnClickListener(view -> {
            countTeamA++;
            textViewTeamA.setText(String.valueOf(countTeamA));
        });
        button2TeamA.setOnClickListener(view -> {
            countTeamA += 2;
            textViewTeamA.setText(String.valueOf(countTeamA));
        });
        button3TeamA.setOnClickListener(view -> {
            countTeamA += 3;
            textViewTeamA.setText(String.valueOf(countTeamA));
        });
        button1TeamB.setOnClickListener(view -> {
            countTeamB++;
            textViewTeamB.setText(String.valueOf(countTeamB));
        });
        button2TeamB.setOnClickListener(view -> {
            countTeamB += 2;
            textViewTeamB.setText(String.valueOf(countTeamB));
        });
        button3TeamB.setOnClickListener(view -> {
            countTeamB += 3;
            textViewTeamB.setText(String.valueOf(countTeamB));
        });

        reset.setOnClickListener(view -> {
            countTeamA = 0;
            countTeamB = 0;
            textViewTeamA.setText(String.valueOf(countTeamA));
            textViewTeamB.setText(String.valueOf(countTeamB));
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
}