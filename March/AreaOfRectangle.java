//Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula:
//area = width * height

class AreaOfRectangle {
public static void main (String[] args){
        double width = 4.5 ;
        double height = 7.9 ;
        double area = width * height;
        double perimeter = 2 * (height + width) ;
        System.out.println("Area Of Rectangle is -" + area );
        System.out.println("Perimeter Of Rectangle is -" + perimeter);
}
}