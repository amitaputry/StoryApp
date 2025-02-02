package com.amita.storyapp.helper

import android.util.Patterns

fun String.validateEmail(): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(this).matches()
}