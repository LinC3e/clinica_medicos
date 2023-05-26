package med.voll.api.domain.medico;

public record DatosListadoMedico(int id,String nombre, String epecialidad, String documento, String email) {

    public  DatosListadoMedico(Medico medico){
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }

}
