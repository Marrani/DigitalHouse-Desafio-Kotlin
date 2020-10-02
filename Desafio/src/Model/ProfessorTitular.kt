package Model

class ProfessorTitular(var especialidade:String, nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int) :
        Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
}