package com.developer.maheshwari.simpleloginusingmvp.model;


public interface ILoginInteractor {

    void login(ILoginListener listener,String email,String password);
}
