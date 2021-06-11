package com.example.news.india;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.news.R;
import com.example.news.WebControl;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IndiaTv#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IndiaTv extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public IndiaTv() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IndiaTv.
     */
    // TODO: Rename and change types and number of parameters
    public static IndiaTv newInstance(String param1, String param2) {
        IndiaTv fragment = new IndiaTv();
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
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_india_tv, container, false);
        WebView India=view.findViewById(R.id.IndiaTv);
        India.loadUrl("https://www.indiatvnews.com/livetv");
        India.setWebViewClient(new WebControl());
        return view;
    }
}