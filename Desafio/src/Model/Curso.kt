package Model

class Curso(var nomeCurso:String, var codigoCurso:Int, var qtdMaximaAlunos:Int) {
    var professorAdjunto :ProfessorAdjunto? = null
    var professorTitular :ProfessorTitular? = null

    var alunos = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunos.size >= qtdMaximaAlunos) {
            return false
        }
        alunos.add(umAluno)
        println("Aluno adicionado no curso")
        return true
    }

    fun excluirAluno(umAluno: Aluno){

        alunos.remove(umAluno)

    }

    override fun toString(): String {
        return "Curso(nomeCurso='$nomeCurso', codigoCurso=$codigoCurso, qtdMaximaAlunos=$qtdMaximaAlunos, alunos=$alunos)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (nomeCurso != other.nomeCurso) return false
        if (codigoCurso != other.codigoCurso) return false
        if (qtdMaximaAlunos != other.qtdMaximaAlunos) return false
        if (alunos != other.alunos) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nomeCurso.hashCode()
        result = 31 * result + codigoCurso
        result = 31 * result + qtdMaximaAlunos
        result = 31 * result + alunos.hashCode()
        return result
    }


}