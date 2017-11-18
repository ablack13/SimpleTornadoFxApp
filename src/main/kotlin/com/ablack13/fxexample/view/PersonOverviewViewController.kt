package com.ablack13.fxexample.view

import com.ablack13.fxexample.model.Person
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.Controller

class PersonOverviewViewController : Controller() {
    private val personList = FXCollections.observableArrayList<Person>()

    init {
        fillPersons()
    }

    private fun fillPersons() {
        personList.add(Person("Hans", "Muster"))
        personList.add(Person("Ruth", "Mueller"))
        personList.add(Person("Heinz", "Kurz"))
        personList.add(Person("Cornelia", "Meier"))
        personList.add(Person("Werner", "Meyer"))
        personList.add(Person("Lydia", "Kunz"))
        personList.add(Person("Anna", "Best"))
        personList.add(Person("Stefan", "Meier"))
        personList.add(Person("Martin", "Mueller"))
    }

    fun getPersonList(): ObservableList<Person> = personList
}