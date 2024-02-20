package EEN;

public class Chick {

        private String name = "Fluffy";

        {
            System.out.println("setting field"); // 1
        }

        public Chick() {
            name = "Tiny";
            System.out.println("setting constructor"); // 2
        }

        public static void main(String[] args) {
            Chick chick = new Chick();
            System.out.println(chick.name);  // 3 name - Tiny
        }
    }



