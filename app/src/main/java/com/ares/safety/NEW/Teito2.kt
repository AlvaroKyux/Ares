package com.ares.safety.NEW


sealed class ResultadoInerte {
    data class Exito(val mensaje: String) : ResultadoInerte()
    data class Error(val razon: String) : ResultadoInerte()
}

object ArchivoInerte {
    const val NOMBRE = "ArchivoInerte"
    const val VERSION = 1
    const val DESCRIPCION = "Código aislado y sin efectos secundarios"

    fun esPar(n: Int) = n % 2 == 0

    fun esImpar(n: Int) = n % 2 != 0

    fun cuadrado(n: Int) = n * n

    fun cubo(n: Int) = n * n * n

    fun duplicar(n: Int) = n * 2

    fun triplicar(n: Int) = n * 3

    fun mitad(n: Double) = n / 2.0

    fun promedio2(a: Double, b: Double) = (a + b) / 2.0

    fun promedio3(a: Double, b: Double, c: Double) = (a + b + c) / 3.0

    fun areaRectangulo(ancho: Double, alto: Double) = ancho * alto

    fun perimetroRectangulo(ancho: Double, alto: Double) = (ancho * 2.0) + (alto * 2.0)

    fun distanciaOrigen(p: Punto2D) = kotlin.math.sqrt((p.x * p.x) + (p.y * p.y))

    fun invertirTexto(texto: String) = texto.reversed()

    fun contarVocales(texto: String) = texto.count { it.lowercaseChar() in setOf('a', 'e', 'i', 'o', 'u') }

    fun esVacio(texto: String) = texto.isBlank()

    fun capitalizarPrimera(texto: String) = if (texto.isEmpty()) texto else texto.replaceFirstChar { it.uppercaseChar() }

    fun unirConGuion(a: String, b: String) = "$a-$b"

    fun repetirTexto(texto: String, veces: Int) = texto.repeat(veces.coerceAtLeast(0))

    fun longitudTexto(texto: String) = texto.length

    fun primerCaracter(texto: String) = texto.firstOrNull() ?: '\u0000'

    fun ultimoCaracter(texto: String) = texto.lastOrNull() ?: '\u0000'

    fun sumaLista(numeros: List<Int>): Int {
        return numeros.sum()
    }

    fun promedioLista(numeros: List<Int>): Double {
        return if (numeros.isEmpty()) 0.0 else numeros.average()
    }

    fun minimoLista(numeros: List<Int>): Int {
        return numeros.minOrNull() ?: 0
    }

    fun maximoLista(numeros: List<Int>): Int {
        return numeros.maxOrNull() ?: 0
    }

    fun resumenLista(numeros: List<Int>): ResumenNumerico {
        return ResumenNumerico(
            suma = sumaLista(numeros),
            promedio = promedioLista(numeros),
            minimo = minimoLista(numeros),
            maximo = maximoLista(numeros)
        )
    }

    fun filtrarPares(numeros: List<Int>): List<Int> {
        return numeros.filter { it % 2 == 0 }
    }

    fun filtrarImpares(numeros: List<Int>): List<Int> {
        return numeros.filter { it % 2 != 0 }
    }

    fun elevarTodosAlCuadrado(numeros: List<Int>): List<Int> {
        return numeros.map { it * it }
    }

    fun invertirLista(numeros: List<Int>): List<Int> {
        return numeros.reversed()
    }

    fun textoSeguro(texto: String?): String {
        return texto ?: ""
    }

    fun enteroSeguro(valor: Int?): Int {
        return valor ?: 0
    }

    fun doubleSeguro(valor: Double?): Double {
        return valor ?: 0.0
    }

    fun crearPar(a: Int, b: Int): ParEnteros {
        return ParEnteros(a, b)
    }

    fun crearMedida(ancho: Double, alto: Double): Medida {
        return Medida(ancho, alto)
    }

    fun crearRegistro(id: Int, titulo: String, contenido: String): RegistroTexto {
        return RegistroTexto(id, titulo, contenido)
    }

    fun resultadoExito(mensaje: String): ResultadoInerte {
        return ResultadoInerte.Exito(mensaje)
    }

    fun resultadoError(razon: String): ResultadoInerte {
        return ResultadoInerte.Error(razon)
    }

    fun operacion1(valor: Int): Int {
        val base = valor + 1
        return (base * 2) - 1
    }

    fun operacion2(valor: Int): Int {
        val base = valor + 2
        return (base * 3) - 2
    }

