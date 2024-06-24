package com.aaraf.authmoduleyt.use_case

import com.aaraf.authmoduleyt.domain.model.LoginInputValidation
import com.aaraf.authmoduleyt.domain.use_case.ValidateLoginInputUseCase
import org.junit.Test

class ValidateLoginInputUseCaseTest {
    private val validateLoginInputUseCase = ValidateLoginInputUseCase()


    @Test
    fun `empty password returns empty field`() {
        val result = validateLoginInputUseCase("email", "")
        assert(result == LoginInputValidation.EMPTY_FIELD)
    }

    @Test
    fun `invalid email returns invalid email`() {
        val result = validateLoginInputUseCase("email", "password")
        assert(result == LoginInputValidation.INVALID_EMAIL)
    }

    @Test
    fun `valid email and password returns success`() {
        val result = validateLoginInputUseCase("email@gmail.com", "password")
        assert(result == LoginInputValidation.SUCCESS)
    }
}