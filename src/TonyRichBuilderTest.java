import com.tonyrichbuilder.Floor;
import com.tonyrichbuilder.Paint;
import com.tonyrichbuilder.Room;

/**
 * Created by localadmin on 7/27/16.
 */
public class TonyRichBuilderTest {

    public static void main(String[] args){
        Room r = new Room("Kitchen", 10.0f, 10.0f, 10.0f);
        r.setFloorType(Floor.WOOD);
        r.setPaintType(Paint.FLAT);
        System.out.println("r.getPaintCost(): " + r.getPaintCost());
        System.out.println("r.getFloorCost(): " + r.getFloorCost());

        System.out.println("r.getTotalCost(): " + r.getTotalCost());
    }
}