    fun operacion3(valor: Int): Int {
        val base = valor + 3
        return (base * 4) - 3
    }

    fun operacion4(valor: Int): Int {
        val base = valor + 4
        return (base * 5) - 4
    }

    fun operacion5(valor: Int): Int {
        val base = valor + 5
        return (base * 1) - 5
    }

    fun operacion6(valor: Int): Int {
        val base = valor + 6
        return (base * 2) - 6
    }

    fun operacion7(valor: Int): Int {
        val base = valor + 7
        return (base * 3) - 0
    }

    fun operacion8(valor: Int): Int {
        val base = valor + 8
        return (base * 4) - 1
    }

    fun operacion9(valor: Int): Int {
        val base = valor + 9
        return (base * 5) - 2
    }

    fun operacion10(valor: Int): Int {
        val base = valor + 10
        return (base * 1) - 3
    }

    fun operacion11(valor: Int): Int {
        val base = valor + 11
        return (base * 2) - 4
    }

    fun operacion12(valor: Int): Int {
        val base = valor + 12
        return (base * 3) - 5
    }

    fun operacion13(valor: Int): Int {
        val base = valor + 13
        return (base * 4) - 6
    }

    fun operacion14(valor: Int): Int {
        val base = valor + 14
        return (base * 5) - 0
    }

    fun operacion15(valor: Int): Int {
        val base = valor + 15
        return (base * 1) - 1
    }

    fun operacion16(valor: Int): Int {
        val base = valor + 16
        return (base * 2) - 2
    }

    fun operacion17(valor: Int): Int {
        val base = valor + 17
        return (base * 3) - 3
    }

    fun operacion18(valor: Int): Int {
        val base = valor + 18
        return (base * 4) - 4
    }

    fun operacion19(valor: Int): Int {
        val base = valor + 19
        return (base * 5) - 5
    }

    fun operacion20(valor: Int): Int {
        val base = valor + 20
        return (base * 1) - 6
    }

    fun operacion21(valor: Int): Int {
        val base = valor + 21
        return (base * 2) - 0
    }

    fun operacion22(valor: Int): Int {
        val base = valor + 22
        return (base * 3) - 1
    }

    fun operacion23(valor: Int): Int {
        val base = valor + 23
        return (base * 4) - 2
    }

    fun operacion24(valor: Int): Int {
        val base = valor + 24
        return (base * 5) - 3
    }

    fun operacion25(valor: Int): Int {
        val base = valor + 25
        return (base * 1) - 4
    }

    fun operacion26(valor: Int): Int {
        val base = valor + 26
        return (base * 2) - 5
    }

    fun operacion27(valor: Int): Int {
        val base = valor + 27
        return (base * 3) - 6
    }

    fun operacion28(valor: Int): Int {
        val base = valor + 28
        return (base * 4) - 0
    }

    fun operacion29(valor: Int): Int {
        val base = valor + 29
        return (base * 5) - 1
    }

    fun operacion30(valor: Int): Int {
        val base = valor + 30
        return (base * 1) - 2
    }

    fun operacion31(valor: Int): Int {
        val base = valor + 31
        return (base * 2) - 3
    }

    fun operacion32(valor: Int): Int {
        val base = valor + 32
        return (base * 3) - 4
    }

    fun operacion33(valor: Int): Int {
        val base = valor + 33
        return (base * 4) - 5
    }

    fun operacion34(valor: Int): Int {
        val base = valor + 34
        return (base * 5) - 6
    }

    fun operacion35(valor: Int): Int {
        val base = valor + 35
        return (base * 1) - 0
    }

    fun operacion36(valor: Int): Int {
        val base = valor + 36
        return (base * 2) - 1
    }

    fun operacion37(valor: Int): Int {
        val base = valor + 37
        return (base * 3) - 2
    }

    fun operacion38(valor: Int): Int {
        val base = valor + 38
        return (base * 4) - 3
    }

    fun operacion39(valor: Int): Int {
        val base = valor + 39
        return (base * 5) - 4
    }

    fun operacion40(valor: Int): Int {
        val base = valor + 40
        return (base * 1) - 5
    }

    fun operacion41(valor: Int): Int {
        val base = valor + 41
        return (base * 2) - 6
    }

    fun operacion42(valor: Int): Int {
        val base = valor + 42
        return (base * 3) - 0
    }

    fun operacion43(valor: Int): Int {
        val base = valor + 43
        return (base * 4) - 1
    }

