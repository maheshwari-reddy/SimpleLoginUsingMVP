package com.developer.maheshwari.simpleloginusingmvp.model;

import android.text.TextUtils;

class LoginInteractor implements ILoginInteractor {


    @Override
    public void login(ILoginListener listener, String email, String password) {

        if (TextUtils.isEmpty(email)) {
            listener.loginFailed("Please enter email address");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            listener.loginFailed("Please enter password");
            return;
        } else {
            listener.loginSuccess();
        }
    }
}
