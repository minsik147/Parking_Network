package kr.ac.mokwon.parkingnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
{

    // 바텀 네비게이션 제어 변수
    BottomNavigationView bottomNavigationView;

    // 프래그먼트 제어 변수
    MainMapFragment mainMapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        // 프래그먼트 설정
        mainMapFragment = new MainMapFragment();

        // 초기 프래그먼트 설정
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, mainMapFragment).commit();
    }
}