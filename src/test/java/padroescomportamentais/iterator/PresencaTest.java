package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PresencaTest {

    @Test
    void deveContarPresencaPacientesAtivos() {
        Data data = new Data(
                new Paciente("Diego Serra", true),
                new Paciente("Maria", true),
                new Paciente("Ana", false),
                new Paciente("Vitoria", true)
        );
        assertEquals(3, Presenca.contarFuncionariosPresenteData(data));
    }

    @Test
    void deveContarTotalPacientes() {
        Data data = new Data(
                new Paciente("Diego Serra", true),
                new Paciente("Maria", true),
                new Paciente("Ana", false),
                new Paciente("Vitoria", true)
        );
        assertEquals(4, Presenca.contarTotalFuncionariosPresentes(data));
    }

}