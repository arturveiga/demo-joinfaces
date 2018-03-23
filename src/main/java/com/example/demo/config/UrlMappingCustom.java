package com.example.demo.config;

import com.ocpsoft.pretty.faces.config.mapping.UrlMapping;

public class UrlMappingCustom extends UrlMapping {
    public UrlMappingCustom(String id,String pattern,String view) {
        super();
        this.setId(id);
        this.setPattern(pattern);
        this.setViewId(view);
    }
}
