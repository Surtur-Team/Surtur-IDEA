package com.surtur.surtur.services

import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.surtur.surtur.Surtur

@Service(Service.Level.PROJECT)
class SurturProjectService(project: Project) {
    init {
        thisLogger().info(Surtur.message("projectService", project.name))
        thisLogger().warn("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }

    fun getRandomNumber() = (1..100).random()
}