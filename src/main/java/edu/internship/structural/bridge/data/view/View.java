package edu.internship.structural.bridge.data.view;

import edu.internship.structural.bridge.data.resource.Resource;

public abstract class View {
    protected Resource resource;

    protected View(Resource resource) {
        this.resource = resource;
    }

    public abstract void render();
}