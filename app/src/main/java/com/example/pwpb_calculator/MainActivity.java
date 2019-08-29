package com.example.pwpb_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnTambah, btnKurang, btnBagi, btnKali, btnTitik, btnHasil, btnHapus;
    TextView labelHasil;
    float mValue1, mValue2;
    int tambah, kurang, kali, bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();
        initEvent();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn0:
                labelHasil.setText(labelHasil.getText().toString().trim() + "0");
                break;
            case R.id.btn1:
                labelHasil.setText(labelHasil.getText().toString().trim() + "1");
                break;
            case R.id.btn2:
                labelHasil.setText(labelHasil.getText().toString().trim() + "2");
                break;
            case R.id.btn3:
                labelHasil.setText(labelHasil.getText().toString().trim() + "3");
                break;
            case R.id.btn4:
                labelHasil.setText(labelHasil.getText().toString().trim() + "4");
                break;
            case R.id.btn5:
                labelHasil.setText(labelHasil.getText().toString().trim() + "5");
                break;
            case R.id.btn6:
                labelHasil.setText(labelHasil.getText().toString().trim() + "6");
                break;
            case R.id.btn7:
                labelHasil.setText(labelHasil.getText().toString().trim() + "7");
                break;
            case R.id.btn8:
                labelHasil.setText(labelHasil.getText().toString().trim() + "8");
                break;
            case R.id.btn9:
                labelHasil.setText(labelHasil.getText().toString().trim() + "9");
                break;
            case R.id.btnTambah:
                if (labelHasil == null) {
                    labelHasil.setText(null);
                } else {
                    mValue1 = Float.parseFloat(labelHasil.getText() + "");
                    tambah = 1;
                    labelHasil.setText(null);
                }
                break;
            case R.id.btnKurang:
                if (labelHasil == null) {
                    labelHasil.setText(null);
                } else {
                    mValue1 = Float.parseFloat(labelHasil.getText() + "");
                    kurang = 1;
                    labelHasil.setText(null);
                }
                break;
            case R.id.btnKali:
                if (labelHasil == null) {
                    labelHasil.setText(null);
                } else {
                    mValue1 = Float.parseFloat(labelHasil.getText() + "");
                    kali = 1;
                    labelHasil.setText(null);
                }
                break;
            case R.id.btnBagi:
                if (labelHasil == null) {
                    labelHasil.setText(null);
                } else {
                    mValue1 = Float.parseFloat(labelHasil.getText() + "");
                    bagi = 1;
                    labelHasil.setText(null);
                }
                break;
            case R.id.btnHasil:
                System.out.println("Clicked");
                mValue2 = Float.parseFloat(labelHasil.getText() + "");
                if (tambah == 1) {
                    labelHasil.setText(mValue1 + mValue2 + "");
                    tambah = 0;
                }else if (kurang == 1) {
                    labelHasil.setText(mValue1 - mValue2 + "");
                    kurang = 0;
                }else if (kali == 1) {
                    labelHasil.setText(mValue1 * mValue2 + "");
                    kali = 0;
                }else if (bagi == 1) {
                    labelHasil.setText(mValue1 / mValue2 + "");
                    bagi = 0;
                }
                break;
            case R.id.btnHapus:
                labelHasil.setText(null);
                break;
        }
    }

    private void initComponent() {
        labelHasil = findViewById(R.id.labelHasil);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnHasil = findViewById(R.id.btnHasil);
        btnTitik = findViewById(R.id.btnTitik);
        btnHapus = findViewById(R.id.btnHapus);
    }

    private void initEvent() {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnTitik.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnHasil.setOnClickListener(this);
        btnHapus.setOnClickListener(this);
    }
}
