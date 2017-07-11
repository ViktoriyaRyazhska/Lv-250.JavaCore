package com.edu.classwork9.task2;

public class Plants {

	private Type type;
	private Color color;
	private int size;
	
	public Plants(String type, String color, int size) throws ColorException, 
	TypeException{
	      Color c = colorStrToEnum(color);
	      Type t = typeStrToEnum(type);
	      this.size = size;
	      this.type = t;
	      this.color = c;
	 }
	
	private Color colorStrToEnum(String color) throws ColorException {
	      switch(color.toLowerCase()){
	         case "red" : return Color.Red; 
	         case "green" : return Color.Green; 
	         case "blue" : return Color.Blue; 
	         default : throw new ColorException("You entered invalid color");
	      }
	}
	
	private Type typeStrToEnum(String color) throws TypeException {
	      switch(color.toLowerCase()){
	         case "tree" : return Type.Tree; 
	         case "flower" : return Type.Flower; 
	         case "bush" : return Type.Bush; 
	         default : throw new TypeException("You entered invalid type");
	      }
	}

	@Override
	public String toString() {
		return "Type - " + type + ". Color - " + color + ". Size - " + size;
	}
	
	

}
