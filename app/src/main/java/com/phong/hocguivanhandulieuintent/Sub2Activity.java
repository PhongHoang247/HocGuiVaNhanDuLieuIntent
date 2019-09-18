package com.phong.hocguivanhandulieuintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.phong.model.DanhBa;

public class Sub2Activity extends AppCompatActivity {

    TextView txtData2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        addControls();
    }

    private void addControls() {
        txtData2 = (TextView) findViewById(R.id.txtData2);
        //Lấy intent bên MainActivity:
        Intent intent = getIntent();
        //Lấy thông tin từ bundle ra:
        Bundle bundle = intent.getBundleExtra("mybundle");
        int a = bundle.getInt("a",0);
        double b = bundle.getDouble("b",0.0);
        boolean c = bundle.getBoolean("c",false);
        String s = bundle.getString("s","");
        DanhBa x = (DanhBa) bundle.getSerializable("x");

        //Hiển thị lên:
        txtData2.setText("");
        txtData2.append("a = "+ a + "\n");
        txtData2.append("b = "+ b + "\n");
        txtData2.append("c = "+ c + "\n");
        txtData2.append("s = "+ s + "\n");
        txtData2.append("x = "+ x + "\n");
    }
}
