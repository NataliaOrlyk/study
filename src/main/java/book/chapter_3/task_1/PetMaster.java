package book.chapter_3.task_1;

import book.chapter_3.task_1.Pet;

/**
 * Created by home on 20.11.2015.
 */
public class PetMaster {
    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Чик!! Чирик!!");
        System.out.println(petReaction);
        myPet.sleep();
    }

}
