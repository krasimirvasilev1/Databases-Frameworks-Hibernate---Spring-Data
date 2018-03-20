package FirstOOPIntroduction.Lecture.BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    List<Birthdable> allIds = new ArrayList<>();

        while(true){
            String[] input = console.readLine().split("\\s");
            Birthdable birthable = null;
            if (input[0].equals("End")){
                break;
            }
            if (input[0].equals("Pet")) {
                birthable = new Pet(input[1],input[2]);
            }
            else if (input[0].equals("Citizen")){
                birthable = new Citizen(input[1],input[2],input[3],input[4]);
            }

            if (birthable != null)
            allIds.add(birthable);
        }

        String yearToCheck = console.readLine();

        for (Birthdable allId : allIds) {
            String year = allId.getBirthdate().split("/")[2];
            if (year.equals(yearToCheck)){
                System.out.println(allId.getBirthdate());
            }
        }
    }
}
