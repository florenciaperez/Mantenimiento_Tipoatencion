/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import Dao.TipoAtencionDao;
import entidades.Tipoatencion;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@ViewScoped
public class TipoAtencionBeans {
    
    private Tipoatencion tipoatenciones;
    private boolean banderaSelect = false;
    
    public TipoAtencionBeans(){
        this.tipoatenciones = new Tipoatencion();
        
    }
       public String guardarTipoAtencion() {
        TipoAtencionDao dao = new TipoAtencionDao();
        boolean respuesta = dao.guardarTipoAtencion(tipoatenciones);
        if (respuesta) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se guardo correctamente"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se pudo registrar"));
        }
        return "/TipoAtencion";

    }
       
        public String ActualizarTipoAtencion() {
        try {
            TipoAtencionDao TipoAtencionDao = new TipoAtencionDao();
            boolean resp = TipoAtencionDao.ActualizarTipoAtencion(tipoatenciones);
            if (resp) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se actualizo correctamente"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se Pudo Actualizar"));

            }
            TipoAtencionDao.ActualizarTipoAtencion(tipoatenciones);
        } catch (Exception e) {
            System.out.println("Error::" + e);
        }
        return "/TipoAtencion";
    }
         public ArrayList<Tipoatencion> listarTipoAtencion() {
        ArrayList<Tipoatencion> milista = new ArrayList<>();
        TipoAtencionDao dao = new TipoAtencionDao();
        milista = dao.listarTipoAtencion();
        return milista;

    }
       
    public String eliminar(Tipoatencion data) {
        TipoAtencionDao tadao = new TipoAtencionDao();
        boolean respuesta = tadao.eliminarTipoAtencion(data);
        if (respuesta) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se elimino correctamente"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se pudo eliminar"));
        }

        return "/TipoAtencion.xhtml";
    }
    
     public String limpiar() {
        banderaSelect=false;
        return "/TipoAtencion.xhtml";
    }
     
     
    public void selectBandera() {
        banderaSelect = true;
    }

    public boolean isBanderaSelect() {
        return banderaSelect;
    }

    public void setBanderaSelect(boolean banderaSelect) {
        this.banderaSelect = banderaSelect;
    }
    
    public Tipoatencion getTipoatenciones() {
        return tipoatenciones;
    }

    public void setTipoatenciones(Tipoatencion tipoatenciones) {
        this.tipoatenciones = tipoatenciones;
    }
    
    
    
    
    
    

   
    
    
    
}
