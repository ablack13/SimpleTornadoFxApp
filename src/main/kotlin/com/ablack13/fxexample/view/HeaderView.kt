package com.ablack13.fxexample.view

import javafx.scene.layout.HBox
import tornadofx.View
import tornadofx.item
import tornadofx.menu
import tornadofx.menubar

class HeaderView : View() {
    private val controller: HeaderViewController by inject()
    override val root = HBox()

    init {
        with(root) {
            menubar {
                menu("File") {
                    item("Close")
                }
                menu("Edit") {
                    item("Delete")
                }
                menu("Help") {
                    item("About")
                }
            }
        }
    }
}