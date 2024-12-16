package edu.internship.structural.bridge.data;

import edu.internship.structural.bridge.data.resource.Document;
import edu.internship.structural.bridge.data.resource.Image;
import edu.internship.structural.bridge.data.resource.Resource;
import edu.internship.structural.bridge.data.resource.Video;
import edu.internship.structural.bridge.data.view.DesktopView;
import edu.internship.structural.bridge.data.view.MobileView;
import edu.internship.structural.bridge.data.view.View;
import edu.internship.structural.bridge.data.view.WebView;

public class Main {

    public static void main(String[] args) {
        Resource image = new Image();
        Resource document = new Document();
        Resource video = new Video();

        View webViewImage = new WebView(image);
        View mobileViewDocument = new MobileView(document);
        View desktopViewVideo = new DesktopView(video);

        webViewImage.render();
        mobileViewDocument.render();
        desktopViewVideo.render();
    }
}
