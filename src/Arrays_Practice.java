import java.util.ArrayList;
import java.lang.Math;

public class Arrays_Practice {

    public static void sum() {
        //Declares an array list which could be added to
        ArrayList<Integer> myArray = new ArrayList<>();

        //Here you could add to array

        // Sum function which first determines if you've added anything to the dang array!
        if(myArray.size() > 0) {
            int sum = 0;
            for (int i = 0; i < myArray.size(); i++) {
                sum = sum + myArray.get(i);
            }
            System.out.println("Sum is: " + sum);
        } else {
            System.out.println("Ain't nothing in this array!");
        }
    }

    public static void toPower(int size, int power) {
        // Creates array of size "size"

        ArrayList<Integer> toPowerArray = new ArrayList<Integer>(size);
        for(int i = 0; i < size; i++){
            toPowerArray.add(i, (int) Math.pow(i, power));
        }
        System.out.println(toPowerArray);
    }

    public static void main(String[] args) {
        sum();
        toPower(3, 6);

    }
}
