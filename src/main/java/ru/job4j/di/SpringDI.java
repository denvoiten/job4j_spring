package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
            context.register(Store.class);
            context.register(ConsoleInput.class);
            context.register(StartUI.class);

            context.refresh();
            StartUI ui = context.getBean(StartUI.class);
            ui.add(ui.getInput());
            ui.add(ui.getInput());
            ui.print();
        }
    }
}
