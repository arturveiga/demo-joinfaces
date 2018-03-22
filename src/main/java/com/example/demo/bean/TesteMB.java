package com.example.demo.bean;

import com.example.demo.model.TesteModel;
import com.example.demo.repository.TesteRepository;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.util.Faces;
import org.omnifaces.util.FacesLocal;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Admin on 22/03/2018.
 */
@Named
@ViewScoped
public class TesteMB {
    @Getter
    @Setter
    private String nome= "";
    @Inject
    private TesteRepository testeRepository;
    @Getter@Setter
    private List<TesteModel> testeModels;

    @PostConstruct
    public void init(){
        nome = "Artur Veiga";
        testeModels = testeRepository.findAll();
    }

    public String salvar(){
        TesteModel model = new TesteModel();
        model.setNome(nome);
        model = testeRepository.save(model);
        FacesLocal.setFlashAttribute(Faces.getContext(),"model",model);
        return "pretty:pagina";
    }
}
