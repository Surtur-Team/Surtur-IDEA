package com.surtur.surtur.creator

import com.intellij.ide.wizard.AbstractNewProjectWizardMultiStep
import com.intellij.ide.wizard.NewProjectWizardBaseData
import com.intellij.ide.wizard.NewProjectWizardMultiStepFactory
import com.intellij.ide.wizard.NewProjectWizardStep
import com.intellij.openapi.extensions.ExtensionPointName

class ProjectTypeStep private constructor(parent: NewProjectWizardStep) :
    AbstractNewProjectWizardMultiStep<ProjectTypeStep, ProjectTypeStep.Factory>(parent, EP_NAME),
    NewProjectWizardBaseData by parent as NewProjectWizardBaseData {
        companion object {
            val EP_NAME = ExtensionPointName<Factory>("com.surtur.surtur.projectTypeWizard")

            fun <P> create(parent: P) where P : NewProjectWizardStep, P : NewProjectWizardBaseData =
                ProjectTypeStep(parent)
        }
    interface Factory : NewProjectWizardMultiStepFactory<ProjectTypeStep>

    override val label: String
        get() = "Project Type"
    override val self: ProjectTypeStep
        get() = this
}