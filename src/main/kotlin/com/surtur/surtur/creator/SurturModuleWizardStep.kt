package com.surtur.surtur.creator;

import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.ide.wizard.NewProjectWizardStep
import com.intellij.openapi.observable.properties.PropertyGraph
import com.intellij.openapi.util.UserDataHolder
import com.intellij.ui.dsl.builder.Panel

class SurturModuleWizardStep(
    override val context: WizardContext,
    override val data: UserDataHolder,
    override val keywords: NewProjectWizardStep.Keywords,
    override val propertyGraph: PropertyGraph
) : NewProjectWizardStep {
    override fun setupUI(builder: Panel) {
        super.setupUI(builder)
    }
}