public class Main
{
    public static void main(String[] args)
    {
        int spring_cost = 200;
        int summer_cost = 180;
        int fall_cost = 150;
        int winter_cost = 220;

        int total_cost = spring_cost + summer_cost + fall_cost + winter_cost;
        System.out.println("Total annual cost by adding " + spring_cost + " in spring maintenance, " + summer_cost + " in summer maintenance, " + fall_cost + " in fall maintenance and " + winter_cost + " in winter maintenance is: " + total_cost);

    }
}