import java.util.*;

public class ArrayListManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;

            String[] parts = line.split(" ");
            String cmd = parts[0];

            try {
                switch (cmd) {
                    case "insert":
                        list.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(list);
                        break;

                    case "delete":
                        list.remove((int) Integer.parseInt(parts[1]));
                        System.out.println(list);
                        break;

                    case "update":
                        list.set(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(list);
                        break;

                    case "sum":
                        int from = Integer.parseInt(parts[1]);
                        int to = Integer.parseInt(parts[2]);
                        int sum = 0;
                        for (int i = from; i <= to; i++) sum += list.get(i);
                        System.out.println(sum);
                        break;

                    default:
                        System.out.println("Invalid command");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
