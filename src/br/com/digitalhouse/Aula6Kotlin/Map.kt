package br.com.digitalhouse.Aula6Kotlin

fun main() {
    val numeros = mapOf("one" to 1, "two" to 2, "three" to 3)
    println("Chaves: ${numeros.keys}")
    println("Valores: ${numeros.values}")

    if("two" in numeros){
        println("O valor da chave two: ${numeros["two"]}")
    }
}