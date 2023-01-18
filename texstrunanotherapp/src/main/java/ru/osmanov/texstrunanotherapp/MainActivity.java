package ru.osmanov.texstrunanotherapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText enterErl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openUrl = findViewById(R.id.mb_openUrl);
        Button openMyCalculate = findViewById(R.id.mb_openCalc);
        enterErl = findViewById(R.id.et_enter_url);

        openUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://" + enterErl.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                startActivity(Intent.createChooser(intent,"error"));
            }
        });

        openMyCalculate.setOnClickListener(view -> {
            Intent launchCalc = new Intent(Intent.ACTION_VIEW, Uri.parse("calc://launch"));
            startActivity(Intent.createChooser(launchCalc, "error"));
        });
    }


}