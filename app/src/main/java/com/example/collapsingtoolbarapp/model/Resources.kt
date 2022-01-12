package com.example.collapsingtoolbarapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Resources(
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId2: Int,
    @DrawableRes val imageResourceId: Int) {

}