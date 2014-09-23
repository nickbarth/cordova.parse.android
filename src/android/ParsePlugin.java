package org.apache.cordova.core;

import java.util.Set;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class ParsePlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("ParseInit")) {
            cordova.getThreadPool().execute(new Runnable() {
                public void run() {
                    try {
                        String appId = args.getString(0);
                        String clientKey = args.getString(1);
                        Parse.initialize(cordova.getActivity(), appId, clientKey);
                        callbackContext.success("{ \"success\": true }");
                    } catch (JSONException e) {
                        callbackContext.error("{ \"error\": \"Invalid JSON\" }");
                    }
                }
            });
            return true;
        }
        return false;
    }
}