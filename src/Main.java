public class Main {
    public static void main(String[] args) {
        int array[] = {4,-3,-5,9,1,11};
        int smaller[] = new int [array.length];
        int larger[] = new int [array.length];
        int m = 1;
        int i=0;

        while (i<array.length) {
            if (array[i] < m)
                smaller[i] = array[i];
            else if (array[i] > m)
                larger[i] = array[i];
            i++;
        }

        System.out.print("smaller: ");

        for (int n = 0; n<smaller.length;n++) {
            if (smaller[n] != 0)
                System.out.print(smaller[n] + " ");
        }

        System.out.println("");
        System.out.print("larger: ");

        for (int t = 0; t<smaller.length;t++) {
            if (larger[t] != 0)
            System.out.print(larger[t] + " ");
        }
    }
}