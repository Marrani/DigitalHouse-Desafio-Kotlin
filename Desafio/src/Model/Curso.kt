package Model

class Curso(var nomeCurso:String, var codigoCurso:Int,
            var qtdMaximaAlunos:Int, var alunos:List<Aluno>) {

    fun adicionarUmAluno(umAluno: Aluno):Boolean {
        return false

    }

    fun excluirAluno(umAluno: Aluno){

    }


}