package FirstOOPIntroduction.Lecture.BordingControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    List<Identifiable> allIds = new ArrayList<>();

        while(true){
            String[] input = console.readLine().split("\\s");
            Identifiable identifiable = null;
            if (input[0].equals("End")){
                break;
            }
            if (input.length == 2){
                identifiable = new Robot(input[0],input[1]);
            }
            else if (input.length == 3){
                identifiable = new Citizen(input[0], input[1], input[2]);
            }

            allIds.add(identifiable);
        }

        String finalDigitsOfInvalidIds = console.readLine();

        for (Identifiable allId : allIds) {
            if (allId.getId().substring(allId.getId().length() - finalDigitsOfInvalidIds.length(),allId.getId().length()).equals(finalDigitsOfInvalidIds)){
                System.out.println(allId.getId());
            }
        }
    }
}
