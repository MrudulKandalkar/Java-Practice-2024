/*Write a program  that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit any
displays the result.
The formula for the conversion is as follows:
Fahrenheit= (9/5) *celsius + 32
Hint: In Java, 9/5 is 1, but 9.0 / 5 is 1.8,
OUTPUT: Enter a degree in Celsius: 43
43 Celsius is 109.4 Fahrenheit*/
 

class CelsiusToFahrenheit {

public static void main (String [] args)  
    {   
          float celsius= 43;  
          double fahrenheit =(celsius*9/5) + 32;
           
          System.out.println("Temperature in Celsius is: "+ celsius ); 
          System.out.println("Temperature in Fahrenheit is: "+ fahrenheit);  
    }}  