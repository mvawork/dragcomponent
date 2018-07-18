package ru.mvawork.flow.dragcomponet;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the drag-component.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("drag-component")
@HtmlImport("src/drag-component.html")
public class DragComponent extends PolymerTemplate<DragComponent.DragComponentModel> {

    /**
     * Creates a new DragComponent.
     */
    public DragComponent() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between DragComponent and drag-component.html
     */
    public interface DragComponentModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
