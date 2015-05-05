package net.witr.wandroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by witrdotnet <witr.net@gmail.com> on 03/05/15.
 */
public class Store {

    private String id;
    private String name;
    private List<ModelElement> modelElements = new ArrayList<ModelElement>();

    public Store(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ModelElement> getModelElements() {
        return modelElements;
    }
}
