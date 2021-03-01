package com.example.androiddevchallenge

sealed class Navigation(val title: String) {
    object Home : Navigation("Home")
    object Detail : Navigation("Detail")
}