package com.ablack13.fxexample.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import java.time.LocalDate

class Person(fName: String, lName: String) {
    val firstName = SimpleObjectProperty<String>(fName)
    val lastName = SimpleStringProperty(lName)
    val street = SimpleStringProperty("National Guard 13b")
    val postalCode = SimpleIntegerProperty(1234)
    val city = SimpleStringProperty("Ivano-Frankivsk")
    val birthday = SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21))
}

