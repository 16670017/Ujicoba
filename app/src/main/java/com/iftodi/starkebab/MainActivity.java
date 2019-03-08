package com.iftodi.starkebab;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;

import org.apache.cordova.DroidGap;
public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ConnectivityManager con = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo nInfo = con.getActiveNetworkInfo();
		if(!nInfo.isConnected())
		{
			
		}
		else
		{
			super.loadUrl("file:///android_asset/www/index.html");
			super.appView.setVerticalScrollBarEnabled(true);
			super.appView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
		}
	}
}
