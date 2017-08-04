package com.developer.maheshwari.simpleloginusingmvp.model;

public interface ILoginListener {

    void loginSuccess();

    void loginFailed(String errorMessage);
}