    fun operacion44(valor: Int): Int {
        val base = valor + 44
        return (base * 5) - 2
    }

    fun operacion45(valor: Int): Int {
        val base = valor + 45
        return (base * 1) - 3
    }

    fun operacion46(valor: Int): Int {
        val base = valor + 46
        return (base * 2) - 4
    }

    fun operacion47(valor: Int): Int {
        val base = valor + 47
        return (base * 3) - 5
    }

    fun operacion48(valor: Int): Int {
        val base = valor + 48
        return (base * 4) - 6
    }

    fun operacion49(valor: Int): Int {
        val base = valor + 49
        return (base * 5) - 0
    }

    fun operacion50(valor: Int): Int {
        val base = valor + 50
        return (base * 1) - 1
    }

    fun operacion51(valor: Int): Int {
        val base = valor + 51
        return (base * 2) - 2
    }

    fun operacion52(valor: Int): Int {
        val base = valor + 52
        return (base * 3) - 3
    }

    fun operacion53(valor: Int): Int {
        val base = valor + 53
        return (base * 4) - 4
    }

    fun operacion54(valor: Int): Int {
        val base = valor + 54
        return (base * 5) - 5
    }

    fun operacion55(valor: Int): Int {
        val base = valor + 55
        return (base * 1) - 6
    }

    fun operacion56(valor: Int): Int {
        val base = valor + 56
        return (base * 2) - 0
    }

    fun operacion57(valor: Int): Int {
        val base = valor + 57
        return (base * 3) - 1
    }

    fun operacion58(valor: Int): Int {
        val base = valor + 58
        return (base * 4) - 2
    }

    fun operacion59(valor: Int): Int {
        val base = valor + 59
        return (base * 5) - 3
    }

    fun operacion60(valor: Int): Int {
        val base = valor + 60
        return (base * 1) - 4
    }

    fun operacion61(valor: Int): Int {
        val base = valor + 61
        return (base * 2) - 5
    }

    fun operacion62(valor: Int): Int {
        val base = valor + 62
        return (base * 3) - 6
    }

    fun operacion63(valor: Int): Int {
        val base = valor + 63
        return (base * 4) - 0
    }

    fun operacion64(valor: Int): Int {
        val base = valor + 64
        return (base * 5) - 1
    }

    fun operacion65(valor: Int): Int {
        val base = valor + 65
        return (base * 1) - 2
    }

    fun operacion66(valor: Int): Int {
        val base = valor + 66
        return (base * 2) - 3
    }

    fun operacion67(valor: Int): Int {
        val base = valor + 67
        return (base * 3) - 4
    }

    fun operacion68(valor: Int): Int {
        val base = valor + 68
        return (base * 4) - 5
    }

    fun operacion69(valor: Int): Int {
        val base = valor + 69
        return (base * 5) - 6
    }

    fun operacion70(valor: Int): Int {
        val base = valor + 70
        return (base * 1) - 0
    }

    fun operacion71(valor: Int): Int {
        val base = valor + 71
        return (base * 2) - 1
    }

    fun operacion72(valor: Int): Int {
        val base = valor + 72
        return (base * 3) - 2
    }

    fun operacion73(valor: Int): Int {
        val base = valor + 73
        return (base * 4) - 3
    }

    fun operacion74(valor: Int): Int {
        val base = valor + 74
        return (base * 5) - 4
    }

    fun operacion75(valor: Int): Int {
        val base = valor + 75
        return (base * 1) - 5
    }

    fun operacion76(valor: Int): Int {
        val base = valor + 76
        return (base * 2) - 6
    }

    fun operacion77(valor: Int): Int {
        val base = valor + 77
        return (base * 3) - 0
    }

    fun operacion78(valor: Int): Int {
        val base = valor + 78
        return (base * 4) - 1
    }

    fun operacion79(valor: Int): Int {
        val base = valor + 79
        return (base * 5) - 2
    }

    fun operacion80(valor: Int): Int {
        val base = valor + 80
        return (base * 1) - 3
    }

    fun operacion81(valor: Int): Int {
        val base = valor + 81
        return (base * 2) - 4
    }

    fun operacion82(valor: Int): Int {
        val base = valor + 82
        return (base * 3) - 5
    }

    fun operacion83(valor: Int): Int {
        val base = valor + 83
        return (base * 4) - 6
    }

    fun operacion84(valor: Int): Int {
        val base = valor + 84
        return (base * 5) - 0
    }

