public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи №1,2,3");
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum = 0;
        int max = 0;
        int min = 200_001;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[i];
            System.out.println(arr[i]);
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        double sum1=sum;
        double average = sum1/30;
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма трат за день составила "+max+" рублей");
        System.out.println("Средняя сумма трат за месяц составила "+average+" рублей");
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1; i>=0;i=i-1){
            System.out.print(reverseFullName[i]);
        }
    }
}