package com.example.Alert;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.linearlayout.R;

public class AlertdialogActivity extends AppCompatActivity {

    public void click(View v){
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View myLoginView = layoutInflater.inflate(R.layout.alertdialog, null);
        Dialog alertDialog = new AlertDialog.Builder(this)
                .setView(myLoginView)
                .create();
        alertDialog.show();
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.button);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        LayoutInflater layoutInflater = LayoutInflater.from(this);
//        View myLoginView = layoutInflater.inflate(R.layout.alertdialog, null);
//        Dialog alertDialog = new AlertDialog.Builder(this)
//                .setView(myLoginView)
//                .create();
//        alertDialog.show();
//        Button myButton = findViewById(R.id.button);
//
//        myButton.setOnClickListener(view -> {
//            // 点击事件处理代码
//        });
    }
}
