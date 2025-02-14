import java.util.Scanner;

public class Connect4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] name = new String[2];
        int option, temp = 0;
        int[] count = {0 , 0};
        Game game = new Game();
        
        System.out.println("---------------------------------------------------\n~*~*~*~*~*~*~*~*~*~*~Connect 4~*~*~*~*~*~*~*~*~*~*~\n---------------------------------------------------\n");
        
        System.out.println("\t\t    1) Start\n\t\t    2) Leaderboard\n\t\t    3) Exit");
        option = input.nextInt();
        
        if(option == 1)
        {
            System.out.print("Enter Player 1's Name : ");
            name[0] = input.next();
            System.out.print("Enter Player 2's Name : ");
            name[1] = input.next();
            
            while(temp <= 35)
            {
                game.printGame();
                System.out.print("Player " +game.currentPlayer +" Enter Your Move(1 - 7) : ");
                int col = input.nextInt();
                
                if(col < 1 || col > 7)
                {
                    System.out.println("\nInvalid Move!");
                }
                
                else
                {
                    game.Move(col - 1);
                    
                    if(game.checkWin())
                    {
                        game.printGame();
                        
                        int tem = Character.getNumericValue(game.currentPlayer);
                        System.out.println(name[tem - 1] +" Wins!");
                        
                        count[tem - 11]++;
                        
                        break;
                    }
                    game.switchPlayer();
                }
                temp++;
            }    
        }
        else if(option == 2)
        {
            
        }
        else if(option == 3)
        {
            
        }
        else
        {
            
        }
    }
}
