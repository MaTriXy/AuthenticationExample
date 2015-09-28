package com.elkriefy.android.apps.authenticationexample.cleartextnetworkusage;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.webkit.WebView;
import android.widget.ImageView;

import com.elkriefy.android.apps.authenticationexample.BuildConfig;
import com.elkriefy.android.apps.authenticationexample.R;
import com.squareup.picasso.Picasso;

/**
 * This is a sample showcase for showing the usesCleartextTraffic Flag.
 */
public class ClearTextNetworkUsageActivity extends Activity {

    /**
     * This does not honor usesCleartextTraffic  flag at all - as mentioned in documentation.
     */
    WebView mWebview;

    //We Will load the Image from the URL into this simple View.
    ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.APPLY_STRICT_MODE) {
            StrictMode.VmPolicy.Builder b = new StrictMode.VmPolicy.Builder();
            b.detectCleartextNetwork().penaltyLog();
            StrictMode.setVmPolicy(b.build());
        }
        setContentView(R.layout.clear_text_network_activity_main);
        mImageView = (ImageView) findViewById(R.id.imageViewOutCome);

        mWebview = (WebView) findViewById(R.id.WebView_Network_test);
        mWebview.loadUrl(BuildConfig.URL);

        try {
            Picasso.with(this).load(BuildConfig.URL).fit().into(mImageView);

        } catch (Throwable e) {
            e.printStackTrace();
        }

    }

}
