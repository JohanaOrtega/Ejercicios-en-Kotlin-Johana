fun main() {
    val frase = "ESTE ES UN EJEMPLO DE KOTLIN ARA SEARAR PALABRAS"
    println(diccionario(frase))

}

fun diccionario(frase: String): Map<String, Int> {
    val dic: MutableMap<String, Int> = mutableMapOf()
    val partes = listOf(*frase.split(" ".toRegex()).toTypedArray())
    for (i in partes.indices) {
        dic[partes[i]] = partes[i].length
    }
    return dic
}