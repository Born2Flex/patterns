package edu.internship.structural.bridge.data.view;

import edu.internship.structural.bridge.data.resource.Resource;

public class WebView extends View {

    public WebView(Resource resource) {
        super(resource);
    }

    @Override
    public void render() {
        System.out.println("Rendering resource on a web page.");
        resource.display();
    }
}