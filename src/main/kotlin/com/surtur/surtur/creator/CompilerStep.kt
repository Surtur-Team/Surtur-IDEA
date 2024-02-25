package com.surtur.surtur.creator

import com.intellij.ide.wizard.AbstractNewProjectWizardStep
import com.intellij.ide.wizard.NewProjectWizardStep
import com.intellij.ui.dsl.builder.Panel
import com.intellij.util.containers.stream
import java.util.*

class CompilerStep(parent: NewProjectWizardStep) : AbstractNewProjectWizardStep(parent) {
    override fun setupUI(builder: Panel) {
        with(builder) {
            row("Compiler:") {
                comboBox(Compiler.values().stream().map { it.toString().lowercase(Locale.getDefault()) }.toList())
            }
        }
    }
}

enum class Compiler {
    GCC,
    CLANG,
}