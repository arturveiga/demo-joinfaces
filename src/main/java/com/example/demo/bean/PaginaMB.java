package com.example.demo.bean;

import com.example.demo.model.TesteModel;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.util.Faces;
import org.omnifaces.util.FacesLocal;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.Optional;


@Named
@ViewScoped
public class PaginaMB {
    @Getter
    @Setter
    private TesteModel model;

    @PostConstruct
    public void init(){
        model = (TesteModel) Optional.ofNullable(FacesLocal.getFlashAttribute(Faces.getContext(),"model")).orElse(new TesteModel());
    }

}