package com.ares.safety.NEW


data class NodoSimple(val id: Int = 0, val nombre: String = "")
data class IntervaloSimple(val minimo: Double = 0.0, val maximo: Double = 0.0)
data class RegistroNumerico(val clave: String = "", val valor: Int = 0)
data class ParTexto(val izquierdo: String = "", val derecho: String = "")
data class ResultadoBasico(
    val valido: Boolean,
    val mensaje: String,
    val codigo: Int
)

sealed class EstadoInterno {
    data class Activo(val descripcion: String) : EstadoInterno()
    data class Inactivo(val razon: String) : EstadoInterno()
}

object ArchivoNeutralKotlin {

    const val TITULO: String = "ArchivoNeutralKotlin"
    const val EDICION: Int = 1
    const val ACTIVO: Boolean = true

    fun crearNodo(id: Int, nombre: String): NodoSimple {
        return NodoSimple(id, nombre.trim())
    }

    fun crearIntervalo(minimo: Double, maximo: Double): IntervaloSimple {
        return IntervaloSimple(minimo, maximo)
    }

    fun crearRegistro(clave: String, valor: Int): RegistroNumerico {
        return RegistroNumerico(clave.trim(), valor)
    }

    fun crearParTexto(izquierdo: String, derecho: String): ParTexto {
        return ParTexto(izquierdo.trim(), derecho.trim())
    }

    fun resultadoOk(mensaje: String): ResultadoBasico {
        return ResultadoBasico(true, mensaje, 0)
    }

    fun resultadoError(mensaje: String, codigo: Int): ResultadoBasico {
        return ResultadoBasico(false, mensaje, codigo)
    }

    fun estadoActivo(descripcion: String): EstadoInterno {
        return EstadoInterno.Activo(descripcion)
    }

    fun estadoInactivo(razon: String): EstadoInterno {
        return EstadoInterno.Inactivo(razon)
    }

    fun sumar(a: Int, b: Int): Int = a + b

    fun restar(a: Int, b: Int): Int = a - b

    fun multiplicar(a: Int, b: Int): Int = a * b

    fun dividir(a: Double, b: Double): Double {
        return if (b == 0.0) 0.0 else a / b
    }

    fun potencia2(valor: Int): Int = valor * valor

    fun potencia3(valor: Int): Int = valor * valor * valor

    fun esPositivo(valor: Int): Boolean = valor > 0

    fun esNegativo(valor: Int): Boolean = valor < 0

    fun esCero(valor: Int): Boolean = valor == 0

    fun absoluto(valor: Int): Int = if (valor < 0) -valor else valor

    fun maximo(a: Int, b: Int): Int = if (a > b) a else b

    fun minimo(a: Int, b: Int): Int = if (a < b) a else b

    fun promedio(a: Double, b: Double): Double = (a + b) / 2.0

    fun porcentaje(parte: Double, total: Double): Double {
        return if (total == 0.0) 0.0 else (parte / total) * 100.0
    }

    fun redondearEntero(valor: Double): Int = kotlin.math.round(valor).toInt()

    fun truncarEntero(valor: Double): Int = valor.toInt()

    fun longitud(texto: String): Int = texto.length

    fun estaVacio(texto: String): Boolean = texto.isBlank()

    fun limpiar(texto: String): String = texto.trim()

    fun aMayusculas(texto: String): String = texto.uppercase()

    fun aMinusculas(texto: String): String = texto.lowercase()

    fun invertir(texto: String): String = texto.reversed()

    fun contiene(texto: String, patron: String): Boolean = texto.contains(patron)

    fun reemplazar(texto: String, viejo: String, nuevo: String): String {
        return texto.replace(viejo, nuevo)
    }

    fun primerCaracter(texto: String): Char = texto.firstOrNull() ?: '\u0000'

    fun ultimoCaracter(texto: String): Char = texto.lastOrNull() ?: '\u0000'

    fun subTextoSeguro(texto: String, inicio: Int, fin: Int): String {
        if (texto.isEmpty()) return ""
        val inicioSeguro = inicio.coerceAtLeast(0).coerceAtMost(texto.length)
        val finSeguro = fin.coerceAtLeast(inicioSeguro).coerceAtMost(texto.length)
        return texto.substring(inicioSeguro, finSeguro)
    }

