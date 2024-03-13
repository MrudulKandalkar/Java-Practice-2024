//Write a program to display the population for each of the next five years assume the current population is 312032486 
//and one year has 365 days  
//Assumption 1) one birth every 7 seconds 2) one death every 13second 3)one new immigrants every 45seconds

class Population 
  {
    public static void main (String[] args){
    
    long currentPopulation = 312032486; 
    long secondsPerYear = 365*24*60*60;
    long birthPerYear= secondsPerYear/7;
    long deathPerYear= secondsPerYear/13;
    long immigrantPerYear = secondsPerYear/45;
 

    long populationAfter5year=( currentPopulation + (birthPerYear - deathPerYear + immigrantPerYear)*5);
    System.out.println(" Population After 5 Years : " + populationAfter5year);

}
}