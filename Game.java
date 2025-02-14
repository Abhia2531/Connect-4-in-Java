public class Game
{
    char[][] board = new char[6][7];
    char currentPlayer;
    
    public Game()
    {
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0 ; j < 7; j++)
            {
                board[i][j] = ' ';
            }
        }
        this.currentPlayer = '1';
    }    
    public void printGame()
    {
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                System.out.print(" | " +board[i][j]);
            }
            System.out.println(" |");
            System.out.println("-------------------------------");
        }
        System.out.println("   1   2   3   4   5   6   7");
    }
    
    public void switchPlayer()
    {
        if(this.currentPlayer == '1')
        {
            this.currentPlayer = '2';
        }
        else
        {
            this.currentPlayer = '1';
        }
    }
    
    public void Move(int col)
    {
        for(int i = 5; i >= 0; i--)
        {
            if(this.board[i][col] == ' ')
            {
                this.board[i][col] = currentPlayer;
                break;
            }
        }
    }    
    public boolean checkWin()
    {
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(board[i][j] != ' ' && board[i][j] == board[i][j + 1] && board[i][j] == board[i][j + 2] && board[i][j] == board[i][j + 3])
                {
                    return true;
                }
            }
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(board[i][j] != ' ' && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 2][j] && board[i][j] == board[i + 3][j])
                {
                    return true;
                }
            }
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(board[i][j] != ' ' && board [i][j] == board[i + 1][j + 1] && board [i][j] == board[i + 2][j + 2] && board [i][j] == board[i + 3][j + 3])
                {
                    return true;
                }    
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 3; j < 7; j++)
            {
                if(board[i][j] != ' ' && board [i][j] == board[i + 1][j - 1] && board [i][j] == board[i + 2][j - 2] && board [i][j] == board[i + 3][j - 3])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
