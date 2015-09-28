package com.elkriefy.android.apps.authenticationexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.elkriefy.android.apps.authenticationexample.cleartextnetworkusage.ClearTextNetworkUsageActivity;
import com.elkriefy.android.apps.authenticationexample.credentialsgrace.CredGraceActivity;
import com.elkriefy.android.apps.authenticationexample.fingerprintdialog.FingerPrintDialogMainActivity;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChooseMe(View view) {
        Intent nextPart = null;
        switch (view.getId())
        {
            case R.id.Fingerprint_test:
                nextPart = new Intent(MainActivity.this, FingerPrintDialogMainActivity.class);
                break;
            case R.id.GraceCreds_test:
                nextPart = new Intent(MainActivity.this, CredGraceActivity.class);
                break;
            case R.id.clearText_test:
                nextPart = new Intent(MainActivity.this, ClearTextNetworkUsageActivity.class);
                break;
        }
        if (nextPart!=null)
            startActivity(nextPart);

    }
}
