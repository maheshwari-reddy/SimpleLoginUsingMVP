package com.developer.maheshwari.simpleloginusingmvp.utility;


import android.text.TextUtils;

public class Utility {

    public final static boolean isValidEmail(CharSequence email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
