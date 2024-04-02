package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int [] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 100 - i;
            System.out.println(numbers[i]);
        }

        int sum = 0;
        long multyply = 1L;
        for (int i = 0; i != numbers.length; i++) {
            if(numbers[i]%2==0)
                sum += numbers[i];
            else
                multyply*=numbers[i];
        }
        System.out.println(sum);
        System.out.println(multyply);

        int [] copyNumbers = new int[numbers.length];
        for (int i = 0; i < copyNumbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
    }
}
