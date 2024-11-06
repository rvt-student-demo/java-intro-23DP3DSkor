package lv.rvt;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
public class App 
{
    public static void main( String[] args )
    {
        // String name = "Dominik";
        // int age = 17;
        // System.out.println(age);
        // System.out.println(name);


    //     String userName = "Dominik";
    //     int userAge = 17;
    //     Boolean userPassword = true;

    //     Scanner scanner = new Scanner(System.in);
    //     String name = scanner.nextLine();
    //     System.out.println(name);

            
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ievadi savu vardi");
        // String name = scanner.nextLine();
        // System.out.println("Ievadi savu uzvards");
        // String lastName = scanner.nextLine();
        // System.out.println("Ievadi savu grupu");
        // String group = scanner.nextLine();
        // System.out.println(name + lastName + group);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ievadiet pirmo skaitli: ");
        // int number1 = Integer.valueOf(scanner.nextLine());
        // System.out.println("Ievadiet otro skaitli: ");
        // int number2 = Integer.valueOf(scanner.nextLine());
        // int summa = number1 + number2;
        // int starp = number1 - number2;
        // int reiz = number1 * number2;
        // double videj = (number1 + number2) / 2;

        // System.out.println(number1 + " + " + number2 + " = " + summa);
        // System.out.println(number1 + " - " + number2 + " = " + starp);
        // System.out.println(number1 + " * " +  number2 + "=" + reiz);
        // System.out.println("(" + number1 + "+" +number2 + ") / 2 = " + videj);


        // System.out.println("four: " + 4);
        // int first = 3;
        // int second = 2;
        // double result = first / second;
        // System.out.println(result);

        //         System.out.println("Hello, world!");
        //         if (true) {
        //             System.out.println("This code is unavoidable!");
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give speed: ");
        // int speed = Integer.valueOf(scanner.nextLine());
        // if ( speed > 120){
        //     System.out.println("Speeding ticket!");
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give points [0-100]: ");
        // int point = Integer.valueOf(scanner.nextLine());
        // if (point < 0){
        //     System.out.println("Grade: impossible!");
        // }
        // else if (point < 49){
        //     System.out.println("Grade: failed");
        // }
        // else if (point < 59){
        //     System.out.println("Grade: 1");
        // }
        // else if (point < 69){
        //     System.out.println("Grade: 2");
        // }
        // else if (point < 79){
        //     System.out.println("Grade: 3");
        // }
        // else if (point < 89){
        //     System.out.println("Grade: 4");
        // }
        // else if (point <= 100){
        //     System.out.println("Grade: 5");
        // }
        // else{
        //     System.out.println("Grade: incredible!");
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Value of the gift?");
        // int value = Integer.valueOf(scanner.nextLine());
        // if (value >= 5000 && value <= 25000) {
        //     System.out.println("Tax: " + (100 + (value-5000) * 0.08));
        // }
        // else if (value < 5000){
        //     System.out.println("No tax!");
        // }
        // else if (value >= 25000 && value <= 55000) {
        //     System.out.println("Tax: " + (1700 + (value-25000) * 0.10));
        // }
        // else if (value >= 55000 && value <= 200000) {
        //     System.out.println("Tax: " + (4700 + (value-55000) * 0.12));
        // }
        // else if (value >= 200000 && value <= 1000000) {
        //     System.out.println("Tax: " + (22100 + (value-200000) * 0.15));
        // }
        // else{
        //     System.out.println("Tax: " + (142100 + (value-1000000) * 0.17));
        // }
        // Scanner scanner = new Scanner(System.in);
        // int result = 0;
        // int summa = 0;
        // while (true) {
        //     System.out.println("Give a number: ");
        //     int number = Integer.valueOf(scanner.nextLine());
        //     if (number == 0) {
        //         break;

        //     }
    
        //     if (number > 0) {
        //         result = result + 1;
        //         summa = summa + number;
        //         continue;
        //     }
        //     else{
        //         continue;
        //     }
        // }
        // System.out.println("Number of numbers: " + result);
        // System.out.println("Sum of the numbers: " + summa);


        // for (int x = 10; x < 100;  x += 10){
        //     System.out.println(x);
        // }
        // PART 1, 2, 3, 4, 5
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give a number: ");
        // int summa = 0;
        // int result = 0;
        // int odd = 0;
        // int even = 0;
        // while(true){
        //     int number = Integer.valueOf(scanner.nextLine());
        //     if (number == -1) {
        //         System.out.println("Thx! Bye!");
        //         System.out.println("Sum of the numbers: " + summa);
        //         System.out.println("Numbers: " + result);
        //         System.out.println("Average: " + (double)summa/result);
        //         System.err.println("Even: " + even);
        //         System.out.println("Odd: " + odd);
        //         break;
        //     }
        //     summa = summa + number;
        //     result = result + 1;
        //     if(number % 2 == 0){
        //         even++;
        //     }
        //     else{
        //         odd++;
        //     }
        // }
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("How many times?: ");
        // String word = String.valueOf(scanner.nextLine());
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Write beginning number, please: ");
    //     int beg = Integer.valueOf(scanner.nextLine());
    //     System.out.println("Write end number, please: ");
    //     int ends = Integer.valueOf(scanner.nextLine());

    //     divisibleByThreeInRange(beg, ends);
    // }


    // public static void divisibleByThreeInRange(int beginning, int end){
    //         while(beginning <= end){
    //             if(beginning % 3 == 0){
    //             System.out.println(beginning);
    //             }
    //         beginning++;
    //         }
        // Stars.printStars(4);

        // System.out.println();

        // Stars.printSqure(4);

        // System.out.println();

        // Stars.printRectangle(17, 3);

        // System.out.println();

        // Stars.printTriangle(4);


        // ArrayList<String> wordlist = new ArrayList<>();
        // wordlist.add("First");
        // wordlist.add("Second");
        // wordlist.add("Third");
        // System.out.println(wordlist.get(1));

        // Scanner scanner = new Scanner(System.in);
        // ArrayList<String> wordList = new ArrayList<>();
        // int count = 0;
        // while(count < 4){
        //     System.out.println("Enter name: ");
        //     String input = scanner.nextLine();
        //     wordList.add(input);
        //     count++;
        // }
        // System.out.println("Third element: "+ wordList.get(2));

        // Scanner scanner = new Scanner(System.in);
        // ArrayList<Integer> number = new ArrayList<>();
        // while(true){
        //     System.out.println("Enter number: ");
        //     Integer input = Integer.valueOf(scanner.nextLine());
        //     number.add(input);
        //     if(input == 0){
        //         break;
        //     }
        // }
        // int sum = number.get(1) + number.get(2);
        // System.out.println("Second and Third element sum: "+ sum);

        // Scanner scanner = new Scanner(System.in);
        // ArrayList<String> names = new ArrayList<>();
        // while(true){
        //     System.out.println("Enter name: ");
        //     String input = scanner.nextLine();
        //     names.add(input);
        //     if(input.isEmpty()){
        //         break;
        //     }
        // }
        // int value = names.size();
        // int value1 = value - 1;
        // System.out.println("Total names: " + value1);

        // Scanner scanner = new Scanner(System.in);
        // ArrayList<Integer> numbers = new ArrayList<>();
        // while(true){
        //     System.out.println("Enter numbers: ");
        //     int input = Integer.valueOf(scanner.nextLine());
        //     if(input == -1){
        //         break;
        //     }
        //     numbers.add(input);
        // }
        // System.out.println("Enter first index: ");
        // int firstIndex = Integer.valueOf(scanner.nextLine());
        // System.out.println("Enter second index: ");
        // int secondIndex = Integer.valueOf(scanner.nextLine());
        // System.out.println("Diapozone: ");
        // for (int i = firstIndex; i <= secondIndex; i++){
        //     System.out.println(numbers.get(i));
        // }

    //     ArrayList<Integer> numbers = new ArrayList<>();
    //     numbers.add(3);
    //     numbers.add(2);
    //     numbers.add(6);
    //     numbers.add(-1);
    //     numbers.add(5);
    //     numbers.add(1);

    //     System.out.println("The numbers in the range [0, 5]");
    //     printNumbersInRange(numbers, 0, 5);

    //     System.out.println("The numbers in the range [3, 10]");
    //     printNumbersInRange(numbers, 3, 10);

    // }
    // public static void printNumbersInRange(ArrayList<Integer> numbers, int lower, int upper) {
    //     for (int number : numbers) {
    //         if (number >= lower && number <= upper){
    //             System.out.println(number);
    //         }
    //     }
    // Random random = new Random();
    // int[]arrayNumber = new int[10];
    // for(int i = 0; i < arrayNumber.length; i++){
    //     arrayNumber[i] = random.nextInt(10);
    // }
    // int min = arrayNumber[0];
    // int max = arrayNumber[0];
    // int sum = 0;
    // for(int num : arrayNumber){
    //     if(num < min){
    //         min = num;
    //     }
    //     if(num > max){
    //         max = num;
    //     }
    //     sum += num;
    // }
    // double average = (double) sum/arrayNumber.length;
    // for (int num : arrayNumber){
    //     System.out.println(num);
    // }
    // System.out.println("Max number of massiv: " + max);
    // System.out.println("Min number of massiv: " + min);
    // System.out.println("Average of massiv: " + average);

    // int a[] = {1, 4, 5, 8, 0, 2, 7, 3, 6, 9};
    // int length = 10;
    // for(int i = 0; i < length; i++);{
    //     for(int j = 0; j < length - 1; j++ ){
    //         if(a[j] > a[j +1]){
    //             int temp = a[j];
    //             a[j] = a[j + 1];
    //             a[j + 1] = temp;
    //         }
    //     }
    // }
    // System.out.println();

    // Scanner scanner = new Scanner(System.in);
    // ArrayList<String> names = new ArrayList<>();
    // ArrayList<Integer> birthyears = new ArrayList<>();
    // while (true){
    //     System.out.println("Enter your name and birthday: ");
    //     String input = scanner.nextLine();
    //     if(input.isEmpty()){
    //         break;
    //     }
    //     String[] parts = input.split(",");
    //     String name = parts[0].trim();
    //     int birthyear = Integer.parseInt(parts[1]);

    //     names.add(name);
    //     birthyears.add(birthyear);

    // }
    // String longestName = "";
    // for (String name : names){
    //     if(name.length() > longestName.length()){
    //         longestName = name;
    //     }
    // }
    // int sum = 0;
    // for (int year : birthyears){
    //     sum += year;
    // }
    // double averageBirthYear = (double)sum / birthyears.size();
    // System.out.println("longest name: " + longestName);
    // System.out.println("Average birth year: " + averageBirthYear);

}
    public class Account{
        private double balance;
        private String owner;
        public Account(String owner, double balance){
            this.balance = balance;
            this.owner = owner;
        }
        public void deposit(double amount){
            this.balance = this.balance + amount;
        }
        public void withdraw(double amount){
            this.balance = this.balance - amount;
        }
        public double balance(){
            return this.balance;
        }
        @Override
        public String toString(){
            return this.owner + "balance: " + this.balance; 
        }
}
}

