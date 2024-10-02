import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepareScene();
    }
    
     private void prepareScene()
    {
       addPlayer();
       addFood();
       addEnemy();
    }
    
    private void addFood() 
    {
        for (int i = 0; i < 8; i++) 
        {
            Worm worm = new Worm();
            addObject(worm, Greenfoot.getRandomNumber(getWidth()), 
                             Greenfoot.getRandomNumber(getHeight()));
        }
    }
   
    private void addPlayer()
    {
       Crab crab = new Crab();
       addObject(crab, 100, 100);
     }
   
    private void addEnemy()
    {
        Lobster lobster = new Lobster();
        addObject(lobster, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));    
    }
} 
