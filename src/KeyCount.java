/**
 * Created by Alexis Espinoza on 12/28/15.
 */
import lib.InputFileReader;
import java.util.HashMap;
import java.util.Map;
public class KeyCount {
    public static void main(String args[]){
        HashMap<String, Integer> keyCount = InputFileReader.KeyCount("inputFileLocation");
        if(!keyCount.isEmpty()) {
            for (Map.Entry<String, Integer> entry : keyCount.entrySet())
                System.out.println("The total for " + entry.getKey() + " is " + entry.getValue() + ". ");

        }else{
            System.out.println("There were no lines in the file compliant with the format <STRING><COMMA><INTEGER>");
        }

    }

}
