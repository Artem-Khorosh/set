package practice;

import java.util.Scanner;

public class Main {

  public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    EmailList emailList = new EmailList();

    while (true) {
      String input = scanner.nextLine().trim();
      String[] parts = input.split("\\s+", 2);
      switch (parts[0].toUpperCase()) {
        case "LIST":
          emailList.getSortedEmails().forEach(System.out::println);
          break;

        case "ADD":
          if (parts.length < 2) {
            System.out.println(WRONG_EMAIL_ANSWER);
          } else {
            emailList.add(parts[1]);
          }
          break;

      }
    }
  }
}
