package com.ablack13.fxexample.view

import com.ablack13.fxexample.model.Person
import tornadofx.*

class PersonOverviewView : View() {
    private val controller: PersonOverviewViewController by inject()
    override val root = splitpane {
        tableview(controller.getPersonList()) {
            column("First Name", Person::firstName)
            column("Last Name", Person::lastName)

            minWidth = 200.0
            columnResizePolicy = SmartResize.POLICY
        }
        anchorpane {

        }
        importStylesheet("css/MainView.css")
    }
}
