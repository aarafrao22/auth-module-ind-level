package com.aaraf.authmoduleyt.domain.use_case

import com.aaraf.authmoduleyt.domain.model.LoginInputValidation

class ValidateLoginInputUseCase {

    operator fun invoke(email: String, password: String): LoginInputValidation {
        if (email.isEmpty() || password.isEmpty()) {
            return LoginInputValidation.EMPTY_FIELD
        }
        if (!email.contains("@")) {
            return LoginInputValidation.INVALID_EMAIL
        }
        return LoginInputValidation.SUCCESS

    }
}