package com.developer.maheshwari.simpleloginusingmvp.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.developer.maheshwari.simpleloginusingmvp.R;
import com.developer.maheshwari.simpleloginusingmvp.model.ILoginView;
import com.developer.maheshwari.simpleloginusingmvp.model.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    @BindView(R.id.edtEmail)
    EditText email;
    @BindView(R.id.edtPassword)
    EditText password;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        presenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btnLogin)
    public void attemptLogin() {
        presenter.login(email.getText().toString().trim(), password.getText().toString().trim());
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void loginFailed(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show();
    }
}
