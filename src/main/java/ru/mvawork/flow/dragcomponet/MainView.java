package ru.mvawork.flow.dragcomponet;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends Div {

    public MainView() {
        setSizeFull();
        add(new DragComponent());
    }
}
