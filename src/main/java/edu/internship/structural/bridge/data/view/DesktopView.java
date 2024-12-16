package edu.internship.structural.bridge.data.view;

import edu.internship.structural.bridge.data.resource.Resource;

public class DesktopView extends View {

    public DesktopView(Resource resource) {
        super(resource);
    }

    @Override
    public void render() {
        System.out.println("Rendering resource on a desktop application.");
        resource.display();
    }
}