public class EvenOdd {
public static void main(String[] args)
    {
        // Declaring and initializing integer variable
        int num = 10;
 
        // Checking if number is even or odd number
        // via remainder
        if (num % 2 == 0) {
 
            // If remainder is zero then this number is even
            System.out.println("Entered Number is Even");
        }
 
        else {
 
            // If remainder is not zero then this number is
            // odd
            System.out.println("Entered Number is Odd");
        }
    }
}

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
