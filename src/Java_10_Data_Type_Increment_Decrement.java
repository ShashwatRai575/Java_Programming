public class Java_10_Data_Type_Increment_Decrement {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(a);
        System.out.println(b);

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        //int j = 67;
        //int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int u = 7;
        System.out.println( ++u *8);
        char ch = 'a';
        System.out.println(++ch);
    }
}
