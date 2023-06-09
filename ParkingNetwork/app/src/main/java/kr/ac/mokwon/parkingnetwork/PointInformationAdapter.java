package kr.ac.mokwon.parkingnetwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.naver.maps.map.overlay.InfoWindow;

import kr.ac.mokwon.parkingnetwork.R;

public class PointInformationAdapter extends InfoWindow.DefaultViewAdapter
{
    private final Context mContext;
    private final ViewGroup mParent;
    String name;
    String address;
    int now;

    public PointInformationAdapter(@NonNull Context context, ViewGroup viewGroup, String name, String address, int now)
    {
        super(context);
        mContext = context;
        mParent = viewGroup;
        this.name = name;
        this.address = address;
        this.now = now;
    }

    @NonNull
    @Override
    protected View getContentView(@NonNull InfoWindow infoWindow)
    {
        View view = (View) LayoutInflater.from(mContext).inflate(R.layout.point_information, mParent, false);

        TextView tv_name = view.findViewById(R.id.tv_name);
        TextView tv_address = view.findViewById(R.id.tv_address);
        TextView tv_now = view.findViewById(R.id.tv_now);

        tv_name.setText(name);
        tv_address.setText(address);
        tv_now.setText("* 주차가능면:"+now+"면");

        Button bt_information = view.findViewById(R.id.bt_information);

        bt_information.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tv_name.setText("아 버튼 눌렸다고");
            }
        });

        return view;
    }
}
