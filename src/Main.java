import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nameString;
        final int Const=6;
        String word =" Java";
        nameString=Const+word;
        System.out.println(nameString);

        if (Const<0){
            System.out.println("вы сохранили нуль!");
        }
        if (Const>0){
            System.out.println("вы сохрпанили положительное число!");
        }
        else {
            System.out.println("вы сохранили нуль");
        }

        System.out.println();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Пожалуйста введите ваше имя:  ");
        String name = scanner.nextLine();
        System.out.print("здравстуйте "+name);












        // иногда мне  кажется что компилятор игнорирует все мои коментарии:(
    }
}