package com.codely.demo

import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun main() {
    println("Entra tu fecha de cumpleaños yyyy-MM-dd")
    val input = readLine()

    if (input.isNullOrEmpty()){
        println("Input no compatible")
        exitProcess(1)
    }
    val birthdayInserted = LocalDate.parse(input)
    val diff = Period.between(birthdayInserted, LocalDate.now())
    println("Tienes ${diff.years} años")
}
