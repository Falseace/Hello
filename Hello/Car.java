
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    private boolean isOn;
    private int speed;
    private int direction;
    private int fuel;

    public Car()
    {
        isOn=false;
        speed=0;
        direction = 1;//1-north, 2-east, 3-south, 4- west
        fuel=0;
    }

    public void changeIgnition()
    {
        if(fuel>0)
        {
            isOn=!isOn;
        }
        else
            System.out.println("You are out of gas!");
        if(!isOn)
            speed =0;
    }

    public void addFuel(int f)
    {
        fuel += f;
    }

    public void turn(String d)
    {
        if(isOn && speed >0 || speed <0)
        {
            if(d.equals("left"))
            {
                direction--;
                if(direction==0)
                    direction=4;
            }
            else if(d.equals("right"))
            {
                direction++;
                if(direction==5)
                    direction=1;
            }
        }
        else if (!isOn)
            System.out.println("The car can't turn while it's off, where did you learn to drive?");

        else if(speed == 0)
            System.out.println("You can't turn while you're not moving silly");
    }

    public void stop()
    {
        speed=0;
    }

    public int checkFuel()
    {
        return fuel;
    }

    public String toString()
    {
        String output = "";
        if(isOn)
            output += "Ignition: on\n";
        else 
            output += "Ignition: off\n";
        output += "Speed: " + speed + "\n";
        output += "Direction: " + getDirection() + "\n";
        output += "Fuel: " + fuel +"\n";
        return output;
    }

    public String getDirection()
    {
        //1-North, 2-East, 3-South,4-West
        if(direction ==1)
            return "North";
        else if(direction ==2)
            return "East";
        else if(direction ==3)
            return "South";
        else if(direction==4)
            return "West";
        else
            return "Invalid direction";
    }

    public void changeSpeed(int s)
    {
        if(isOn)
        {
            speed += s;
            if(s>0)
                fuel -= 5;
            else if(s<0)
                fuel -=2;
        }
        if(!isOn)
        {
            System.out.println("You can't speed up while the engine is off!");
        }
        if(speed>100)
        {
            System.out.println("Cop! You got pulled over");
            isOn=false;
        }
    }

    public static void main(String[]args)
    {
        Car Fiesta = new Car();
        System.out.println(Fiesta.toString());
        Fiesta.turn("right");
        System.out.println(Fiesta);
        Fiesta.changeSpeed(50);
        Fiesta.changeIgnition();
        System.out.println(Fiesta);
        Fiesta.addFuel(50);
        Fiesta.changeIgnition();
        Fiesta.changeSpeed(-2);
        Fiesta.turn("right");
        System.out.println(Fiesta);
        Fiesta.changeSpeed(100);
        Fiesta.turn("right");
        System.out.println(Fiesta);
        Fiesta.turn("left");
        Fiesta.stop();
        System.out.println(Fiesta);
    }
}
