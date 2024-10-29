import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to
//        2 Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10

//        int [] number={50, -20, 0, 30, 40, 60, 10};
//        boolean areEqual = (number[0] == number[4]);
//        System.out.println(areEqual);
//        }}

//        ***************************************************************************

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.
//                Original Array:
//[1, 4, 17, 7, 25, 3, 100]


//        ArrayList<Integer> numbers=new ArrayList();
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(17);
//        numbers.add(7);
//        numbers.add(25);
//        numbers.add(3);
//        numbers.add(100);
//        double sum = 0;
//        for (int i : numbers)
//         sum += i;
//        double average = sum / numbers.size();
//        System.out.println("The average of the said array is: " + average);
//        System.out.print("greater than the avrage ");
//        for (int num : numbers) {
//            if (num > average) {
//                System.out.print( num +"  " );
//            }}}}


//********************************************************************************


//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.
//        Original Array:
//[20, 30, 40]


 // int bigest=0;
 //    int[]a={20,30,40};
 //            for(int num:a){
 //                if (num>bigest){
 //                    bigest=num;}}
 //        System.out.println(bigest);
 //                }
 //            }
// *****************************************************************************


//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.
//                Original Array:
//           [20, 30, 40]

//    ArrayList<Integer> num=new ArrayList();
//    num.add(20);
//    num.add(30);
//    num.add(40);
//   int arry = num.get(0);
//   num.set(0, num.get(num.size() - 1));
//    num.set(num.size() - 1, arry);
//    System.out.println("new element after swap" + num);}}

//********************************************************************************

//        5. Write a program that places the odd elements of an array before the
//        even elements.
//        Original Array:
//[2,3,40,1,5,9,4,10,7]

//        int[] arraynumbers = {2, 3, 40, 1, 5, 9, 4, 10, 7};
//        ArrayList<Integer> oddnumber=new ArrayList();
//        ArrayList<Integer> evennumber=new ArrayList();
//        for (int num : arraynumbers) {
//        if (num % 2 != 0) {
//        oddnumber.add(num);
//        } else {
//            evennumber.add(num);
//        }}
//        oddnumber.addAll(evennumber);
//        System.out.println(oddnumber);}}

//    **************************************************************************

//    6. Write a program that test the equality of two arrays.
//        [2,3,6,6,4] [2,3,6,6,4]
//
// int[]a={2,3,6,6,4};
//     int[]b={2,3,6,6,4};
//     boolean areeq=true;
//     if (a.length!=b.length){
//         areeq=false;}
//     int i=0;
//     if (a[i]!=b[i]){
//         areeq=false;
//         }
//         System.out.println(areeq);
//     }
//     }

