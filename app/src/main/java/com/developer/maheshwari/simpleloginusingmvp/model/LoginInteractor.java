package com.developer.maheshwari.simpleloginusingmvp.model;

import android.text.TextUtils;

public class LoginInteractor implements ILoginInteractor {


    @Override
    public void login(ILoginListener listener, String email, String password) {

        if (TextUtils.isEmpty(email)) {
            listener.loginFailed("Please enter email address");
        }
        if (TextUtils.isEmpty(password)) {
            listener.loginFailed("Please enter password");
        } else {
            listener.loginSuccess();
        }
    }
}
