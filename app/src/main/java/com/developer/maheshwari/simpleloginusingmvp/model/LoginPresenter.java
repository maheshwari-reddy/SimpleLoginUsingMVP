package com.developer.maheshwari.simpleloginusingmvp.model;


public class LoginPresenter implements ILoginPresenter, ILoginListener {

    private LoginInteractor interactor;
    private ILoginView view;

    public LoginPresenter(ILoginView view) {
        this.view = view;
        this.interactor = new LoginInteractor();
    }

    @Override
    public void loginSuccess() {
        view.loginSuccess();
    }

    @Override
    public void loginFailed(String errorMessage) {
        view.loginFailed(errorMessage);
    }

    @Override
    public void login(String email, String password) {
        interactor.login(this, email, password);
    }
}
