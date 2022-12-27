package com.unitytech.ccpdemo;

import android.content.Context;
import android.widget.Toast;

public class Helper_class {

    public void ShowToast(Context context,String Message){
        Toast.makeText(context, ""+Message, Toast.LENGTH_SHORT).show();

    }
}
