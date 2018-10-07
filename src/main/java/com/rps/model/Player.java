package com.rps.model;

public class Player {
	private Shape shape;
	
	public void formShape(Shape shape) {
		this.shape = shape;
	}
	
	public Shape getShape() {
		return shape;
	}
	
	public boolean defeats(Player otherPlayer) {
		Shape thisShape = this.shape;
		Shape thatShape = otherPlayer.getShape();
		
		return thisShape.interactWith(thatShape)==1;
	}
}

enum Shape {
	ROCK {
		@Override
		public int interactWith(Shape thatShape) {
			return thatShape.equals(SCISSORS) ? 1 : -1;
		}
	},
	PAPER {
		@Override
		public int interactWith(Shape thatShape) {
			return thatShape.equals(ROCK) ? 1 : -1;
		}
	},
	SCISSORS {
		@Override
		public int interactWith(Shape thatShape) {
			return thatShape.equals(PAPER) ? 1 : -1;
		}
	};

public int interactWith(Shape thatShape) {
	return 0;
}}
