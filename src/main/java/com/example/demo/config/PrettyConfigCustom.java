package com.example.demo.config;

import com.ocpsoft.pretty.faces.config.PrettyConfig;
import com.ocpsoft.pretty.faces.config.mapping.UrlMapping;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class PrettyConfigCustom extends PrettyConfig {
    @Getter
    @Setter
    private List<UrlMapping> mappings = new ArrayList();

    public PrettyConfigCustom() {
        UrlMapping urlMapping = new UrlMapping();
        urlMapping.setId("dashboard");
        urlMapping.setPattern("/");
        urlMapping.setViewId("/index.jsf");
        UrlMapping urlMapping2 = new UrlMapping();
        urlMapping2.setId("pagina");
        urlMapping2.setPattern("/pagina");
        urlMapping2.setViewId("/pagina.jsf");
        mappings.add(urlMapping);
        mappings.add(urlMapping2);

    }

}