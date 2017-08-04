package com.developer.maheshwari.simpleloginusingmvp.model;

public interface ILoginView {

    void loginSuccess();

    void loginFailed(String errorMessage);
}
