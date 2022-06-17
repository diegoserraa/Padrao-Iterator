package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Data implements Iterable<Paciente>{

    private List<Paciente> pacientes = new ArrayList<Paciente>();

    public Data(Paciente... pacientes) {
        this.pacientes = Arrays.asList(pacientes);
    }

    @Override
    public Iterator<Paciente> iterator() {
        return pacientes.iterator();
    }

}


