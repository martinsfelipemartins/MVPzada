package br.com.cursostudio.exercicio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import br.com.cursostudio.exercicio.contract.Contract
import br.com.cursostudio.exercicio.contract.Presenter
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), Contract.LoginView {
    private val presenter= Presenter()

    override fun showLoadingDialog() {
        loading.visibility = View.VISIBLE

    }

    override fun hideLoadingDialog() {
        loading.visibility = View.GONE
    }

    override fun showFailure(message: String) {
Toast.makeText(this,message,Toast.LENGTH_LONG)    }

    override fun logar() {
val intent=Intent(this, MainActivity::class.java)
    startActivity(intent)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter.view=this
        btnOk.setOnClickListener {
            val login = edtLogin.text.toString()
            val password = edtPassword.text.toString()

            if(!presenter.checkLogin(login)){return@setOnClickListener

            }
            if(!presenter.checkPassword(password)) return@setOnClickListener
presenter.login(login, password)
        }

    }
}
