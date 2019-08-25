package br.com.cursostudio.exercicio.contract

interface Contract {


    interface LoginView{
        fun showLoadingDialog()
        fun hideLoadingDialog()
        fun showFailure(message:String)
        fun logar()
    }

    interface LoginPresenter{
        fun checkLogin(login: String): Boolean
        fun checkPassword(password: String): Boolean
        fun login(login: String, password: String)
    }
}