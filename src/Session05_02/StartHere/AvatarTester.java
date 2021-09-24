package Session05_02.StartHere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AvatarTester {
    public static void main(String[] args) {
        // make a few characters from Avatar the Last Air Bender
        Human sakkah = new Human("Sakkah", "10.05.1999", "male");
        FireBender zuko = new FireBender("Zuko", "10.05.1999", "male", true, false, true);
        FireBender azula = new FireBender("Azula", "10.05.1999", "female", true, false, true);

        // add them to a list
        List<Human> avatarWorldCharacters = new ArrayList<>(Arrays.asList(sakkah, zuko, azula));

        // get a list with random characters and make them fight
        List<Human> fighters = getRandomCharacters(3, avatarWorldCharacters);
        battle(fighters);

        /*
        todo: add more characters from other nations (air benders, water benders, and earth benders)
        perhaps also add an avatar
        make them fight
         */
    }

    /**
     * Method: battle
     * iterates though fighters and calls attack method on every other character in the fighters list
     * @param fighters
     */
    /*
    todo: make them fight until they are out of breath (stamina is 0<)
     */
    public static void battle(List<Human> fighters){
        for (Human fighter:
             fighters) {
            for (Human opponent:
                 fighters) {
                if(fighter != opponent){
                    fighter.attack(opponent);
                }
            }
        }

    }


    /**
     * Method getRandomCharacters
     * randomly selects unique characters from a list based on a provided number
     * @param num number of characters that need to be selected
     * @param characters a list to select from
     * @return a list with selected characters
     */
    public static List<Human> getRandomCharacters(int num, List<Human> characters){
        if (num > characters.size()){
            System.out.printf("Cannot pick %d characters from a list with %d characters", num,characters.size());
            System.out.println("Returning an empty list");
            return new ArrayList<>();
        }
        List<Human> output = new ArrayList<>();
        for(int i = 0; i < num; i++){
            while (true){
            int nextIdx = new Random().nextInt(characters.size());
                System.out.println(nextIdx);
                Human newChar = characters.get(nextIdx);
                if (!output.contains(newChar)){
                    output.add(newChar);
                    break;
                }
            }
        }
        return output;

    }


}
