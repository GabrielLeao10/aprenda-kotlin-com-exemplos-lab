// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    
    val usuario1 = Usuario()
	val usuario2 = Usuario()
    
	val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)

	val formacao = Formacao("Curso de Kotlin", listOf(conteudo1, conteudo2))
	formacao.matricular(usuario1)
	formacao.matricular(usuario2)

	println("Número de inscritos: ${formacao.inscritos.size}")
	println("Inscritos: ${formacao.inscritos}")

}
