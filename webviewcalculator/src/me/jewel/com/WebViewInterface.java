package me.jewel.com;

import java.util.Arrays;

import android.content.Context;
import android.widget.Toast;


public class WebViewInterface {
    Context context;
    


    public WebViewInterface(Context context){
        this.context=context;
    }

    @JavascriptInterface
    public String getResult(String expr)
    {
    	ScriptEngineManager manager = new ScriptEngineManager();
    	ScriptEngine engine = manager.getEngineByName("JavaScript");
    	Object result = engine.eval(expr);
    	return (String)result;
    }

}

	
