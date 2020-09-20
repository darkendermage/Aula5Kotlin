package br.com.digitalhouse.Aula6Kotlin

fun main() {

    val estados = mutableSetOf("Paraná","Rio grande do Sul","São Paulo","Bahia")
    println(estados)
    println("Quantidade de estados: ${estados.size}")

    if(estados.contains("Paraná"))
        println("Paraná está no conjunto.")



}