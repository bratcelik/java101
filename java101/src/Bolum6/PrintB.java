package Bolum6;

public class PrintB {
    public static void main(String[] args) {
        char[][] letter = new char[7][4];

        for (int i = 0; i < letter.length; i++){
            for(int j = 0; j < letter[0].length; j++){
                letter[i][j] = ' ';
                if (i != 0 && i != letter.length-1){
                    if (i == 3){
                        letter[i][j] = '*';
                    }
                    else if (j == 0 || j == letter[0].length -1 ){
                        letter[i][j] = '*';
                    }
                }
                else if (j != letter[0].length - 1){
                    letter[i][j] = '*';
                }
            }
        }

        for (char[] x : letter){
            for (char y : x){
                System.out.printf("%c ",y);
            }
            System.out.printf("\n");
        }
    }
}
