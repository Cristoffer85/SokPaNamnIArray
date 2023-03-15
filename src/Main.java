/* import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

array                    String[] strings = { "Clark Kent (Superman)", "Bruce Wayne (Batman)", "Diana Prince (Wonder Woman)", "Tony Stark (Iron Man)", "Peter Parker (Spider-Man)", "Selina Kyle (Catwoman)", "Bruce Banner (The Hulk)", "Kal-El (Superman)", "Steve Rogers (Captain America)", "Barry Allen (The Flash)", "Arthur Curry (Aquaman)", "Hal Jordan (Green Lantern)", "Barbara Gordon (Batgirl)", "Oliver Queen (Green Arrow)", "Dinah Lance (Black Canary)", "John Stewart (Green Lantern)", "Kara Zor-El (Supergirl)", "Victor Stone (Cyborg)", "Wally West (Kid Flash)", "Jason Todd (Robin)", "Tim Drake (Robin)", "Damian Wayne (Robin)", "Dick Grayson (Nightwing)", "Felicity Smoak (Overwatch)", "Ray Palmer (Atom)", "Roy Harper (Arsenal)", };
konv.array till lista    List sökaLista = Arrays.asList(strings);

                Scanner Sc = new Scanner(System.in);
                System.out.println("Ange superhjältens namn eller alias här: ");
                sökaLista = Collections.singletonList(Sc.nextLine());

                boolean found = Arrays.asList(strings).contains(sökaLista);
                if(found)
                    System.out.println(sökaLista + " is found.");
                else
                    System.out.println(sökaLista + " is not found.");
            }
        }
-------------------------------------------
        String[] Superhjältar = {"Clark Kent (Superman)", "Bruce Wayne (Batman)", "Diana Prince (Wonder Woman)", "Tony Stark (Iron Man)", "Peter Parker (Spider-Man)", "Selina Kyle (Catwoman)", "Bruce Banner (The Hulk)", "Kal-El (Superman)", "Steve Rogers (Captain America)", "Barry Allen (The Flash)", "Arthur Curry (Aquaman)", "Hal Jordan (Green Lantern)", "Barbara Gordon (Batgirl)", "Oliver Queen (Green Arrow)", "Dinah Lance (Black Canary)", "John Stewart (Green Lantern)", "Kara Zor-El (Supergirl)", "Victor Stone (Cyborg)", "Wally West (Kid Flash)", "Jason Todd (Robin)", "Tim Drake (Robin)", "Damian Wayne (Robin)", "Dick Grayson (Nightwing)", "Felicity Smoak (Overwatch)", "Ray Palmer (Atom)", "Roy Harper (Arsenal)",};

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type student name for search:");
        String studentName = inputScanner.nextLine();

        // use for loop to search array.
        for(int i = 0; i < Superhjältar.length; i++){
            if(Superhjältar[i].getName().equals(studentName)){
                // If student was found, print his details and return from this function.
                System.out.println(Superhjältar[i]);
                return;
            }
        }

        // If we reach this point, it means the student was never found in the for loop.
        System.out.println("Student not found.");
    }
*/    // -------------------    Mina 2 försök ovan, lärarens "facit" nedan    ------------------------

import java.util.Scanner;
    public class Main {

        public static void main(String[] args) {
            String[] names = { "Clark Kent (Superman)", "Bruce Wayne (Batman)", "Diana Prince (Wonder Woman)", "Tony Stark (Iron Man)", "Peter Parker (Spider-Man)", "Selina Kyle (Catwoman)", "Bruce Banner (The Hulk)", "Kal-El (Superman)", "Steve Rogers (Captain America)", "Barry Allen (The Flash)", "Arthur Curry (Aquaman)", "Hal Jordan (Green Lantern)", "Barbara Gordon (Batgirl)", "Oliver Queen (Green Arrow)", "Dinah Lance (Black Canary)", "John Stewart (Green Lantern)", "Kara Zor-El (Supergirl)", "Victor Stone (Cyborg)", "Wally West (Kid Flash)", "Jason Todd (Robin)", "Tim Drake (Robin)", "Damian Wayne (Robin)", "Dick Grayson (Nightwing)", "Felicity Smoak (Overwatch)", "Ray Palmer (Atom)", "Roy Harper (Arsenal)", };

            String keyword = askForName();    //skapar ett sätt att fråga efter namn som skickas ned till metod
            if (keyword.isEmpty()) {          //returnerar ett svar om man inte skrivit in något
                System.out.println("Du måste skriva in ett namn eller alias");
                return;
            }

            String[] searchResult = searchForName(names, keyword);  //Ihopbakaren + skaparen av stora sättet att söka efter namn + printa ut det mha metod längre ned
            printResult(searchResult);
        }

        private static String askForName() {                         //metod fråga efter namn (Input scanner finns här)
            Scanner scanner = new Scanner(System.in);
            System.out.print("Skriv in ett namn eller alias: ");
            return scanner.nextLine();
        }

        private static String[] searchForName(String[] names, String keyword) {  //metod söka efter namn
            String[] result = new String[names.length];
            int index = 0;
            for (int i = 0; i < names.length; i++) {
                if (names[i].toLowerCase().contains(keyword.toLowerCase())) // kollar om keyword finns i namnet (små + stora bokstäver finns med här .toLowerCase()!!!!!!! :) :) :) :) :)
                {
                    result[index] = names[i];
                    index++;
                }
            }
            return result;
        }

        private static void printResult(String[] searchResult) {           //utskrifts-metoden
            if (searchResult[0] == null) {                      //om == hittade null(inget öht) då returnera Hittade inget
                System.out.println("Hittade ingenting :'(");
            } else {
                System.out.println("Hittade följande:");
                for (int i = 0; i < searchResult.length; i++) {
                    if (searchResult[i] != null) {             //om != inte hittade null, då returnera hittade
                        System.out.println(searchResult[i]);
                    }
                }
            }
        }
    }
