package com.kevin.strength180;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.JavascriptInterface;
import android.view.Window;
import android.graphics.Color;
public class MainActivity extends Activity {
  private WebView web;
  @Override public void onCreate(Bundle state) {
    super.onCreate(state);
    getWindow().setStatusBarColor(Color.rgb(7,13,9));
    getWindow().setNavigationBarColor(Color.rgb(7,13,9));
    web = new WebView(this);
    web.setBackgroundColor(Color.rgb(7,13,9));
    web.getSettings().setJavaScriptEnabled(true);
    web.getSettings().setDomStorageEnabled(true);
    web.getSettings().setAllowFileAccess(true);
    web.setWebViewClient(new WebViewClient());
    web.addJavascriptInterface(new Object() { @JavascriptInterface public void shareText(String text) {
      runOnUiThread(() -> { Intent send = new Intent(Intent.ACTION_SEND); send.setType("text/plain"); send.putExtra(Intent.EXTRA_TEXT, text); startActivity(Intent.createChooser(send, "Export Strength 180 progress")); });
    }}, "AndroidBridge");
    setContentView(web);
    web.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() { if(web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}
