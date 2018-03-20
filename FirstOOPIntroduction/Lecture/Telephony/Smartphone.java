package FirstOOPIntroduction.Lecture.Telephony;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements CallImpl,BrowseImpl {


    @Override
    public String browseUrl(String url) {
        Pattern pattern = Pattern.compile("^\\D*$");
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()){
            return "Browsing: "+url+"!";
        }

        return "Invalid URL!";
    }

    @Override
    public String callNumber(String number) {
        Pattern pattern = Pattern.compile("^\\d*$");
        Matcher matcher = pattern.matcher(number);

        if (matcher.find()){
            return "Calling... "+number;
        }

        return "Invalid number!";
    }
}