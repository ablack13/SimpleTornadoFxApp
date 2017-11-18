package com.ablack13.fxexample.view

import com.ablack13.fxexample.model.Person
import tornadofx.*

class PersonsListView : View() {
    private val controller: PersonListViewController by inject()

    override val root = vbox {
        splitpane {
            anchorpane {
                prefWidth = 600.0
                prefHeight = 300.0

                stackpane {
                    anchorpaneConstraints {
                        leftAnchor = 0.0
                        rightAnchor = 0.0
                        topAnchor = 0.0
                        bottomAnchor = 0.0
                    }
                    tableview(controller.getPersonList()) {

                        column("First Name", Person::firstName)
                        column("Last Name", Person::lastName)

                        columnResizePolicy = SmartResize.POLICY
                    }
                }
            }
            anchorpane {

            }
            fitToParentSize()
        }
    }
}
