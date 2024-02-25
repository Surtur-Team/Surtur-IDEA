package com.surtur.surtur.creator

import com.intellij.ide.wizard.AbstractNewProjectWizardStep

class Binary(parent: ProjectTypeStep) : AbstractNewProjectWizardStep(parent) {
    class Factory : ProjectTypeStep.Factory {
        override val name = "Binary"
        override fun createStep(parent: ProjectTypeStep) = Binary(parent)
    }
}

class Library(parent: ProjectTypeStep) : AbstractNewProjectWizardStep(parent) {
    class Factory : ProjectTypeStep.Factory {
        override val name = "Library"
        override fun createStep(parent: ProjectTypeStep) = Library(parent)
    }
}