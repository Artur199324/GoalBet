package com.polombear;

import android.app.Application;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.util.Map;

public class ApppliccationGb extends Application {

    public static String udha;
    public static String iuhau = "-";
    public static String uysag;
    public static String uaaaa;
    public static String iuhaaa = "YzhvalNSOEtaeTU4TFJnb2Mzdk5pWg==";
    public static String pppo;
    public static String qqwqw;
    public static String wweq;

    @Override
    public void onCreate() {
        super.onCreate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    uysag = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();

        udha = AppsFlyerLib.getInstance().getAppsFlyerUID(this);

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(DecodGB.decodGb("MjEzMDFiY2YtODc3Yy00YzA2LWI5NzAtNTc4MGY4MWRkNTZj"));

        appsF();
    }

    public void appsF(){

        AppsFlyerLib.getInstance().init(DecodGB.decodGb(iuhaaa), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                iuhau = map.get(DecodGB.decodGb("YWZfc3RhdHVz")).toString();

                if (iuhau.equals(DecodGB.decodGb("Tm9uLW9yZ2FuaWM="))){

                    try {
                        pppo = map.get(DecodGB.decodGb("Y2FtcGFpZ24=")).toString();
                    }catch (Exception e){

                    }

                    try {

                        qqwqw = map.get(DecodGB.decodGb("bWVkaWFfc291cmNl")).toString();
                    }catch (Exception e){

                    }

                    try {

                        wweq = map.get(DecodGB.decodGb("YWZfY2hhbm5lbA==")).toString();
                    }catch (Exception e){

                    }

                    uaaaa = BlankFragmentWebGb.parse(pppo);

                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);


    }
}
