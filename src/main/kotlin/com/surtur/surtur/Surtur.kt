package com.surtur.surtur

import com.intellij.DynamicBundle
import com.intellij.openapi.diagnostic.thisLogger
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.PropertyKey

@NonNls
private const val BUNDLE = "messages.Surtur"

object Surtur : DynamicBundle(BUNDLE) {
    init {
        thisLogger().info("Hekki")
    }

    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
            getMessage(key, *params)

    @Suppress("unused")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
            getLazyMessage(key, *params)
}