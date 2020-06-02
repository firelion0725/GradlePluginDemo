package com.leo.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("========================")
        println("hello gradle plugin!")
        println("Version 1.1.0")
        println("Now Start")
        println("========================")
    }
}