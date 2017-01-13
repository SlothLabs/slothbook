package com.github.slothLabs.slothBook;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author mcory
 */
public class FormDefinition {

    public FormDefinition() {
    }

    public RequestMethod getMethod() {
        return method;
    }

    public void setMethod(RequestMethod method) {
        this.method = method;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public List<FormField> getFields() {
        return fields;
    }
    
    public void addField(final FormField field) {
        fields.add(field);
    }
    
    private RequestMethod method;
    private String action;
    private String type;
    private final List<FormField> fields = new ArrayList<>();
}
