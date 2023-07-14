public class Main {
    public static void main(String[] args) {

        int [] arr = new int[5];

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
        System.out.println();

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
