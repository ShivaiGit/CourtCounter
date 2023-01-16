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
    Button openUrl;
    EditText enterErl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openUrl = findViewById(R.id.mb_openUrl);
        enterErl = findViewById(R.id.et_enter_url);

        openUrl.setOnClickListener(view -> startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://" + enterErl.getText().toString()))));
    }


}