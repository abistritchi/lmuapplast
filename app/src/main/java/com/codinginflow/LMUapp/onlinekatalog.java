package com.codinginflow.LMUapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class onlinekatalog extends Activity {

    private WebView mWebview ;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mWebview = new WebView(this);

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



        String url ="https://google.de";
        url =new Anforderungen().getURL();
        mWebview.loadUrl(url);
        //mWebview.loadUrl("https://opac.ub.uni-muenchen.de/TouchPoint/search.do?methodToCall=submit&searchCategories%5B0%5D=-1&searchHistory=&CSId=21827N426Sff0f425b99a7b00fab71ff69a0f81bbb6d64a4fc&refine=true&refineField=-1&tab=tab1&View=sunrise&refineHitListName=2_SOLR_SERVER_1987694276&refineQuery=what+are+you+looking+for%3F&submitSearch=Suchen&refineType=new");
        setContentView(mWebview);

    }
}