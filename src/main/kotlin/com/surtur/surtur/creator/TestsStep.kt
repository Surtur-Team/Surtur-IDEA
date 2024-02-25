package com.surtur.surtur.creator

import com.intellij.ide.wizard.AbstractNewProjectWizardStep
import com.intellij.ide.wizard.NewProjectWizardStep
import com.intellij.ui.dsl.builder.*

class TestsStep(parent: NewProjectWizardStep) : AbstractNewProjectWizardStep(parent) {
    override fun setupUI(builder: Panel) {
        with(builder) {
            row {
                checkBox("Setup Tests")
            }
        }
    }
}