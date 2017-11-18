package com.ablack13.fxexample.view

import com.ablack13.fxexample.model.Person
import tornadofx.*

class PersonOverviewView : View() {
    private val controller: PersonOverviewViewController by inject()
    override val root = splitpane {
        anchorpane {
            minWidth = 200.0
            fitToParentSize()

            tableview(controller.getPersonList()) {
                column("First Name", Person::firstName)
                column("Last Name", Person::lastName)

                columnResizePolicy = SmartResize.POLICY
            }

        }
        anchorpane {

        }
        importStylesheet("css/MainView.css")
    }
}
