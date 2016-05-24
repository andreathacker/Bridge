package com.dat.bridge;

import com.tuenti.smsradar.Sms;
import com.tuenti.smsradar.SmsListener;
import com.tuenti.smsradar.SmsRadar;

import android.content.Context;

public class SmsManager {

    public static void createSmsManager() {

    }

    public void doSomething(Context context) {
        SmsRadar.initializeSmsRadarService(context, new SmsListener() {
            @Override
            public void onSmsSent(Sms sms) {

            }

            @Override
            public void onSmsReceived(Sms sms) {

            }
        });
    }

    public void stopSms(Context context) {
        SmsRadar.stopSmsRadarService(context);
    }

}