    fun unir(a: String, b: String): String = a + b

    fun unirConEspacio(a: String, b: String): String = "$a $b"

    fun unirConGuion(a: String, b: String): String = "$a-$b"

    fun repetir(texto: String, veces: Int): String {
        return texto.repeat(veces.coerceAtLeast(0))
    }

    fun contarVocales(texto: String): Int {
        return texto.count { it.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u') }
    }

    fun contarConsonantes(texto: String): Int {
        return texto.count {
            val c = it.lowercaseChar()
            c in 'a'..'z' && c !in listOf('a', 'e', 'i', 'o', 'u')
        }
    }

    fun separarPorEspacios(texto: String): List<String> {
        return texto.trim().split(" ").filter { it.isNotBlank() }
    }

    fun contarPalabras(texto: String): Int = separarPorEspacios(texto).size

    fun iniciales(texto: String): String {
        return separarPorEspacios(texto)
            .mapNotNull { it.firstOrNull()?.uppercaseChar() }
            .joinToString("")
    }

    fun sumaLista(lista: List<Int>): Int = lista.sum()

    fun promedioLista(lista: List<Int>): Double = if (lista.isEmpty()) 0.0 else lista.average()

    fun minimoLista(lista: List<Int>): Int = lista.minOrNull() ?: 0

    fun maximoLista(lista: List<Int>): Int = lista.maxOrNull() ?: 0

    fun ordenarAsc(lista: List<Int>): List<Int> = lista.sorted()

    fun ordenarDesc(lista: List<Int>): List<Int> = lista.sortedDescending()

    fun invertirLista(lista: List<Int>): List<Int> = lista.reversed()

    fun pares(lista: List<Int>): List<Int> = lista.filter { it % 2 == 0 }

    fun impares(lista: List<Int>): List<Int> = lista.filter { it % 2 != 0 }

    fun positivos(lista: List<Int>): List<Int> = lista.filter { it > 0 }

    fun negativos(lista: List<Int>): List<Int> = lista.filter { it < 0 }

    fun duplicarLista(lista: List<Int>): List<Int> = lista.map { it * 2 }

    fun triplicarLista(lista: List<Int>): List<Int> = lista.map { it * 3 }

    fun cuadrados(lista: List<Int>): List<Int> = lista.map { it * it }

    fun cubos(lista: List<Int>): List<Int> = lista.map { it * it * it }

    fun eliminarDuplicados(lista: List<Int>): List<Int> = lista.distinct()

    fun existe(lista: List<Int>, valor: Int): Boolean = valor in lista

    fun indiceDe(lista: List<Int>, valor: Int): Int = lista.indexOf(valor)

    fun concatenarListas(a: List<Int>, b: List<Int>): List<Int> = a + b

    fun recortarLista(lista: List<Int>, cantidad: Int): List<Int> = lista.take(cantidad.coerceAtLeast(0))

    fun ultimos(lista: List<Int>, cantidad: Int): List<Int> = lista.takeLast(cantidad.coerceAtLeast(0))

    fun convertirATexto(lista: List<Int>): List<String> = lista.map { it.toString() }

    fun convertirAEnteros(lista: List<String>): List<Int> = lista.map { it.toIntOrNull() ?: 0 }

    fun generarSecuencia(inicio: Int, cantidad: Int): List<Int> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { inicio + it }
    }

    fun generarRango(inicio: Int, fin: Int): List<Int> {
        if (inicio > fin) return emptyList()
        return (inicio..fin).toList()
    }

    fun factorial(n: Int): Long {
        if (n <= 1) return 1L
        var resultado = 1L
        for (i in 2..n) {
            resultado *= i.toLong()
        }
        return resultado
    }

    fun fibonacci(n: Int): Int {
        if (n <= 0) return 0
        if (n == 1) return 1
        var a = 0
        var b = 1
        for (i in 2..n) {
            val siguiente = a + b
            a = b
            b = siguiente
        }
        return b
    }

