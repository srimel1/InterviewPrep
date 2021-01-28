import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        populate(list, 10);
        Arrays.toString(list.toArray());
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("Collections reverse: ");

        Collections.reverse(list);
        System.out.println(list);

//
//        List<Object> reversed = reverse(list);
//        System.out.println(reversed);

        System.out.println(rever(list));
        Collections.reverse(list);


//        System.out.println(Collections.reverse(list));


        List<String> strList = new ArrayList<>();
        strList.add("hi");
        strList.add("my");
        strList.add("name");
        strList.add("is");
        strList.add("ste");
        strList.add("ri");

        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList);
        Collections.reverse(strList);
        System.out.println(strList);
        
        List<String> strlist = new ArrayList<>();
        for (int i = 0; i < strlist.size(); i++) {
            
            
        }

        String test = "Hi my name is stephanie and i want to know what th emost prequent character is";
        mostFreq(test);
        System.out.println("Most frequent character: "+mostFreq(test));








    }

    private static List<Object> populate(List<Object> list, int size) {
        Random rand = new Random(10);
        for (int i = 0; i < size; i++) {
            int j = rand.nextInt(10);
            list.add(j);
        }
        return list;
    }


    //    public static List<Object> reverse(List<Object> list) {
    public static List<Object> reverse(List<Object> list) {
        List<Object> reversed = new ArrayList<>();
        for (int i = 0; i < list.size()-1; i++) {

            for (int j = list.size()-1; j > 0; j--) {
                System.out.print("j: " + j + ", ");

                reversed.add(i, list.get(j));

            }
        }
        return reversed;
    }

    public static void rev(int a[]) {
        int b[] = new int[a.length];
        int n = b.length;
        int j = n;
        System.out.println(j);
        for (int i = 0; i < a.length; i++) {
            System.out.println("b[j-1]: "+b[j-1]);
            b[j - 1] = a[1];
            j--;
        }
    }

    public static List<Object> rever(List<Object> list) {
        List<Object> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static char[] mostFreq(String str){
        int temp = 0;
        int count = 0;
        int current = 0;

        char[] max = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                char ch1 = str.charAt(j);

                if (ch != ch1) {
                    count++;
                }
            }
            if (count > temp) {
                temp = count;
                max[current] = ch;
            }
        }
        return max;

    }

    public static int freq(int arr[]){
        Arrays.sort(arr);
        int max = 0, count = 0, winner = 0, temp = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                if (count > winner) {
                    winner = count;
                    temp = arr[i - 1];


                }
            }
        }



        return max;

    }
}






