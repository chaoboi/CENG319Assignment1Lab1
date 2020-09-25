package com.example.davidpham_ceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AIFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AIFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AIFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AIFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AIFragment newInstance(String param1, String param2) {
        AIFragment fragment = new AIFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_i, container, false);
        // Inflate the layout for this fragment
        String menuItems[] = {"AIActivity","VRActivity"};
        ListView listView = (ListView)view.findViewById(R.id.showList);

        //creating adapter
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems);
        listView.setAdapter(listViewAdapter);

        //adding setonitemclicklistener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0) {
                    Toast.makeText(getActivity(),"AIActivity",Toast.LENGTH_SHORT).show();
                    Intent IaiActivity = new Intent(getActivity(),AIActivity.class);
                    startActivity(IaiActivity);
                }
                else{
                    Toast.makeText(getActivity(),"VRActivity",Toast.LENGTH_SHORT).show();
                    Intent IvrActivity = new Intent(getActivity(),VRActivity.class);
                    startActivity(IvrActivity);
                }

            }
        });




        return view;
    }
}