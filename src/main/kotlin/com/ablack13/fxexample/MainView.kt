package com.ablack13.fxexample

import com.ablack13.fxexample.view.HeaderView
import com.ablack13.fxexample.view.PersonsListView
import javafx.scene.layout.VBox
import tornadofx.View
import tornadofx.plusAssign

class MainView : View() {
    override val root = VBox()
    private val headerView by inject<HeaderView>()
    private val contentView by inject<PersonsListView>()

    init {
        title = "Address book"
        root += headerView.root
        root += contentView.root
    }
}