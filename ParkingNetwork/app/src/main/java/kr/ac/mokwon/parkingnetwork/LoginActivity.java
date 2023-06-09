package kr.ac.mokwon.parkingnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        Button bt_naver = findViewById(R.id.bt_naver);
        Button bt_kakao = findViewById(R.id.bt_kakao);
        Button bt_google = findViewById(R.id.bt_google);

        TextView tv_join = findViewById(R.id.join);

        bt_naver.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(LoginActivity.this, "네이버", Toast.LENGTH_SHORT).show();
            }
        });
        
        bt_kakao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(LoginActivity.this, "라이언 귀여웡", Toast.LENGTH_SHORT).show();
            }
        });
        
        bt_google.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(LoginActivity.this, "마크도나르도 구그르 토이렛또 깃토 갓토 디즈니란도", Toast.LENGTH_SHORT).show();
            }
        });

        tv_join.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });
    }
}