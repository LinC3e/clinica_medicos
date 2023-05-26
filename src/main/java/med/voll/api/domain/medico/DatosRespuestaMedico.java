package med.voll.api.domain.medico;

import med.voll.api.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(int id, String nombre, String email, String telefono, String especialidad , String documento, DatosDireccion direccion) {
}
