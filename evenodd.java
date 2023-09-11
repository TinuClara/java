import java.io.*;
import java.util.Scanner;

public class evenodd{
    public static void main(String[] args) {
        // Specify the input and output file paths
        String input= "3.txt"; // Replace with your input file path
        String even = "even_numbers.txt"; // Output file for even numbers
        String odd = "odd_numbers.txt";   // Output file for odd numbers

        try {
            File inputfile = new File(input);
            Scanner scanner = new Scanner(inputfile);
            FileWriter evenWriter = new FileWriter(even);
            FileWriter oddWriter = new FileWriter(odd);

            while (scanner.hasNext()) 
			{
                int number = scanner.nextInt();
                if (number % 2 == 0) 
				{
                    evenWriter.write(number + "\n");
                } else 
				{
                    oddWriter.write(number + "\n");
                }
            }
            evenWriter.close();
            oddWriter.close();
            scanner.close();
            System.out.println("Odd and even numbers have been copied to separate files.");
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
    }
}





