package com.controdonto.beans;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class RedirectBean {

    public RedirectBean() {
    }

    public void openPage() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("cadastroProduto.xhtml");
    }
}
