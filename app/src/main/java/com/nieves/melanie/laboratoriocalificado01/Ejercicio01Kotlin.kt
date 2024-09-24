package com.nieves.melanie.laboratoriocalificado01

class Ejercicio01Kotlin {

    // Esta función va a contar cuántas veces aparece cada carácter en la palabra
    fun contarFrecuenciaCaracteres(palabra: String): Map<Char, Int> {
        //Luego crearemos un mapa para guardar cuántas veces aparece cada letra
        val frecuencia = mutableMapOf<Char, Int>()

        // Recorremos cada letra de la palabra
        for (caracter in palabra) {
            // Y si la letra ya está en el mapa, aumentamos su contador en 1
            if (frecuencia.containsKey(caracter)) {
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                // Si es la primera vez que aparece esta letra, la añadimos con un valor inicial de 1
                frecuencia[caracter] = 1
            }
        }

        // Devolvemos el mapa que contiene cuántas veces apareció cada letra
        return frecuencia
    }
}

fun main() {
    // Se crea una instancia de nuestra clase para poder usar la función
    val ejercicio = Ejercicio01Kotlin()

    // Definimos la palabra que queremos analizar
    val palabra = "esternocleidomastoideo"

    // Por ultimo imprimimos el resultado: la frecuencia de cada letra en la palabra
    println("Frecuencia de caracteres en la palabra '$palabra': ${ejercicio.contarFrecuenciaCaracteres(palabra)}")
}
