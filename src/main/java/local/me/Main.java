package local.me;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var chatService = new ChatService();

        var scanner = new Scanner(System.in);

        System.out.println("Hey!");

        while (scanner.hasNextLine()) {
            var command = scanner.nextLine();

            if (command.equals("exit")) {
                return ;
            }

            System.out.println(chatService.answer(command));
        }

        System.out.println("Bye-bye!");
    }
}