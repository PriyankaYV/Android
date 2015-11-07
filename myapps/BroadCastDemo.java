package com.example.priyanka.myapps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.gsm.SmsMessage;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by PRIYANKA on 10/28/2015.
 */
public class BroadCastDemo extends BroadcastReceiver {

    private static final String SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";
    private static  final String BATTERY_LOW = "android.intent.action.BATTERY_LOW";
    private static final String TAG = "SMSBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Intent recieved: " + intent.getAction());

        if (intent.getAction().equals(SMS_RECEIVED)) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                Object[] pdus = (Object[])bundle.get("pdus");
                final SmsMessage[] messages = new SmsMessage[pdus.length];
                for (int i = 0; i < pdus.length; i++) {
                    messages[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
                }
                for(SmsMessage message : messages){
                    String strMessageFrom = message.getDisplayOriginatingAddress();
                    String strMessageBody = message.getDisplayMessageBody();

                    Toast.makeText(context, "You have a mesg from" + strMessageFrom, Toast.LENGTH_LONG).show();
                    Toast.makeText(context, " " + strMessageBody, Toast.LENGTH_LONG).show();
                }
            }
        }else if (intent.getAction().equals(BATTERY_LOW)){
            Toast.makeText(context,"I'm going to die now..!!",Toast.LENGTH_LONG).show();
        }
    }
}
