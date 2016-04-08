
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     City KW = new City();
     Robot karel = new Robot(KW,1,1,Direction.EAST,20);
     
     int count = 0;

while(count < 4){
karel.move();
karel.putThing();
karel.move();
karel.putThing();
karel.move();
karel.putThing();
karel.move();
karel.putThing();
karel.move();
karel.putThing();


    
count = count +4;


for(int num = 1;num < 4;num = num + 1){
   karel.turnLeft();
   karel.turnLeft();
   karel.move();
}}}}


     
     
    
     
    
    
    
    

