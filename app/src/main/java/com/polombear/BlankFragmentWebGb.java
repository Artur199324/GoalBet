package com.polombear;

import static com.polombear.ApppliccationGb.iuhaaa;
import static com.polombear.ApppliccationGb.pppo;
import static com.polombear.ApppliccationGb.wweq;
import static com.polombear.GB.navController;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;


public class BlankFragmentWebGb extends Fragment {

    public static WebView webViewGb;

    public static String udsay;
    private static String rewtq;
    private static String qtegds;
    private static String kkiks;
    private static String vvcz;
    private static String vbvcx;
    private static String asdfd;
    public static GB gb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank_web_gb, container, false);
        webViewGb = view.findViewById(R.id.webViewGb);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewGb, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webViewGb.getSettings().setJavaScriptEnabled(true);
        webViewGb.getSettings().setAllowContentAccess(true);
        webViewGb.getSettings().setLoadWithOverviewMode(true);
        webViewGb.getSettings().setEnableSmoothTransition(true);
        webViewGb.getSettings().setUseWideViewPort(true);
        webViewGb.getSettings().setSaveFormData(true);
        webViewGb.getSettings().setAllowFileAccess(true);
        webViewGb.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webViewGb.getSettings().setDomStorageEnabled(true);
        webViewGb.setFocusableInTouchMode(true);
        webViewGb.setVisibility(View.VISIBLE);
        webViewGb.getSettings().setAllowFileAccessFromFileURLs(true);
        webViewGb.getSettings().setSavePassword(true);
        webViewGb.getSettings().setDatabaseEnabled(true);
        webViewGb.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        webViewGb.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        webViewGb.getSettings().setAppCacheEnabled(true);
        webViewGb.getSettings().setLoadsImagesAutomatically(true);
        webViewGb.setSaveEnabled(true);
        webViewGb.getSettings().setMixedContentMode(0);
        webViewGb.setFocusable(true);
        webViewGb.getSettings().setAllowUniversalAccessFromFileURLs(true);

        webViewGb.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains(DecodGB.decodGb("ZXJyb3I9YXBwYWZBczNm")) || url.contains(DecodGB.decodGb("ZGlzYWJsZWQuaHRtbA=="))) {
                    navController.navigate(R.id.blankFragmentButtonGB);
                }
            }
        });

        webViewGb.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> filePath,
                                             FileChooserParams fileChooserParams) {
                if (GB.bbhsas != null) {
                    GB.bbhsas.onReceiveValue(null);
                }
                GB.bbhsas = filePath;
                Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
                contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
                contentSelectionIntent.setType("*/*");
                Intent[] intentArray = new Intent[0];
                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
                chooserIntent.putExtra(Intent.EXTRA_TITLE, DecodGB.decodGb("U2VsZWN0IE9wdGlvbjo="));
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
                gb.startActivityForResult(chooserIntent, 1);
                return true;
            }
        });

        webViewGb.loadUrl(udsay);


        return view;
    }

    public static String parse(String s) {

        String[] campLucky = s.split("_");

        try {
            rewtq = campLucky[0];
        } catch (Exception e) {

            rewtq = "";
        }
        try {
            qtegds = campLucky[1];
        } catch (Exception e) {

            qtegds = "";
        }
        try {
            kkiks = campLucky[2];
        } catch (Exception e) {
            kkiks = "";

        }
        try {
            vvcz = campLucky[3];
        } catch (Exception e) {
            vvcz = "";

        }
        try {
            vbvcx = campLucky[4];
        } catch (Exception e) {
            vbvcx = "";
            ;
        }
        try {
            asdfd = campLucky[5];
        } catch (Exception e) {
            asdfd = "";

        }

        return DecodGB.decodGb("P21lZGlhX3NvdXJjZT0=") + ApppliccationGb.qqwqw +
                DecodGB.decodGb("JnN1YjE9") + rewtq +
                DecodGB.decodGb("JnN1YjI9") + qtegds +
                DecodGB.decodGb("JnN1YjM9") + kkiks +
                DecodGB.decodGb("JnN1YjQ9") + vvcz +
                DecodGB.decodGb("JnN1YjU9") + vbvcx +
                DecodGB.decodGb("JnN1YjY9") + asdfd +
                DecodGB.decodGb("JmNhbXBhaWduPQ==") + pppo +
                DecodGB.decodGb("Jmdvb2dsZV9hZGlkPQ==") + ApppliccationGb.uysag +
                DecodGB.decodGb("JmFmX3VzZXJpZD0=") + ApppliccationGb.udha +
                DecodGB.decodGb("JmFmX2NoYW5uZWw9") + wweq +
                DecodGB.decodGb("JmRldl9rZXk9") + DecodGB.decodGb(iuhaaa) +
                DecodGB.decodGb("JmJ1bmRsZT0=") + gb.getPackageName() +
                DecodGB.decodGb("JmZiX2FwcF9pZD0=") + GB.nnhdsa +
                DecodGB.decodGb("JmZiX2F0PQ==") + GB.vchasa;
    }


    public static boolean isOnline() {
        String cs = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cm = (ConnectivityManager) gb.getSystemService(cs);
        if (cm.getActiveNetworkInfo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static void depp() {

        AppEventsLogger.activateApp(gb.getApplication());
        AppLinkData.fetchDeferredAppLinkData(gb.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(gb);

                }
                if (appLinkData != null) {
                    String[] as = appLinkData.getTargetUri().toString().split("://");
                    GB.bbvdh = as[1];
                    GB.uyytsa = BlankFragmentWebGb.parse(GB.bbvdh);


                } else {

                }
            }
        });

    }
}