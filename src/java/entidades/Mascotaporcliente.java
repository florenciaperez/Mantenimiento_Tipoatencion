package entidades;
// Generated 14-jul-2019 21:57:39 by Hibernate Tools 4.3.1



/**
 * Mascotaporcliente generated by hbm2java
 */
public class Mascotaporcliente  implements java.io.Serializable {


     private MascotaporclienteId id;
     private Cliente cliente;
     private Mascota mascota;
     private char estado;

    public Mascotaporcliente() {
    }

    public Mascotaporcliente(MascotaporclienteId id, Cliente cliente, Mascota mascota, char estado) {
       this.id = id;
       this.cliente = cliente;
       this.mascota = mascota;
       this.estado = estado;
    }
   
    public MascotaporclienteId getId() {
        return this.id;
    }
    
    public void setId(MascotaporclienteId id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Mascota getMascota() {
        return this.mascota;
    }
    
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }




}


