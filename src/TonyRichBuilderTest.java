import com.sun.java.swing.plaf.windows.WindowsBorders;
import com.tonyrichbuilder.*;

/**
 * Created by localadmin on 7/27/16.
 */
public class TonyRichBuilderTest {

    public static void main(String[] args){

        try {
            Room r1 = new Room("Kitchen", 5.0f, 10.0f, 10.0f);
            r1.setFloorType(Floor.WOOD);
            r1.setPaintType(Paint.FLAT);
            System.out.println(r1.getName() + ": Paint Cost is " + r1.getPaintCost());
            System.out.println(r1.getName() + ": Floor Cost is " + r1.getFloorCost());
            System.out.println(r1.getName() + ": Total Cost is " + r1.getTotalCost());
            System.out.println("************************************");

            Room r2 = new Room("Living Room", 5.0f, 15.0f, 10.0f);
            r2.setFloorType(Floor.CARPET);
            r2.setPaintType(Paint.GLOSSY);
            System.out.println(r2.getName() + ": Paint Cost is " + r2.getPaintCost());
            System.out.println(r2.getName() + ": Floor Cost is " + r2.getFloorCost());
            System.out.println(r2.getName() + ": Total Cost is " + r2.getTotalCost());
            System.out.println("************************************");

            Room r3 = new Room("Bedroom1", 5.0f, 10.0f, 10.0f);
            r3.setFloorType(Floor.CARPET);
            r3.setPaintType(Paint.GLOSSY);

            System.out.println(r3.getName() + ": Paint Cost is " + r3.getPaintCost());
            System.out.println(r3.getName() + ": Floor Cost is " + r3.getFloorCost());
            System.out.println(r3.getName() + ": Total Cost is " + r3.getTotalCost());
            System.out.println("************************************");

            Room r4 = new Room("Bedroom2", 5.0f, 10.0f, 10.0f);
            r4.setFloorType(Floor.CARPET);
            r4.setPaintType(Paint.GLOSSY);
            System.out.println(r4.getName() + ": Paint Cost is " + r4.getPaintCost());
            System.out.println(r4.getName() + ": Floor Cost is " + r4.getFloorCost());
            System.out.println(r4.getName() + ": Total Cost is " + r4.getTotalCost());
            System.out.println("************************************");

            House newHouse = new House("DemoHouse");
            newHouse.addRoom(r1);
            newHouse.addRoom(r2);
            newHouse.addRoom(r3);
            newHouse.addRoom(r4);
            System.out.println("Total cost for the house " + newHouse.getName() +" is: "+newHouse.getTotalCost());

            Room r5 = new Room("Kitchen", 5.0f, 10.0f, 10.0f);
            newHouse.addRoom(r5);

        }catch (DuplicateRoomNameException drne){
            System.out.println(drne);
        }
    }
}
