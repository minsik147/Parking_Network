package kr.ac.mokwon.parkingnetwork;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.Array;
import java.util.ArrayList;

public class BookMarkerFragment extends Fragment
{

    MainActivity main;

    AdapterRecyclerBookMarker adapter = null;

    RecyclerView recyclerView = null;

    ArrayList<itemBookMarker> list;

    public BookMarkerFragment()
    {
        super();
    }

    @Override
    public void onAttach(@NonNull Context context)
    {
        super.onAttach(context);
        main = (MainActivity) context;
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        main = null;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.activity_book_marker_fragment, container, false);

        recyclerView = view.findViewById(R.id.recycler);
        list = new ArrayList<>();
        adapter = new AdapterRecyclerBookMarker(list);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.VERTICAL, false));

        list.add(0, new itemBookMarker("계룡시청", "금암구"));

        adapter.notifyDataSetChanged();
        return view;
    }
}