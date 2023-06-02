package kr.ac.mokwon.parkingnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity
{

    // 바텀 네비게이션 제어 변수
    BottomNavigationView bottomNavigationView;

    // 프래그먼트 제어 변수
    MainMapFragment mainMapFragment;
    BookMarkerFragment bookMarkerFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        // 프래그먼트 설정
        mainMapFragment = new MainMapFragment();
        bookMarkerFragment = new BookMarkerFragment();

        // 초기 프래그먼트 설정
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, mainMapFragment).commit();

        // 바텀 네비게이션 설정
        bottomNavigationView = findViewById(R.id.bottom_menu);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.item1:
                        getSupportActionBar().setTitle("예약하기");
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, mainMapFragment).commit();
                        return true;
                    case R.id.item2:
                        getSupportActionBar().setTitle("정류장찾기");
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, bookMarkerFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}