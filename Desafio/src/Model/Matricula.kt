package Model

import java.time.LocalDateTime

class Matricula(var aluno: Aluno, var curso: Curso, var dataMatricula:LocalDateTime) {

    override fun toString(): String {
        return "Matricula(aluno=$aluno, curso=$curso, dataMatricula=$dataMatricula)"
    }

}