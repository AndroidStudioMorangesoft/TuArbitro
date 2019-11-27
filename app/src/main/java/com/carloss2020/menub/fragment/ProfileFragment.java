package com.carloss2020.menub.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.carloss2020.menub.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {
    private WebView webView;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View rootView=inflater.inflate(R.layout.fragment_profile, container, false);
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_profile, container, false);
//    RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        webView = (WebView)rootView.findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://microsoftorange.com/webtoons/manga/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return rootView;
    }





}



































