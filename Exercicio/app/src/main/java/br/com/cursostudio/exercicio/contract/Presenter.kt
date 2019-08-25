package br.com.cursostudio.exercicio.contract

import br.com.cursostudio.exercicio.LoginActivity

class Presenter : Contract.LoginPresenter{


   // private val view = LoginActivity()
    //testasr assim ou
   lateinit var view :Contract.LoginView



    override fun checkLogin(login: String): Boolean {
        if(login.length <3){view.showFailure( "msg curta" )
            return false

            }
        return true
    }

    override fun checkPassword(password: String): Boolean { if(password.length <3) {
        view.showFailure("senha curta")
        return false
    }

        return true   }

    override fun login(login: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}