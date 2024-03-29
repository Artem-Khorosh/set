package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class EmailList {

  private final Set<String> emailSet = new HashSet<>();


  public void add(String email) {
    if (isValidEmail(email)) {
      emailSet.add(email.toLowerCase());
    }
  }


  public List<String> getSortedEmails() {
    List<String> sortedEmails = new ArrayList<>(emailSet);
    Collections.sort(sortedEmails);
    return sortedEmails;
  }

  private boolean isValidEmail(String email) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)"
        + "*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return email.matches(emailRegex);
  }

}
