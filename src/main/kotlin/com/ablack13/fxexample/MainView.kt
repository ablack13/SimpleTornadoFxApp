package com.ablack13.fxexample

import com.ablack13.fxexample.view.PersonOverviewView
import com.ablack13.fxexample.view.HeaderView
import javafx.scene.layout.VBox
import tornadofx.View
import tornadofx.fitToParentSize
import tornadofx.plusAssign

class MainView : View() {
    override val root = VBox()
    private val headerView by inject<HeaderView>()
    private val contentView by inject<PersonOverviewView>()

    init {
        title = "Address book"
        root += headerView.root
        root += contentView.root

        with(root) {
            minWidth = 300.0
            prefWidth = 600.0
            prefHeight = 800.0
            maxWidth = Double.MAX_VALUE
            maxHeight = Double.MAX_VALUE
            fitToParentSize()
        }
    }
}