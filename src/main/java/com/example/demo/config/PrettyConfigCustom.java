package com.example.demo.config;

import com.ocpsoft.pretty.faces.config.PrettyConfig;
import com.ocpsoft.pretty.faces.config.mapping.UrlMapping;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrettyConfigCustom extends PrettyConfig {
    @Getter
    @Setter
    private List<UrlMapping> mappings = new ArrayList();

    public PrettyConfigCustom() {
        mappings.addAll(Arrays.asList(
                new UrlMappingCustom("pagina", "/pagina", "/pagina.jsf"),
                new UrlMappingCustom("dashboard", "/", "/index.jsf")));
    }

}