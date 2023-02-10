import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        List<Celebrity> tr;

        tr = new ArrayList<Celebrity>();
        initceleb(tr);
        Random d = new Random();
        int randomNum = d.nextInt(tr.size());
        Celebrity chosen = tr.get(randomNum);
        boolean celebFound = false;
        while (celebFound == false) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Guess Celeb");
        String sd = s1.nextLine();
        if (sd.equals(chosen.getName())) {
            celebFound = true;
        } else {
            Scanner choice = new Scanner(System.in);
            System.out.println("Choose What to go for");
            System.out.println("1.Job\n2.Race\n3.Weight\n4.Gender\n5.Age");
            int choice2 = choice.nextInt();
            if (choice2 == 1) {
            System.out.println("Guess Occupation");
            String attempt = s1.nextLine();
            if (attempt.toLowerCase().equals(chosen.getOccupation().toLowerCase())) {
                System.out.println("Correct");
            }
            else{
                    System.out.println("Wrong");
                }
            }
            if (choice2 == 2) {
            System.out.println("Guess Race");
            String attempt = s1.nextLine();
                if (attempt.toLowerCase().equals(chosen.getRace().toLowerCase())) {
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
            }
            if (choice2 == 3) {
            System.out.println("Guess Weight");
            int attempt = s1.nextInt();
                if (attempt==chosen.getWeight()) {
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
            }
            if (choice2 == 4) {
            System.out.println("Guess Gender");
            String attempt = s1.nextLine();
                if (attempt.toLowerCase().equals(chosen.getGender().toLowerCase())) {
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
            }
            if (choice2 == 5) {
            System.out.println("Guess Age");
            int attempt = s1.nextInt();
                if (attempt==chosen.getAge()) {
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong");
                }
            }
            
        }
        }
       


    }
    public static void initceleb(List<Celebrity> celebs) {
        
Celebrity one = new Celebrity("Joel Embiid", "basketball player", "Black", 280, "Male",28);
Celebrity two = new Celebrity("Grayson Allen", "basketball player", "White", 198, "Male",27);
Celebrity three = new Celebrity("Lamelo Ball", "baseketball player", "Lightskin", 180, "Male",21);
Celebrity four = new Celebrity("Patrick Beverly", "basketball player", "Black", 180, "Male",34);
Celebrity five = new Celebrity("Mo Bamba", "basketball player", "Black", 190, "Male",25);
Celebrity six = new Celebrity("Lonzo Ball", "basketball player", "Lightskin", 25, "Male",25);
Celebrity seven = new Celebrity("RJ Barret", "basketball player", "Black", 214, "Male",22);
Celebrity eight = new Celebrity("Jalen Hurts", "football player", "Black", 223, "Male",24);
celebs.add(0,one);
celebs.add(1,two);
celebs.add(2,three);
celebs.add(3,four);
celebs.add(4,five);
celebs.add(5,six);
celebs.add(6,seven);
celebs.add(7,eight);

        
    }
}
