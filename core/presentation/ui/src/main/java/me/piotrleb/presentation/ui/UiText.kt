package me.piotrleb.presentation.ui

import android.content.Context
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource

sealed interface UiText {
    data class DynamicString(val value: String): UiText
    class StringResource(
        @StringRes val id: Int,
        val args: Array<Any> = emptyArray()
    ): UiText

    @Composable
    fun asString(): String {
        return when(this){
            is UiText.DynamicString -> value
            is UiText.StringResource -> stringResource(id = id, *args)
        }
    }

    fun asString(context: Context): String {
        return when(this){
            is UiText.DynamicString -> value
            is UiText.StringResource -> context.getString(id, *args)
        }
    }
}