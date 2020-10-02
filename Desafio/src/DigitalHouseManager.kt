import Model.*
import java.time.LocalDateTime

class DigitalHouseManager {
    var aluno = mutableMapOf<Int, Aluno>()
    var professor = mutableMapOf<Int, Professor>()
    var curso = mutableMapOf<Int, Curso>()
    var matricula = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int,
                       quantidadeMaximaDeAlunos: Int) {

        var android = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)

        this.curso.put(codigoCurso, android)

        print("Curso cadastrado $curso")
    }

    fun excluirCurso(codigoCurso: Int) {
        //  this.curso.remove(
        print("Depois de excluir $curso")
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String,
                                  codigoProfessor: Int, quantidadeDeHoras: Int) {
        var prof = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, tempoDeCasa = 0, codigoProfessor = codigoProfessor)
        this.professor.put(codigoProfessor, prof)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String,
                                  codigoProfessor: Int, especialidade: String) {
        var profTitular = ProfessorTitular(especialidade, nome, sobrenome, tempoDeCasa = 0, codigoProfessor = codigoProfessor)
        this.professor.put(codigoProfessor, profTitular)

    }

    fun excluirProfessor(codigoProfessor: Int) {
        professor.remove(codigoProfessor)
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        var aluno = Aluno(nome, sobrenome, codigoAluno)
        this.aluno.put(codigoAluno, aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var curso: Curso? = null
        curso = this.curso.get(codigoCurso)
        var alunoMatriculado = this.aluno.get(codigoAluno)

        if (curso != null && alunoMatriculado != null) {
            if (curso!!.adicionarUmAluno(alunoMatriculado)) {

                var matricula = Matricula(alunoMatriculado!!, curso!!, LocalDateTime.now())
                this.matricula.add(matricula)
                println("Matricula realizada")
            } else {
                println("não foi possível realizar a matrícula porque\n" +
                        "não há vagas")
            }
        }


    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int,
                          codigoProfessorAdjunto: Int) {
        var profTitular = professor.get(codigoProfessorTitular)
        var profAdjunto = professor.get(codigoProfessorAdjunto)
        var curso:Curso? = curso.get(codigoCurso)
        if (profTitular != null && profAdjunto != null && curso != null) {
            curso.professorAdjunto = profAdjunto as ProfessorAdjunto?
            curso.professorTitular = profTitular as ProfessorTitular?

        }
    }
}



