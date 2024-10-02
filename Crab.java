import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author BGustin
 * @version 6/1/2022 5:48am
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    private int speed = 4;
    private int turnSpeed = 4;

    public void act()
    {
        checkKeys();
        move(speed);
        turnAtEdge();
        checkCollision();
    }
    
    private void turnAtEdge()
    {
        if (isAtEdge()) {
            turn(17);  
        }
    
    
    
    }
    
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-turnSpeed);
        }

        if (Greenfoot.isKeyDown("right"))
        {
            turn(turnSpeed);
        }

        if (Greenfoot.isKeyDown("up"))
        {
            speed++;
        }

        if (Greenfoot.isKeyDown("down"))
        {
            speed--;
            if (speed < 1)  // Ensuring the speed is not negative or zero.
            {
                speed = 1;
            }
        }
    }
    
    
    
    private void checkCollision() {
        if (isTouching(Worm.class)) {
            removeTouching(Worm.class);

            if (getWorld().getObjects(Worm.class).isEmpty()) {
                Greenfoot.stop();
                Greenfoot.playSound("fanfare.wav");
                getWorld().showText("You Won!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            } else {
                Greenfoot.playSound("slurp.wav");
            }
        }
        
        if (isTouching(Lobster.class)) {
            Greenfoot.playSound("au.wav");
            getWorld().showText("You Lost!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}





