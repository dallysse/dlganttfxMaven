package com.ganttfx.models;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GanttResource extends Activity {

	private SimpleStringProperty role;

	public GanttResource() {
		super();
	}

	public GanttResource(int id, String name, LocalDate startDate, LocalDate endDate) {
		super(id, name, startDate, endDate);
	}

	public GanttResource(int id, String name, LocalDate startDate, LocalDate endDate, String role) {
		super(id, name, startDate, endDate, role);
	}

	public StringProperty roleProperty() {
		return this.role;
	}

	public String getRole() {
		return this.roleProperty().get();
	}

	public void setRole(String role) {
		this.roleProperty().set(role);
	}
    
}
