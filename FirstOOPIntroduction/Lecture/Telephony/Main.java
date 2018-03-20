package FirstOOPIntroduction.Lecture.Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String[] phoneNumbers = console.readLine().split(" ");
        String[] ulrs = console.readLine().split(" ");

        Smartphone smartphone = new Smartphone();

        for (String phoneNumber : phoneNumbers) {
            System.out.println(smartphone.callNumber(phoneNumber));
        }

        for (String ulr : ulrs) {
            System.out.println(smartphone.browseUrl(ulr));
        }
    }
}
