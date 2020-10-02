import Model.*

fun main() {

    var digital = DigitalHouseManager()

    //Criação professor

    digital.registrarProfessorAdjunto("Lucas","Gabriel",
            2, 0)

    digital.registrarProfessorTitular("Felipe", "Medeiros", 1, "Kotlin")


    digital.registrarCurso("DevMobile", 1, 2)

    // digital.registrarCurso("DevMobileIOS", 2, 20)

    // digital.excluirCurso(1)


// Registro alunos
    digital.matricularAluno("Gabriel", "Segantini", 1)
    digital.matricularAluno("Gabriel", "Marrani", 2)
    digital.matricularAluno("Gabriel", "Henrique", 3)

    // matricular alunos
    digital.matricularAluno(1, 1)
    digital.matricularAluno(2, 1)
    digital.matricularAluno(3, 1)

    // alocar professor
    digital.alocarProfessores(1,1,2)
}