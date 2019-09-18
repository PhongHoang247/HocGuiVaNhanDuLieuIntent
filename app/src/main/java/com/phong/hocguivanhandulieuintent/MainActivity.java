package com.phong.hocguivanhandulieuintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.phong.model.DanhBa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TruyenTrucTiepIntent(View view) {
        Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
        //Gửi dữ liệu
        intent.putExtra("a",113);
        intent.putExtra("b",5.5);
        intent.putExtra("c",true);
        intent.putExtra("s","Phong - Phan");
        DanhBa bill = new DanhBa(1,"Bill","097745126");
        //Đẩy bill qua Sub1Activity:
        intent.putExtra("x",bill);//Truyền đối tượng bill qua Sub2Activity, bên này đánh dấu tên X

        startActivity(intent);
    }

    public void DongGoiBundle(View view) {
        Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
        //Đóng gói vào Bundle:
        Bundle bundle = new Bundle();
        bundle.putInt("a",113);
        bundle.putDouble("b",5.5);
        bundle.putBoolean("c",true);
        bundle.putString("s","Phong - Phan");
        DanhBa bill = new DanhBa(1,"Bill","097745126");
        bundle.putSerializable("x",bill);

        //Quẳng bundle vào intent:
        intent.putExtra("mybundle",bundle);//Đóng gói toàn bộ dữ liệuvào bundle rồi đẩy bundle vào intent

        startActivity(intent);
    }
}
