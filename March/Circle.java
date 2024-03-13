//Write a program that displays the area and perimeter circe that has a radius of 5.5 using the following formula
//perimeter = 2 *pi (3.14) * radius
//area = pi(3.14) radius * radius

class Circle {
public static void main (String[] args){
        double radius = 5.5 ;
        final double pi = 3.14 ;
        double area = pi*(radius*radius);
        double perimeter = 2 * pi * radius;
        System.out.println("Area Of Circle is -" + area + "cm^2 whose radius is - " + radius +"cm");
        System.out.println("Perimeter Of Circle is -" + perimeter + "cm whose radius is - " + radius +"cm");
}
} 