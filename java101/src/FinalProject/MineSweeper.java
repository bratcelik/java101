package FinalProject;

import java.util.Scanner;

public class MineSweeper { // Minesweeper Game Class
    int[][] field; // answer key
    boolean[][] player; // player's choices
    int row, col; // field's
    int minesCount; // total mines
    int points; // 1 point for each unlocked zone

    MineSweeper(){
        // get game info and create game
        getTable();
        minesCount = (row * col)/4;
        points = 0;
        this.field = new int[row][col];
        fillMines();
        player = new boolean[row][col];
    }

    public void run(){
        boolean isFinish = false;

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        while (!isFinish && this.points < (row*col - minesCount)){
            toPrint();
            isFinish = getMove();
            this.points++;
            System.out.println("===================================");
        }
        result();
    }

    private void result(){
        if (this.points == (row*col - minesCount))
            System.out.println("TEBRİKLER OYUNU KAZANDIN!");
        else
            System.out.println("BAMM!\nBAMMM!\nBAMMMM!\nOYUNU KAYBETTİN!");
        System.out.println("Toplam Açtığın Mayınsız Alan : " + (this.points-1) +"\nOYUN ALANI:");
        print();
    }

    private boolean getMove(){
        int row,col;

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("\nSatır Giriniz : ");
            row = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            col = input.nextInt();

            if((row > 0 && col > 0) && (row <= this.row && col <= this.col))
                break;
            else
                System.out.println("Hatalı giriş tekrar deneyiniz!");
        }
        if(!this.player[row-1][col-1]){
            if (this.field[row-1][col-1] == -1){
                return true;
            }
            this.player[row-1][col-1] = true;
        }

        return false;

    }



    public void toPrint(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++){
                System.out.print(((this.player[i][j]) ? this.field[i][j] : "-") + "  ");
            }
            System.out.println();
        }
    }

    public void print(){
        for (int[] x : this.field){
            for (int y: x){
                System.out.print(((y == -1) ? "*" : y) + "   ");
            }
            System.out.println();
        }
    }

    private void fillAround(int x, int y){
        for (int i = -1; i < 2; i++){
            for (int j = -1; j < 2; j++){
                try {
                    if (this.field[x + i][j + y] != -1){
                        this.field[x + i][j + y]++;
                    }
                }catch (Exception e){}
            }
        }
        this.field[x][y] = -1;
    }

    private void fillMines(){
        int count = 0;
        while (count < minesCount){
            int mineLocX = (int)(Math.random() * row);
            int mineLocY = (int)(Math.random() * col);

            if (this.field[mineLocX][mineLocY] != -1){
                this.field[mineLocX][mineLocY] = -1;
                fillAround(mineLocX,mineLocY);
                count++;
            }
        }
    }

    private void getTable(){
        int row,col;

        while (true){
            System.out.println("Satır ve Sütun sayıları pozitif ve en az 2 olmalıdır.");
            Scanner input = new Scanner(System.in);
            System.out.print("Satır Giriniz : ");
            row = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            col = input.nextInt();

            if(row > 1 || col > 1)
                break;
            else
                System.out.println("Hatalı giriş tekrar deneyiniz!");
        }

        this.row = row;
        this.col = col;
    }

}
