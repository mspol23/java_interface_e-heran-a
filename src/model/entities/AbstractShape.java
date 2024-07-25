package model.entities;

import model.enums.Colors;

public abstract class AbstractShape {

	private Colors color;

	public AbstractShape() {}

	public AbstractShape(Colors color) {
		this.color = color;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}
	
	public abstract Double getArea();
}
