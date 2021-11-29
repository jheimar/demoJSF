package com.song.jsf.example;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SimpleCrudBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Persona> list;
    private Persona item = new Persona();
    private Persona beforeEditItem = null;
    private boolean edit;
    private TipoDocumento tipoDocumento;
    private List listTipoDocumento;
    private String labeled;

    public String getLabeled() {
        return labeled;
    }

    public void setLabeled(String labeled) {
        this.labeled = labeled;
    }
    
    @PostConstruct
    public void init() {
        list = new ArrayList<Persona>();
        
    }

    public void add() {
    	// DAO save the add
        item.setId(list.isEmpty() ? 1 : list.get(list.size() - 1).getId() + 1);
        list.add(item);
        item = new Persona();
    }

    public void resetAdd() {
    	item = new Persona();
    }

    public void edit(Persona item) {
    	beforeEditItem = item.clone();
        this.item = item;
        edit = true;
    }

    public void cancelEdit() {
    	this.item.restore(beforeEditItem);
        this.item = new Persona();
        edit = false;
    }

    public void saveEdit() {
    	// DAO save the edit
        this.item = new Persona();
        edit = false;
    }

    public void delete(Persona item) throws IOException {
    	// DAO save the delete
        list.remove(item);
    }

    public List<Persona> getList() {
        return list;
    }

    public Persona getItem() {
        return this.item;
    }

    public boolean isEdit() {
        return this.edit;
    }

}
