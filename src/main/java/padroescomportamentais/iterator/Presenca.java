package padroescomportamentais.iterator;

import java.util.Iterator;

public class Presenca {

    public static Integer contarFuncionariosPresenteData(Data data) {
        int quantidade = 0;
        for (Paciente paciente : data) {
            if (paciente.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFuncionariosPresentes(Data data) {
        int quantidade = 0;
        for (Iterator a = data.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
