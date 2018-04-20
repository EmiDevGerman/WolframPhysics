package de.emrij.pla;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class wikipedia extends AppCompatActivity {
    WebView wv;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.wikipedia);
        super.onCreate(savedInstanceState);
        wv = findViewById(R.id.webview1);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new myWebViewClient());
        wv.loadUrl("https://de.wikipedia.org/wiki/Physik");


    }
    public class myWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wv.canGoBack()) {
            //if Back key pressed and webview can navigate to previous page
            wv.goBack();
            // go back to previous page
            return true;
        }
        else
        {
            finish();
            // finish the activity
        }
        return super.onKeyDown(keyCode, event);
    }
}
