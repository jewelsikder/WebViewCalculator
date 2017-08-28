package me.jewel.com;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class WebviewcalculatorActivity extends Activity {
	WebView wv;
	Button btn=null;
	ConnectivityManager conman;
    WifiManager wifiManager;
    Context context;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        wv=(WebView)findViewById(R.id.web);
        btn=(Button)findViewById(R.id.btn1);
        conman = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        wifiManager=(WifiManager)getSystemService(Context.WIFI_SERVICE);
        
        wv.getSettings().setJavaScriptEnabled(true);
        wv.addJavascriptInterface(new WebViewInterface(this), "Android");
        
 
        
    }
    	
    public void Clicked(View v)
    {
    	Log.d("In clicked","Clicked");
        if (conman.getActiveNetworkInfo().equals(null)) {
        	Log.d("If","In If");
        	Message.message(this, "No wifi connection available");
        	wv.loadUrl("file:///android_asset/webcal.html");

        } else {
        	Log.d("else","In else");

        	Message.message(this, " wifi connection available");
    		wv.loadUrl("file:///android_asset/webcal.html");
        }		

    	
    }
    		
    	        		    			        
    				
    			
    
    
 
    
}