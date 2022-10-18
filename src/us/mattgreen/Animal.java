package us.mattgreen;

import javax.lang.model.type.UnknownTypeException;
import java.util.Scanner;

public class Animal implements Talkable{
    String voice;

    @Override
    public String talk() {
        return voice;
    }

    @Override
    public String getName() {
        System.out.println("What animal would you like to create?");
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();

        System.out.println("What noise does " + name + " make?");
        voice = kb.nextLine();
        try{
            return name;

        }catch(UnknownTypeException ex){
            return "ex";
        }
    }
}
