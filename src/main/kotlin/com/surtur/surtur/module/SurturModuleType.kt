package com.surtur.surtur.module

import com.intellij.openapi.module.ModuleType
import com.surtur.surtur.SurturIcons
import javax.swing.Icon


class SurturModuleType : ModuleType<SurturModuleBuilder>("surtur") {
    override fun createModuleBuilder(): SurturModuleBuilder {
        return SurturModuleBuilder()
    }

    override fun getName(): String {
        return "Surtur"
    }

    override fun getDescription(): String {
        return "Surtur binary application"
    }

    override fun getNodeIcon(p0: Boolean): Icon {
        return SurturIcons.SURTUR
    }

}

private val INSTANCE = SurturModuleType();
fun getInstance(): SurturModuleType {
    return INSTANCE
}