    fun serieFibonacci(cantidad: Int): List<Int> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { fibonacci(it) }
    }

    fun esPrimo(n: Int): Boolean {
        if (n < 2) return false
        if (n == 2) return true
        if (n % 2 == 0) return false
        var d = 3
        while (d * d <= n) {
            if (n % d == 0) return false
            d += 2
        }
        return true
    }

    fun primosHasta(limite: Int): List<Int> {
        if (limite < 2) return emptyList()
        val salida = mutableListOf<Int>()
        for (i in 2..limite) {
            if (esPrimo(i)) salida.add(i)
        }
        return salida
    }

    fun tablaMultiplicar(numero: Int, hasta: Int): List<String> {
        if (hasta <= 0) return emptyList()
        return List(hasta) { indice ->
            val i = indice + 1
            "$numero x $i = ${numero * i}"
        }
    }

    fun sumaAcumulada(lista: List<Int>): List<Int> {
        val resultado = mutableListOf<Int>()
        var acumulado = 0
        for (elemento in lista) {
            acumulado += elemento
            resultado.add(acumulado)
        }
        return resultado
    }

    fun frecuencia(lista: List<Int>): Map<Int, Int> {
        val mapa = linkedMapOf<Int, Int>()
        for (valor in lista) {
            mapa[valor] = (mapa[valor] ?: 0) + 1
        }
        return mapa
    }

    fun moda(lista: List<Int>): Int {
        if (lista.isEmpty()) return 0
        return frecuencia(lista).maxByOrNull { it.value }?.key ?: 0
    }

    fun mediana(lista: List<Int>): Double {
        if (lista.isEmpty()) return 0.0
        val ordenada = lista.sorted()
        val mitad = ordenada.size / 2
        return if (ordenada.size % 2 == 0) {
            (ordenada[mitad - 1] + ordenada[mitad]) / 2.0
        } else {
            ordenada[mitad].toDouble()
        }
    }

    fun rango(lista: List<Int>): Int {
        if (lista.isEmpty()) return 0
        return (lista.maxOrNull() ?: 0) - (lista.minOrNull() ?: 0)
    }

    fun crearMatriz2x2(a: Int, b: Int, c: Int, d: Int): List<List<Int>> {
        return listOf(
            listOf(a, b),
            listOf(c, d)
        )
    }

    fun matrizCeros2x2(): List<List<Int>> {
        return crearMatriz2x2(0, 0, 0, 0)
    }

    fun matrizIdentidad2x2(): List<List<Int>> {
        return crearMatriz2x2(1, 0, 0, 1)
    }

    fun sumarMatrices2x2(m1: List<List<Int>>, m2: List<List<Int>>): List<List<Int>> {
        if (m1.size < 2 || m2.size < 2) return matrizCeros2x2()
        return crearMatriz2x2(
            m1[0][0] + m2[0][0],
            m1[0][1] + m2[0][1],
            m1[1][0] + m2[1][0],
            m1[1][1] + m2[1][1]
        )
    }

    fun transponer2x2(m: List<List<Int>>): List<List<Int>> {
        if (m.size < 2) return matrizCeros2x2()
        return crearMatriz2x2(
            m[0][0],
            m[1][0],
            m[0][1],
            m[1][1]
        )
    }

    fun traza2x2(m: List<List<Int>>): Int {
        if (m.size < 2) return 0
        return m[0][0] + m[1][1]
    }

    fun areaRectangulo(base: Double, altura: Double): Double = base * altura

    fun perimetroRectangulo(base: Double, altura: Double): Double = 2.0 * (base + altura)

    fun areaTriangulo(base: Double, altura: Double): Double = (base * altura) / 2.0

    fun areaCirculo(radio: Double): Double = kotlin.math.PI * radio * radio

    fun perimetroCirculo(radio: Double): Double = 2.0 * kotlin.math.PI * radio

    fun hipotenusa(a: Double, b: Double): Double = kotlin.math.sqrt(a * a + b * b)

    fun distancia(x1: Double, y1: Double, x2: Double, y2: Double): Double {
        val dx = x2 - x1
        val dy = y2 - y1
        return kotlin.math.sqrt(dx * dx + dy * dy)
    }

    fun dentroDeIntervalo(valor: Double, intervalo: IntervaloSimple): Boolean {
        return valor >= intervalo.minimo && valor <= intervalo.maximo
    }

    fun anchoIntervalo(intervalo: IntervaloSimple): Double {
        return intervalo.maximo - intervalo.minimo
    }

    fun centroIntervalo(intervalo: IntervaloSimple): Double {
        return (intervalo.minimo + intervalo.maximo) / 2.0
    }

    fun normalizar(valor: Double, minimo: Double, maximo: Double): Double {
        if (maximo == minimo) return 0.0
        return (valor - minimo) / (maximo - minimo)
    }

    fun limitar(valor: Double, minimo: Double, maximo: Double): Double {
        if (valor < minimo) return minimo
        if (valor > maximo) return maximo
        return valor
    }

    fun textoAlternado(texto: String): String {
        return texto.mapIndexed { index, c ->
            if (index % 2 == 0) c.uppercaseChar() else c.lowercaseChar()
        }.joinToString("")
    }

    fun espejo(texto: String): String {
        return texto + texto.reversed()
    }

    fun rodear(texto: String, simbolo: String): String {
        return "$simbolo$texto$simbolo"
    }

    fun repetirConComa(texto: String, veces: Int): String {
        if (veces <= 0) return ""
        return List(veces) { texto }.joinToString(",")
    }

    fun combinarPares(listaA: List<String>, listaB: List<String>): List<ParTexto> {
        val tam = minOf(listaA.size, listaB.size)
        val salida = mutableListOf<ParTexto>()
        for (i in 0 until tam) {
            salida.add(ParTexto(listaA[i], listaB[i]))
        }
        return salida
    }

    fun clavesRegistros(registros: List<RegistroNumerico>): List<String> {
        return registros.map { it.clave }
    }

    fun valoresRegistros(registros: List<RegistroNumerico>): List<Int> {
        return registros.map { it.valor }
    }

    fun sumaRegistros(registros: List<RegistroNumerico>): Int {
        return registros.sumOf { it.valor }
    }

    fun promedioRegistros(registros: List<RegistroNumerico>): Double {
        if (registros.isEmpty()) return 0.0
        return registros.map { it.valor }.average()
    }

    fun filtrarRegistrosMayores(registros: List<RegistroNumerico>, umbral: Int): List<RegistroNumerico> {
        return registros.filter { it.valor > umbral }
    }

    fun buscarRegistroPorClave(registros: List<RegistroNumerico>, clave: String): RegistroNumerico? {
        return registros.firstOrNull { it.clave == clave }
    }

    fun operacion01(n: Int): Int = (n + 1) * 2
    fun operacion02(n: Int): Int = (n + 2) * 3
    fun operacion03(n: Int): Int = (n + 3) * 4
    fun operacion04(n: Int): Int = (n + 4) * 5
    fun operacion05(n: Int): Int = (n + 5) * 6
    fun operacion06(n: Int): Int = n - 1
    fun operacion07(n: Int): Int = n - 2
    fun operacion08(n: Int): Int = n - 3
    fun operacion09(n: Int): Int = n - 4
    fun operacion10(n: Int): Int = n - 5
    fun operacion11(n: Int): Int = n / 2
    fun operacion12(n: Int): Int = n / 3
    fun operacion13(n: Int): Int = n % 2
    fun operacion14(n: Int): Int = n % 3
    fun operacion15(n: Int): Int = n * 10
    fun operacion16(n: Int): Int = n * 20
    fun operacion17(n: Int): Int = n * 30
    fun operacion18(n: Int): Int = n + 100
    fun operacion19(n: Int): Int = n + 200
    fun operacion20(n: Int): Int = n + 300

    fun texto01(t: String): String = "A$t"
    fun texto02(t: String): String = "B$t"
    fun texto03(t: String): String = "C$t"
    fun texto04(t: String): String = "D$t"
    fun texto05(t: String): String = "E$t"
    fun texto06(t: String): String = "$t-A"
    fun texto07(t: String): String = "$t-B"
    fun texto08(t: String): String = "$t-C"
    fun texto09(t: String): String = "$t-D"
    fun texto10(t: String): String = "$t-E"
    fun texto11(t: String): String = t.lowercase()
    fun texto12(t: String): String = t.uppercase()
    fun texto13(t: String): String = t.reversed()
    fun texto14(t: String): String = t.trim()
    fun texto15(t: String): String = t.replace(" ", "_")
    fun texto16(t: String): String = t.replace(" ", "-")
    fun texto17(t: String): String = "[$t]"
    fun texto18(t: String): String = "($t)"
    fun texto19(t: String): String = "{$t}"
    fun texto20(t: String): String = "<$t>"
}