package Model

class ProfessorAdjunto(var qtdHorasMonitoria: Int, nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int) :
        Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
}