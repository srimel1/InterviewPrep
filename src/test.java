import org.w3c.dom.ls.LSOutput;

import java.io.Console;
import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public test() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {

        String str = "hi my name is steph";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i += 2) {
            System.out.print(words[i]+", ");
        }


        File file = new File("C:\\Users\\Stephanie\\Projects\\Interview Prep\\src\\text");
        Scanner s = new Scanner(file).useDelimiter(" ");


        List<String> list = new ArrayList<>();
        System.out.println();


        try {
            File myObj = new File("C:\\Users\\Stephanie\\Projects\\Interview Prep\\src\\text");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                String data = myReader.nextLine();
                System.out.println(data);
                list.add(s.next());


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        System.out.println("List to string: ");

        System.out.println(list.toString());

//        List<String> list2 = new ArrayList<>();
//        for(int i = 0; i< list.size(); i++){
//
//            String[] test = list.get(i).split(" ");
//            System.out.println(Arrays.toString(test));
//
//        }


    }
}
