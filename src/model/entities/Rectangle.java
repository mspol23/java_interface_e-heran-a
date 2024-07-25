package model.entities;

import model.enums.Colors;

public class Rectangle extends AbstractShape {

	private Double base;
	private Double heigth;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Colors color, Double base, Double heigth) {
		super(color);
		this.base = base;
		this.heigth = heigth;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	@Override
	public Double getArea() {
		return base * heigth;
	}
	
}
