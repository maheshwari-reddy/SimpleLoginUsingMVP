package com.developer.maheshwari.simpleloginusingmvp.model;

import android.text.TextUtils;

import com.developer.maheshwari.simpleloginusingmvp.utility.Utility;

class LoginInteractor implements ILoginInteractor {


    @Override
    public void login(ILoginListener listener, String email, String password) {

        if (TextUtils.isEmpty(email)) {
            listener.loginFailed("Please enter email address");
            return;
        }
        if (!TextUtils.isEmpty(email) && !Utility.isValidEmail(email)) {
            listener.loginFailed("Please enter valid email address");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            listener.loginFailed("Please enter password");
            return;
        }
        if (!TextUtils.isEmpty(password) && password.length() < 6) {
            listener.loginFailed("Password length must be at least 6 characters");
            return;
        } else {
            listener.loginSuccess();
        }
    }
}
