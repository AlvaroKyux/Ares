package com.ares.safety.NEW








    const val ETIQUETA = "ModuloAuxiliarPasivo"
    const val REVISION = 1

    fun sumar(a: Int, b: Int): Int = a + b

    fun restar(a: Int, b: Int): Int = a - b

    fun multiplicar(a: Int, b: Int): Int = a * b

    fun dividirSeguro(a: Double, b: Double): Double = if (b == 0.0) 0.0 else a / b

    fun modulo(a: Int, b: Int): Int = if (b == 0) 0 else a % b

    fun mayor(a: Int, b: Int): Int = if (a >= b) a else b

    fun menor(a: Int, b: Int): Int = if (a <= b) a else b

    fun absoluto(n: Int): Int = if (n < 0) -n else n

    fun limitar(valor: Int, minimo: Int, maximo: Int): Int {
        if (valor < minimo) return minimo
        if (valor > maximo) return maximo
        return valor
    }

    fun estaEnRango(valor: Int, rango: RangoNumerico): Boolean {
        return valor in rango.inicio..rango.fin
    }

    fun crearRango(inicio: Int, fin: Int): RangoNumerico {
        return RangoNumerico(inicio, fin)
    }

    fun concatenar(a: String, b: String): String = a + b

    fun concatenarConEspacio(a: String, b: String): String = "$a $b"

    fun enMayusculas(texto: String): String = texto.uppercase()

    fun enMinusculas(texto: String): String = texto.lowercase()

    fun quitarEspaciosLaterales(texto: String): String = texto.trim()

    fun reemplazarEspaciosPorGuion(texto: String): String = texto.trim().replace(" ", "-")

    fun contarCaracteres(texto: String): Int = texto.length

    fun contieneTexto(texto: String, fragmento: String): Boolean = texto.contains(fragmento)

    fun empiezaCon(texto: String, prefijo: String): Boolean = texto.startsWith(prefijo)

    fun terminaCon(texto: String, sufijo: String): Boolean = texto.endsWith(sufijo)

    fun repetir(texto: String, veces: Int): String = texto.repeat(veces.coerceAtLeast(0))

    fun invertir(texto: String): String = texto.reversed()

    fun obtenerPrimero(texto: String): Char = texto.firstOrNull() ?: '\u0000'

    fun obtenerUltimo(texto: String): Char = texto.lastOrNull() ?: '\u0000'

    fun estaVacio(texto: String): Boolean = texto.isBlank()

    fun palabras(texto: String): List<String> {
        return texto.trim().split(" ").filter { it.isNotBlank() }
    }

    fun contarPalabras(texto: String): Int {
        return palabras(texto).size
    }

    fun iniciales(nombreCompleto: String): String {
        return palabras(nombreCompleto)
            .mapNotNull { it.firstOrNull()?.uppercaseChar() }
            .joinToString("")
    }

    fun listaVaciaSiNull(lista: List<Int>?): List<Int> = lista ?: emptyList()

    fun sumaLista(lista: List<Int>): Int = lista.sum()

    fun promedioLista(lista: List<Int>): Double = if (lista.isEmpty()) 0.0 else lista.average()

    fun minimoLista(lista: List<Int>): Int = lista.minOrNull() ?: 0

    fun maximoLista(lista: List<Int>): Int = lista.maxOrNull() ?: 0

    fun estadistica(lista: List<Int>): EstadisticaSimple {
        return EstadisticaSimple(
            total = sumaLista(lista),
            cantidad = lista.size,
            promedio = promedioLista(lista)
        )
    }

    fun ordenarAscendente(lista: List<Int>): List<Int> = lista.sorted()

    fun ordenarDescendente(lista: List<Int>): List<Int> = lista.sortedDescending()

    fun quitarDuplicados(lista: List<Int>): List<Int> = lista.distinct()

    fun pares(lista: List<Int>): List<Int> = lista.filter { it % 2 == 0 }

    fun impares(lista: List<Int>): List<Int> = lista.filter { it % 2 != 0 }

    fun positivos(lista: List<Int>): List<Int> = lista.filter { it > 0 }

    fun negativos(lista: List<Int>): List<Int> = lista.filter { it < 0 }

    fun elevarCuadrado(lista: List<Int>): List<Int> = lista.map { it * it }

    fun elevarCubo(lista: List<Int>): List<Int> = lista.map { it * it * it }

    fun multiplicarLista(lista: List<Int>, factor: Int): List<Int> = lista.map { it * factor }

    fun desplazarLista(lista: List<Int>, incremento: Int): List<Int> = lista.map { it + incremento }

    fun invertirLista(lista: List<Int>): List<Int> = lista.reversed()

    fun tomarPrimeros(lista: List<Int>, cantidad: Int): List<Int> = lista.take(cantidad.coerceAtLeast(0))

    fun tomarUltimos(lista: List<Int>, cantidad: Int): List<Int> = lista.takeLast(cantidad.coerceAtLeast(0))

    fun existeElemento(lista: List<Int>, valor: Int): Boolean = valor in lista

    fun posicionDe(lista: List<Int>, valor: Int): Int = lista.indexOf(valor)

    fun concatenarListas(a: List<Int>, b: List<Int>): List<Int> = a + b

    fun generarSecuencia(inicio: Int, cantidad: Int): List<Int> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { inicio + it }
    }

    fun generarSecuenciaPar(inicio: Int, cantidad: Int): List<Int> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { inicio + (it * 2) }
    }

    fun generarSecuenciaImpar(inicio: Int, cantidad: Int): List<Int> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { inicio + (it * 2) + 1 }
    }

    fun sumarMatrices2x2(a: List<List<Int>>, b: List<List<Int>>): List<List<Int>> {
        if (a.size < 2 || b.size < 2) return listOf(listOf(0, 0), listOf(0, 0))
        return listOf(
            listOf(a[0][0] + b[0][0], a[0][1] + b[0][1]),
            listOf(a[1][0] + b[1][0], a[1][1] + b[1][1])
        )
    }

    fun identidad2x2(): List<List<Int>> {
        return listOf(
            listOf(1, 0),
            listOf(0, 1)
        )
    }

    fun matrizCeros2x2(): List<List<Int>> {
        return listOf(
            listOf(0, 0),
            listOf(0, 0)
        )
    }

    fun transponer2x2(matriz: List<List<Int>>): List<List<Int>> {
        if (matriz.size < 2) return matrizCeros2x2()
        return listOf(
            listOf(matriz[0][0], matriz[1][0]),
            listOf(matriz[0][1], matriz[1][1])
        )
    }

    fun crearCoordenada(fila: Int, columna: Int): Coordenada {
        return Coordenada(fila, columna)
    }

    fun moverArriba(coordenada: Coordenada): Coordenada {
        return Coordenada(coordenada.fila - 1, coordenada.columna)
    }

    fun moverAbajo(coordenada: Coordenada): Coordenada {
        return Coordenada(coordenada.fila + 1, coordenada.columna)
    }

    fun moverIzquierda(coordenada: Coordenada): Coordenada {
        return Coordenada(coordenada.fila, coordenada.columna - 1)
    }

    fun moverDerecha(coordenada: Coordenada): Coordenada {
        return Coordenada(coordenada.fila, coordenada.columna + 1)
    }

    fun distanciaManhattan(a: Coordenada, b: Coordenada): Int {
        return absoluto(a.fila - b.fila) + absoluto(a.columna - b.columna)
    }

    fun coordenadaEsValida(coordenada: Coordenada, filas: Int, columnas: Int): Boolean {
        return coordenada.fila in 0 until filas && coordenada.columna in 0 until columnas
    }

    fun crearPersona(nombre: String, edad: Int): PersonaBasica {
        return PersonaBasica(nombre.trim(), edad)
    }

    fun nombreSeguro(persona: PersonaBasica?): String = persona?.nombre ?: ""

    fun edadSegura(persona: PersonaBasica?): Int = persona?.edad ?: 0

    fun personaEsMayor(persona: PersonaBasica): Boolean = persona.edad >= 18

    fun crearProducto(clave: String, precio: Double): ProductoBasico {
        return ProductoBasico(clave.trim(), precio)
    }

    fun precioConImpuesto(producto: ProductoBasico, tasa: Double): Double {
        return producto.precio + (producto.precio * tasa)
    }

    fun descuento(producto: ProductoBasico, porcentaje: Double): Double {
        return producto.precio - (producto.precio * porcentaje)
    }

    fun productosCaros(productos: List<ProductoBasico>, minimo: Double): List<ProductoBasico> {
        return productos.filter { it.precio >= minimo }
    }

    fun sumarPrecios(productos: List<ProductoBasico>): Double {
        return productos.sumOf { it.precio }
    }

    fun promedioPrecios(productos: List<ProductoBasico>): Double {
        return if (productos.isEmpty()) 0.0 else productos.map { it.precio }.average()
    }

    fun clavesProductos(productos: List<ProductoBasico>): List<String> {
        return productos.map { it.clave }
    }

    fun estadoDisponible(texto: String): EstadoPasivo {
        return EstadoPasivo.Disponible(texto)
    }

    fun estadoNoDisponible(texto: String): EstadoPasivo {
        return EstadoPasivo.NoDisponible(texto)
    }

    fun fibonacci(n: Int): Int {
        if (n <= 0) return 0
        if (n == 1) return 1
        var a = 0
        var b = 1
        var i = 2
        while (i <= n) {
            val siguiente = a + b
            a = b
            b = siguiente
            i++
        }
        return b
    }

    fun factorial(n: Int): Long {
        if (n <= 1) return 1L
        var resultado = 1L
        for (i in 2..n) {
            resultado *= i.toLong()
        }
        return resultado
    }

    fun esPrimo(n: Int): Boolean {
        if (n < 2) return false
        if (n == 2) return true
        if (n % 2 == 0) return false
        var divisor = 3
        while (divisor * divisor <= n) {
            if (n % divisor == 0) return false
            divisor += 2
        }
        return true
    }

    fun primosHasta(limite: Int): List<Int> {
        if (limite < 2) return emptyList()
        val salida = mutableListOf<Int>()
        for (n in 2..limite) {
            if (esPrimo(n)) salida.add(n)
        }
        return salida
    }

    fun contarPrimosHasta(limite: Int): Int = primosHasta(limite).size

    fun tablaMultiplicar(numero: Int, hasta: Int): List<String> {
        if (hasta <= 0) return emptyList()
        return List(hasta) { indice ->
            val valor = indice + 1
            "$numero x $valor = ${numero * valor}"
        }
    }

    fun convertirABooleano(valor: Int): Boolean = valor != 0

    fun convertirAInt(valor: Boolean): Int = if (valor) 1 else 0

    fun convertirADouble(valor: Int): Double = valor.toDouble()

    fun redondearDosDecimales(valor: Double): Double {
        return kotlin.math.round(valor * 100.0) / 100.0
    }

    fun porcentaje(valor: Double, total: Double): Double {
        if (total == 0.0) return 0.0
        return (valor / total) * 100.0
    }

    fun mediaGeometrica(a: Double, b: Double): Double {
        if (a < 0 || b < 0) return 0.0
        return kotlin.math.sqrt(a * b)
    }

    fun hipotenusa(a: Double, b: Double): Double {
        return kotlin.math.sqrt((a * a) + (b * b))
    }

    fun areaTriangulo(base: Double, altura: Double): Double {
        return (base * altura) / 2.0
    }

    fun perimetroCuadrado(lado: Double): Double = lado * 4.0

    fun areaCuadrado(lado: Double): Double = lado * lado

    fun areaCirculo(radio: Double): Double = kotlin.math.PI * radio * radio

    fun circunferencia(radio: Double): Double = 2.0 * kotlin.math.PI * radio

    fun operacionA(n: Int): Int = (n + 3) * 2
    fun operacionB(n: Int): Int = (n - 4) * 3
    fun operacionC(n: Int): Int = (n + 5) / 2
    fun operacionD(n: Int): Int = (n * n) + 7
    fun operacionE(n: Int): Int = if (n == 0) 0 else 100 / n

    fun textoA(texto: String): String = "[A]${texto.trim()}"
    fun textoB(texto: String): String = "[B]${texto.trim()}"
    fun textoC(texto: String): String = "[C]${texto.trim()}"
    fun textoD(texto: String): String = "[D]${texto.trim()}"
    fun textoE(texto: String): String = "[E]${texto.trim()}"

    fun combinarTexto1(a: String, b: String): String = "${a.trim()}_${b.trim()}"
    fun combinarTexto2(a: String, b: String): String = "${a.trim()}-${b.trim()}"
    fun combinarTexto3(a: String, b: String): String = "${a.trim()}/${b.trim()}"
    fun combinarTexto4(a: String, b: String): String = "${a.trim()}:${b.trim()}"
    fun combinarTexto5(a: String, b: String): String = "${a.trim()}|${b.trim()}"

    fun serieCuadrados(cantidad: Int): List<Int> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { indice ->
            val n = indice + 1
            n * n
        }
    }

    fun serieCubos(cantidad: Int): List<Int> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { indice ->
            val n = indice + 1
            n * n * n
        }
    }

    fun serieFactoriales(cantidad: Int): List<Long> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { indice ->
            factorial(indice + 1)
        }
    }

    fun serieFibonacci(cantidad: Int): List<Int> {
        if (cantidad <= 0) return emptyList()
        return List(cantidad) { indice ->
            fibonacci(indice)
        }
    }

    fun cadenaNumerica(inicio: Int, fin: Int): String {
        if (inicio > fin) return ""
        return (inicio..fin).joinToString(",")
    }

    fun sumaRango(inicio: Int, fin: Int): Int {
        if (inicio > fin) return 0
        var total = 0
        for (i in inicio..fin) total += i
        return total
    }

    fun promedioRango(inicio: Int, fin: Int): Double {
        if (inicio > fin) return 0.0
        val cantidad = (fin - inicio) + 1
        return sumaRango(inicio, fin).toDouble() / cantidad.toDouble()
    }

    fun alternarMayusculas(texto: String): String {
        return texto.mapIndexed { index, c ->
            if (index % 2 == 0) c.uppercaseChar() else c.lowercaseChar()
        }.joinToString("")
    }

    fun alternarSignos(lista: List<Int>): List<Int> {
        return lista.mapIndexed { index, valor ->
            if (index % 2 == 0) valor else -valor
        }
    }

    fun duplicarTextoLista(lista: List<String>): List<String> {
        return lista.map { it + it }
    }

    fun longitudes(lista: List<String>): List<Int> {
        return lista.map { it.length }
    }

    fun unirConComa(lista: List<String>): String {
        return lista.joinToString(", ")
    }

    fun unirConSalto(lista: List<String>): String {
        return lista.joinToString("\n")
    }

    fun contarCoincidencias(lista: List<String>, valor: String): Int {
        return lista.count { it == valor }
    }

    fun limpiarListaTextos(lista: List<String>): List<String> {
        return lista.map { it.trim() }.filter { it.isNotBlank() }
    }

    fun convertirEnterosATexto(lista: List<Int>): List<String> {
        return lista.map { it.toString() }
    }

    fun convertirTextosAEnteroSeguro(lista: List<String>): List<Int> {
        return lista.map { it.toIntOrNull() ?: 0 }
    }
