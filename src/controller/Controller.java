package controller;

import model.Model;
import model.RainbowBuilder;
import view.MyPanel;

import java.awt.*;
import java.util.List;

public class Controller {
    private final Model model;
    private final MyPanel view;

    public Controller(Model model, MyPanel view) {
        this.model = model;
        this.view = view;
    }

    public void setFirstColor(Color color) {
        model.setFirstColor(color);
    }

    public void setSecondColor(Color color) {
        model.setSecondColor(color);
    }

    public void generateRainbow() {
        RainbowBuilder builder = new RainbowBuilder()
                .setStartColor(model.getFirstColor())
                .setEndColor(model.getSecondColor());
        List<Color> rainbow = builder.build();
        view.displayRainbow(rainbow);
    }
}
