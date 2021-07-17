package c.Waitress.Iterator;

public class MenuItem {
String name;
String description;
boolean vegiterian;
double price;

public MenuItem(String name, String description, boolean vegiterian, double price) {
	this.name = name;
	this.description = description;
	this.vegiterian = vegiterian;
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public boolean isVegiterian() {
	return vegiterian;
}

public void setVegiterian(boolean vegiterian) {
	this.vegiterian = vegiterian;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

}
