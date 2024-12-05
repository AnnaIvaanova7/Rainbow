package view;

import controller.Controller;
import model.Model;

import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame() {
        setTitle("Rainbow Builder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Создаем модель
        Model model = new Model();

        // Создаем панель и контроллер
        MyPanel panel = new MyPanel();
        Controller controller = new Controller(model, panel);

        // Устанавливаем контроллер для панели
        panel.setController(controller);

        // Добавляем верхнюю панель инструментов
        JToolBar toolBar = new JToolBar();
        JButton generateButton = new JButton("Радуга");
        generateButton.addActionListener(e -> controller.generateRainbow());
        toolBar.add(generateButton);
        add(toolBar, "North"); // Добавляем на верхнюю часть окна

        // Добавляем основную панель
        add(panel);

        setVisible(true);
    }
}
