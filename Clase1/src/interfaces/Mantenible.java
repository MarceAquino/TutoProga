package interfaces;

public interface Mantenible {
    boolean necesitaService(int kmRecorridos);

    default String estadoGeneral(int kmRecorridos){
        if(necesitaService(kmRecorridos)){
            return "Requiere mantenimiento";
        }
        return "En condiciones optimas";
    }
}
