package edu.internship.structural.bridge.data.view;

import edu.internship.structural.bridge.data.resource.Resource;

public class MobileView extends View {

    public MobileView(Resource resource) {
        super(resource);
    }

    @Override
    public void render() {
        System.out.println("Rendering resource on a mobile screen.");
        resource.display();  // Delegate to the resource for display logic
    }
}