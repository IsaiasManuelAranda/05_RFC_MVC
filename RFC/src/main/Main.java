
package main;

import model.ModelRFC;
import view.ViewRFC;
import controller.ControllerRFC;

public class Main {
    
    private static ModelRFC model;
    private static ViewRFC view;
    private static ControllerRFC controller;

    public static void main(String[] args) {
        model = new ModelRFC();
        view = new ViewRFC();
        controller = new ControllerRFC(model,view);
    }
    
}
