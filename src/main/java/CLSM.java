import java.util.Arrays;

public class CLSM {
    public static void main(String[] args) {

//        int arr [] = {12,2,3,12,23};
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr,5));
//
//        char arr[] = new char[4];
//        arr[0] = 'A';
//        arr[2] = 'E';
//        arr[3] = 'M';
//        System.out.println(Arrays.toString(arr));
//

//        int arr1[] = {1, 2, 3};
//        int arr2[] = {1, 2, 3};
//        //Asagıdak!lerden hang!ler! ekrana true yazdırır?
//        System.out.println(arr1==arr2);
//         System.out.println(arr1==arr1);
//        System.out.println(Arrays.equals(arr1, arr2));
//        System.out.println(arr1.equals(arr2));
//


        int[][] x = {{2, 1}, {1, 7, 1}};
        System.out.println(m(x[1]));
    }

        public static int m(int[] m){

            int result = 0;

            for (int i = 0; i < m.length ; i++){

                result += m[i];

            }
            return result;


        }







    }

