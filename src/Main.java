public class Main {
    public static void main(String[] args) {


        /*String s1 = new String("BitCode");
        String name = "Vishal";

        name = "Vishal Jagtap";
        System.out.println("name = " + name);

        String nameCopy = "Vishal Jagtap";
        System.out.println("name copy = " + nameCopy);

        System.out.println(name == nameCopy);

        String details = name + "BitCode";

        String str1 = name.substring(0, 4);
        System.out.println("str1 = " + str1);*/


        //5
        /*int [][] marks = new int [][] {
                {11, 22, 33, 44}, {33, 44, 55, 66}, {55, 66, 56, 78}
        };

        for(int i = 0; i < marks.length; i++) { //i 2
            int sum = 0;
            for(int j = 0; j < marks[i].length; j++) { //j
                sum = sum + marks[i][j];
            }
            System.out.println("sum of " + i + " student = " + sum);
        }*/


        //4
        //int [][] arr = new int[3][2];
        //System.out.println("arr.length = " + arr.length + " arr[0].length = " + arr[0].length);

        /*int[][] arr = new int[4][];
        arr[0] = new int[]{56, 67, 89};
        arr[1] = new int[]{83, 92};
        arr[2] = new int[]{44, 89, 62, 69};
        arr[3] = new int[]{74, 71};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/


        //3
        /*int [] arr = new int[] {11, 22, 33, 44};
        int [] arr1 = {10, 20, 30, 40, 50}; // allowed only at the time of declaration
        arr1 = new int[] {100, 200, 300};*/

        //2
        /*int [] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();*/

        //1
        /*float f = 3.14f;
        int i;
        //i = f; //why error: possible loss of data
        i = (int)f; //use explicit type casting

        i = 20;
        f = i; //no possible loss of data

        int k = 10;
        k++; //java is robust*/
    }
}
