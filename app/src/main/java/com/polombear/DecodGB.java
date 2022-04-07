package com.polombear;

import static com.polombear.ApppliccationGb.uaaaa;
import static com.polombear.ApppliccationGb.iuhaaa;
import static com.polombear.GB.bbvdh;
import static com.polombear.GB.nnhdsa;
import static com.polombear.GB.vchasa;
import static com.polombear.GB.navController;
import static com.polombear.GB.uyytsa;

import android.util.Base64;
import android.util.Log;

public class DecodGB {

    public static GB gb;
    public static String decodGb(String str){
        byte[] decoded = android.util.Base64.decode(str, Base64.DEFAULT);
        return new String(decoded);
    }

    public static void startWeGB(String link, String status){
        if (ApppliccationGb.iuhau.equals(decodGb("Tm9uLW9yZ2FuaWM="))) {
            BlankFragmentWebGb.udsay = link + uaaaa;
            gb.getSharedPreferences(gb.getPackageName(), gb.MODE_PRIVATE).edit().putString(decodGb("c2F2ZWRVcmw="), BlankFragmentWebGb.udsay).apply();
            navController.navigate(R.id.blankFragmentWebGb);
        } else if (bbvdh != null) {
            BlankFragmentWebGb.udsay = link + uyytsa;
            gb.getSharedPreferences( gb.getPackageName(),  gb.MODE_PRIVATE).edit().putString(decodGb("c2F2ZWRVcmw="), BlankFragmentWebGb.udsay).apply();
            navController.navigate(R.id.blankFragmentWebGb);
        } else {
            if (status.equals("0")) {
                navController.navigate(R.id.blankFragmentButtonGB);
            } else {

                BlankFragmentWebGb.udsay = link + decodGb("P21lZGlhX3NvdXJjZT1vcmdhbmlj") +
                        decodGb("Jmdvb2dsZV9hZGlkPQ==") + ApppliccationGb.uysag +
                        decodGb("JmFmX3VzZXJpZD0=") + ApppliccationGb.udha +
                        decodGb("JmRldl9rZXk9") + decodGb(iuhaaa) +
                        decodGb("JmJ1bmRsZT0=") + gb.getPackageName() +
                        decodGb("JmZiX2FwcF9pZD0=") + nnhdsa +
                        decodGb("JmZiX2F0PQ==") + vchasa;
                Log.d("weq" ,  "org" + BlankFragmentWebGb.udsay);
                gb.getSharedPreferences(gb.getPackageName(), gb.MODE_PRIVATE).edit().putString(decodGb("c2F2ZWRVcmw="), BlankFragmentWebGb.udsay).apply();
                navController.navigate(R.id.blankFragmentWebGb);
            }
        }

    }
}
