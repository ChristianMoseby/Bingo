package com.arkansascodingacademy;

public class Card
{
    private Square square[][] = new Square[5][5];

    public Card()
    {

        square[0][0] = new Square(6);
        square[0][1] = new Square(28);
        square[0][2] = new Square(37);
        square[0][3] = new Square(51);
        square[0][4] = new Square(65);

        square[1][0] = new Square(10);
        square[1][1] = new Square(26);
        square[1][2] = new Square(44);
        square[1][3] = new Square(50);
        square[1][4] = new Square(69);

        square[2][0] = new Square(4);
        square[2][1] = new Square(24);
        square[2][2] = new Square(0);
        square[2][2].cover();
        square[2][3] = new Square(57);
        square[2][4] = new Square(64);

        square[3][0] = new Square(12);
        square[3][1] = new Square(30);
        square[3][2] = new Square(42);
        square[3][3] = new Square(58);
        square[3][4] = new Square(73);

        square[4][0] = new Square(9);
        square[4][1] = new Square(29);
        square[4][2] = new Square(36);
        square[4][3] = new Square(46);
        square[4][4] = new Square(67);

    }

    public void print()
    {
        for (int row = 0; row < 5; row++)
        {
            for (int column = 0; column < 5; column++)
            {
                square[row][column].print();
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public void play(int number)
    {
        for (int row = 0; row < 5; row++)
        {
            for (int column = 0; column < 5; column++)
            {
                if (square[row][column].getNumber() == number)
                {
                    square[row][column].cover();
                }
            }
        }
    }

    public boolean bingo()
    {
        boolean bingo = false;

        for (int row = 0; row < 5; row++)
        {

                if  (square [row] [0].isCovered() &&
                     square [row] [1].isCovered() &&
                     square [row] [2].isCovered() &&
                     square [row] [3].isCovered() &&
                     square [row] [4].isCovered())
                {
                    bingo = true;
                }
            for (int column = 0; column <5; column++)
            {
                if (square [column] [0].isCovered() &&
                    square [column] [1].isCovered() &&
                    square [column] [2].isCovered() &&
                    square [column] [3].isCovered() &&
                    square [column] [4].isCovered())
                {
                    bingo =true;
                }
            }


        }


        return bingo;
    }


        public static void main(String[] args)
        {
            Card card = new Card();
            card.print();

        }

    }





