package com.elkriefy.android.apps.authenticationexample.cleartextnetworkusage;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import com.elkriefy.android.apps.authenticationexample.R;

/**
 * Main entry point for the sample, showing a backpack and "Purchase" button.
 */
public class ClearTextNetworkUsageActivity extends Activity {

    WebView mWebview;

    TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ((AuthenticationExample) getApplication()).inject(this);

        setContentView(R.layout.clear_text_network_activity_main);
        mWebview = (WebView) findViewById(R.id.WebView_Network_test);


    }

}
