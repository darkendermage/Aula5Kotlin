package br.com.digitalhouse.Aula6Kotlin

fun main() {
    val estados = mutableListOf("São Paulo","Pará","Rio de Janeiro")
    println("O numero de elementos na lista é ${estados.size}")
    println("Pegando o terceiro elemento: ${estados.get(2)}")
    println("Indice do Pará: ${estados.indexOf("Pará")}")

    estados.add("Ortega")

}