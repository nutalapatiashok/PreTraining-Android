
abstract class Shape
{

String color;
boolean filled;


Shape()
{
}

Shape(String color,boolean filled)
{
this.color=color;
this.filled=filled;
}

String getColor()
{
return color;
}

void setColor(String color)
{
this.color=color;
}

boolean isFilled()
{
return filled;
}

void setFilled(boolean filled)
{
this.filled=filled;
}

abstract double getArea();
abstract double getPerimeter();
abstract public String toString();
}


class Rectangle extends Shape
{

double width,length;

Rectangle()
{
}

Rectangle(double width,double length)
{

this.width=width;
this.length=length;
}

Rectangle(String color,boolean filled)
{
super(color,filled);
}

Rectangle(double width,double length,String color,boolean filled)
{
super(color,filled);
this.width=width;
this.length=length;
}

double getWidth()
{
return width;
}

void setWidth(double width)
{
this.width=width;
}

double getLength()
{
return length;
}

void setLength(double length)
{
this.length=length;
}

double getArea()
{
return width*length;
}

double getPerimeter()
{
return (2*(width+length));
}

public String toString()
{
return "width="+width+" lenght="+length+" area="+getArea()+" perimeter="+getPerimeter();
}


}



class Square extends Rectangle
{

double side;

Square()
{
}

Square(double side)
{
this.side=side;
}

Square(double side,String color,boolean filled)
{
super(color,filled);
this.side=side;
}

double getSide()
{
return side;
}

void setSide(double side)
{
this.side=side;
}

void setWidth(double side)
{
width=side;
}

void setLength(double side)
{
length=side;
}

double getArea()
{
return side*side;
}

double getPerimeter()
{
return 4*side;
}

public String toString()
{
return "side="+side+" area="+getArea()+" Perimeter="+getPerimeter();
}

}


class Circle extends Shape
{

double radius;

Circle()
{
}

Circle(double radius)
{
this.radius=radius;
}

Circle(double radius,String color,boolean filled)
{
super(color,filled);
this.radius=radius;
}

double getRadius()
{
return radius;
}

void setRadius(double radius)
{
this.radius=radius;
}

double getArea()
{
return (3.14*radius*radius);
}

double getPerimeter()
{
return (2*3.14*radius);
}

public String toString()
{
return "radius="+radius+" area="+getArea()+" perimeter="+getPerimeter();
}

}



class ShapeDemo
{
public static void main(String args[])
{
System.out.println("\n*****working with Circle****\n");
Circle c=new Circle();
c.setRadius(2);
System.out.println(c);

System.out.println("\n*****working with Rectangle*****\n");
Rectangle r=new Rectangle();
r.setWidth(2);
r.setLength(2);
System.out.println(r);

System.out.println("\n*****working with Square*****\n");
Square s=new Square();
s.setSide(2);
System.out.println(s);
}
}

