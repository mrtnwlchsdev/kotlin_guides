// La recepcion de mensajes de error ocurre cuando sucede algo incorrecto en el codigo
// Cuando ocurre un error, el compilador no puede traducir el programa y retorna un mensaje de error
// El compilador de Kotlin provee mensajes de error descriptivos y concisos que permiten identificar de forma facil donde ocurre el error

fun main() {
    printlnn("Hello World")
}

/*
    05.errors.kt:6:3: error: unresolved reference printlnn
    printlnn("Hello World")
    ^

        - 05.errors.kt :: Nombre del archivo donde ocurre el error
        - 6 :: Linea donde se ubica el error
        - unresolved reference printlnn :: Descripcion del error
*/