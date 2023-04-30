package com.example.fineone_impledebug

class MyUser {
    private var password: String? = null
    private var name: String? = null
    fun setPassword(password: String) {
        this.password = password
    }

    fun setUsername(name: String) {
        this.name = name
    }
    fun getPassword(): String? {
        return password
    }

    fun getUsername(): String? {
        return name
    }
}