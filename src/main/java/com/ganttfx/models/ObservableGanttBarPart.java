package com.ganttfx.models;

import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ObservableGanttBarPart implements ObservableValue<GanttBarPart> {

	private GanttBarPart piece;

	public ObservableGanttBarPart(PartType type) {
		piece = new GanttBarPart(type, 0, null);
	}

	public ObservableGanttBarPart(PartType type, int id, String name) {
		piece = new GanttBarPart(type, id, name);
	}

	public ObservableGanttBarPart(PartType type, int id) {
		piece = new GanttBarPart(type, id);
	}

	@Override
	public GanttBarPart getValue() {
		return piece;
	}

    @Override
    public void addListener(InvalidationListener arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addListener'");
    }

    @Override
    public void removeListener(InvalidationListener arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeListener'");
    }

    @Override
    public void addListener(ChangeListener<? super GanttBarPart> arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addListener'");
    }

    @Override
    public void removeListener(ChangeListener<? super GanttBarPart> arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeListener'");
    }

}