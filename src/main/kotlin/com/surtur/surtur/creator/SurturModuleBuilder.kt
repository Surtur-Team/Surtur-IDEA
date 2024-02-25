package com.surtur.surtur.creator

import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.ide.wizard.AbstractNewProjectWizardBuilder
import com.intellij.ide.wizard.GitNewProjectWizardStep
import com.intellij.ide.wizard.NewProjectWizardBaseStep
import com.intellij.ide.wizard.NewProjectWizardChainStep.Companion.nextStep
import com.intellij.ide.wizard.RootNewProjectWizardStep
import com.intellij.openapi.roots.ModifiableRootModel
import com.jayway.jsonpath.PathNotFoundException
import com.surtur.surtur.SurturIcons
import java.nio.file.Path
import javax.swing.Icon


class SurturModuleBuilder : AbstractNewProjectWizardBuilder() {
    override fun getNodeIcon(): Icon {
        return SurturIcons.SURTUR
    }

    override fun getPresentableName(): String {
        return "Surtur"
    }

    override fun setupRootModel(modifiableRootModel: ModifiableRootModel) {
        val project = modifiableRootModel.project
        val projPath: Path = Path.of(
            project.basePath
                ?: throw PathNotFoundException("Path: ${project.basePath} is not valid")
        ).toAbsolutePath()
    }

    override fun getIgnoredSteps(): MutableList<Class<out ModuleWizardStep>> {
        return mutableListOf(ModuleWizardStep::class.java)
    }

    override fun createStep(context: WizardContext) = RootNewProjectWizardStep(context)
        .nextStep(::NewProjectWizardBaseStep)
        .nextStep(::GitNewProjectWizardStep)
        .nextStep(ProjectTypeStep::create)
        .nextStep(::CompilerStep)
        .nextStep(::TestsStep)

    override fun getBuilderId(): String {
        return "surtur"
    }


    override fun getDescription(): String {
        return "Hello there"
    }
}