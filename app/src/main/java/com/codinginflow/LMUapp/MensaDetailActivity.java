package com.codinginflow.LMUapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MensaDetailActivity extends AppCompatActivity
{
    Shape1 selectedShape1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        getSelectedShape1();

        WebView mWebview = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        mWebview.setWebViewClient(new WebViewClient() {
            @SuppressWarnings("deprecation")
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
            @TargetApi(android.os.Build.VERSION_CODES.M)
            @Override
            public void onReceivedError(WebView view, WebResourceRequest req, WebResourceError rerr) {
                // Redirect to deprecated method, so you can use it in all SDK versions
                onReceivedError(view, rerr.getErrorCode(), rerr.getDescription().toString(), req.getUrl().toString());
            }
        });

        mWebview.loadUrl(selectedShape1.getUrl());
        setContentView(mWebview );

    }

    private void getSelectedShape1()
    {
        Intent previousIntent = getIntent();
        String parsedStringID = previousIntent.getStringExtra("id");
        selectedShape1 = MensaAlgemain.shapeList1.get(Integer.valueOf(parsedStringID));
    }

}