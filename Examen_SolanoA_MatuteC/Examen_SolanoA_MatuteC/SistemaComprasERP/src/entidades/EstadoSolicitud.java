package entidades;
// Enumeracion que representara los estados de la solicitud

public enum EstadoSolicitud {
    //La solicitud fue creada pero no se revisa aun
    SOLICITADA,

    //La solicitud esta siendo revisada por el sistema
    EN_REVISION,

    //La solicitud fue aprobada tras la revision
    APROBADA,

    //La solicitud fue rechazada por la revision
    RECHAZADA
}
