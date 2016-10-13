import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question8 {
    // Copy the array list from the previous question to this one.
    // Iterate over the ArrayList and print out each element.
    public void tacoArray() {


        ArrayList<String> tacos = new ArrayList<>();
        tacos.add("blah");
        tacos.add("blah2");
        tacos.add("blah3");
        tacos.add("blah4");
        tacos.add("blah5");

        for (int i=0; i<tacos.size(); ++i){
            System.out.println(tacos.get(i));
        }
    }
}
