package com.surtur.surtur.module

import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.projectRoots.ProjectJdkTable
import com.intellij.openapi.roots.ModifiableRootModel


class SurturModuleBuilder : ModuleBuilder() {
    override fun getModuleType(): ModuleType<*> {
        return getInstance()
    }

    override fun setupRootModel(modifiableRootModel: ModifiableRootModel) {
        super.setupRootModel(modifiableRootModel)
    }

    override fun getBuilderId(): String {
        return "surtur"
    }

    override fun getDescription(): String {
        return "<html><body>Before you start make sure you have Redline Smalltalk installed." +
                "<br/>Download <a href='https://github.com/redline-smalltalk/redline-smalltalk.github.com/raw/master/assets/redline-deploy.zip'>the latest version</a>" +
                "<br/>Unpack the zip file to any folder and select it as Redline SDK</body></html>"

    }
}