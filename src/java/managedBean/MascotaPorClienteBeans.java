/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import Dao.ClienteDao;
import Dao.MascotaDao;
import Dao.MascotaporclienteDao;
import entidades.Mascotaporcliente;
import entidades.MascotaporclienteId;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author USUARIOWIN10
 */
@ManagedBean
@ViewScoped
public class MascotaPorClienteBeans {

    private ArrayList listaclientes;
    private ArrayList listamascota;
    private int idCliente;
    private int idMascota;

   private Mascotaporcliente mascotaporcliente;
   MascotaporclienteId  mascotaporclienteid;

    public MascotaPorClienteBeans() {
        listaclientes = new ArrayList();
        mascotaporcliente =new Mascotaporcliente();
        mascotaporclienteid = new MascotaporclienteId();
        listarCombos();

    }

    public void listarCombos() {
        ClienteDao clientedao = new ClienteDao();
        MascotaDao mascotadao = new MascotaDao();
        listaclientes = clientedao.listarCliente();
        listamascota = mascotadao.listarMascotas();
       
        
    }
    
    public String guardar(){
        MascotaporclienteDao dao = new MascotaporclienteDao();
        mascotaporclienteid.setClienteIdcliente(idCliente);
        mascotaporclienteid.setMascotaIdMascota(idMascota);
        mascotaporcliente.setId(mascotaporclienteid);
        dao.guardarMascotaPorCliente(mascotaporcliente);
        
        return "/RegistroMascotaPorCliente";
    }

    public ArrayList getListacliente() {
        return listaclientes;
    }

    public void setListacliente(ArrayList listaclientes) {
        this.listaclientes = listaclientes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList getListamascota() {
        return listamascota;
    }

    public void setListamascota(ArrayList listamascota) {
        this.listamascota = listamascota;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public Mascotaporcliente getMascotaporcliente() {
        return mascotaporcliente;
    }

    public void setMascotaporcliente(Mascotaporcliente mascotaporcliente) {
        this.mascotaporcliente = mascotaporcliente;
    }
    

}
