package com.example.bt3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    TextView tvHoTen, tvMaSV;
    Button btnTroVe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvHoTen = findViewById(R.id.tvHoTen);
        tvMaSV = findViewById(R.id.tvMaSV);
        btnTroVe = findViewById(R.id.btnTroVe);

        // Lấy dữ liệu từ Intent
        String hoTen = getIntent().getStringExtra("hoTen");
        String maSV = getIntent().getStringExtra("maSV");

        tvHoTen.setText("Họ tên: " + hoTen);
        tvMaSV.setText("Mã sinh viên: " + maSV);

        btnTroVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Quay lại giao diện 1
            }
        });
    }
}