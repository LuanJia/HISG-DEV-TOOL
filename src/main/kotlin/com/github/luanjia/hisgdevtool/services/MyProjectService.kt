package com.github.luanjia.hisgdevtool.services

import com.github.luanjia.hisgdevtool.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