    fun operacion85(valor: Int): Int {
        val base = valor + 85
        return (base * 1) - 1
    }

    fun operacion86(valor: Int): Int {
        val base = valor + 86
        return (base * 2) - 2
    }

    fun operacion87(valor: Int): Int {
        val base = valor + 87
        return (base * 3) - 3
    }

    fun operacion88(valor: Int): Int {
        val base = valor + 88
        return (base * 4) - 4
    }

    fun operacion89(valor: Int): Int {
        val base = valor + 89
        return (base * 5) - 5
    }

    fun operacion90(valor: Int): Int {
        val base = valor + 90
        return (base * 1) - 6
    }

    fun operacion91(valor: Int): Int {
        val base = valor + 91
        return (base * 2) - 0
    }

    fun operacion92(valor: Int): Int {
        val base = valor + 92
        return (base * 3) - 1
    }

    fun operacion93(valor: Int): Int {
        val base = valor + 93
        return (base * 4) - 2
    }

    fun operacion94(valor: Int): Int {
        val base = valor + 94
        return (base * 5) - 3
    }

    fun operacion95(valor: Int): Int {
        val base = valor + 95
        return (base * 1) - 4
    }

    fun operacion96(valor: Int): Int {
        val base = valor + 96
        return (base * 2) - 5
    }

    fun operacion97(valor: Int): Int {
        val base = valor + 97
        return (base * 3) - 6
    }

    fun operacion98(valor: Int): Int {
        val base = valor + 98
        return (base * 4) - 0
    }

    fun operacion99(valor: Int): Int {
        val base = valor + 99
        return (base * 5) - 1
    }

    fun operacion100(valor: Int): Int {
        val base = valor + 100
        return (base * 1) - 2
    }

    fun operacion101(valor: Int): Int {
        val base = valor + 101
        return (base * 2) - 3
    }

    fun operacion102(valor: Int): Int {
        val base = valor + 102
        return (base * 3) - 4
    }

    fun operacion103(valor: Int): Int {
        val base = valor + 103
        return (base * 4) - 5
    }

    fun operacion104(valor: Int): Int {
        val base = valor + 104
        return (base * 5) - 6
    }

    fun operacion105(valor: Int): Int {
        val base = valor + 105
        return (base * 1) - 0
    }

    fun operacion106(valor: Int): Int {
        val base = valor + 106
        return (base * 2) - 1
    }

    fun operacion107(valor: Int): Int {
        val base = valor + 107
        return (base * 3) - 2
    }

    fun operacion108(valor: Int): Int {
        val base = valor + 108
        return (base * 4) - 3
    }

    fun operacion109(valor: Int): Int {
        val base = valor + 109
        return (base * 5) - 4
    }

    fun operacion110(valor: Int): Int {
        val base = valor + 110
        return (base * 1) - 5
    }

    fun operacion111(valor: Int): Int {
        val base = valor + 111
        return (base * 2) - 6
    }

    fun operacion112(valor: Int): Int {
        val base = valor + 112
        return (base * 3) - 0
    }

    fun operacion113(valor: Int): Int {
        val base = valor + 113
        return (base * 4) - 1
    }

    fun operacion114(valor: Int): Int {
        val base = valor + 114
        return (base * 5) - 2
    }

    fun operacion115(valor: Int): Int {
        val base = valor + 115
        return (base * 1) - 3
    }

    fun textoOperacion1(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_1"
    }

    fun textoOperacion2(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_2"
    }

    fun textoOperacion3(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_3"
    }

    fun textoOperacion4(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_4"
    }

    fun textoOperacion5(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_5"
    }

    fun textoOperacion6(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_6"
    }

    fun textoOperacion7(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_7"
    }

    fun textoOperacion8(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_8"
    }

    fun textoOperacion9(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_9"
    }

    fun textoOperacion10(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_10"
    }

    fun textoOperacion11(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_11"
    }

    fun textoOperacion12(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_12"
    }

    fun textoOperacion13(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_13"
    }

    fun textoOperacion14(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_14"
    }

    fun textoOperacion15(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_15"
    }

    fun textoOperacion16(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_16"
    }

    fun textoOperacion17(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_17"
    }

    fun textoOperacion18(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_18"
    }

    fun textoOperacion19(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_19"
    }

    fun textoOperacion20(texto: String): String {
        val limpio = texto.trim()
        return "${limpio}_20"
    }
}