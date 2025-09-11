public class BingoSong {
    public BingoSong() {
        String base = "BINGO";
        for (int i = 0; i <= base.length(); i++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < base.length(); k++) {
                    if (k < i) {
                        System.out.print("(clap)-");
                    } else {
                        System.out.print(base.charAt(k) + "-");
                    }
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }
}