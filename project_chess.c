#include<stdio.h>

void chess_board_print(int board_value[][9],int chess_piece[]);
void board_initialization(int board_value[][9],int chess_piece[]);
void input_processor(int *x, int *y);
void clearLines(int numLines);

int main()
{
    int Board_Value[9][9]={0};                                          //<<creates addresses for each cell of the board where
    /*{}*/                                                      //values could be stored and puts the value 0 to all addresses

    int Chess_Piece[12]={1,2,3,4,5,6,7,8,9,10,11,12};                   //<<chess piece values for each indevidual type of chess piece

    board_initialization(Board_Value,Chess_Piece);                              //<<initializes the board to new state

    chess_board_print(Board_Value,Chess_Piece);                                       //<<updates and prints the chess board

    int a,b;                                                    //<<stores the input cell address in (x,y) format
    input_processor(&a,&b);                                     //<<takes and processes the inputed cell address in the board
    printf("%d %d",a,b);

    return 0;
}


void chess_board_print(int board_value[][9],int chess_piece[])
{
    void colorizer(int i,int j,char c[]);

    printf("\n\t  |");
    for(int j=1; j<=8; j++)
    {
        int i = 8;
        colorizer(i,j," ");
    }
    printf("\n");

    for(int i=8; i>0; i--)                                      //<<Determines Row
    {
        printf("\t%d |",i);                                     //<<prints the row number of the board

        for(int j=1; j<=8; j++)                                 //<<Determines Column item in each row
        {
            switch(board_value[i][j])
            {
                case 1:
                    colorizer(i,j,"\033[31m\033[1mP");
                    break;
                case 2:
                    colorizer(i,j,"\033[31m\033[1mR");
                    break;
                case 3:
                    colorizer(i,j,"\033[31m\033[1mH");
                    break;
                case 4:
                    colorizer(i,j,"\033[31m\033[1mB");
                    break;
                case 5:
                    colorizer(i,j,"\033[31m\033[1mQ");
                    break;
                case 6:
                    colorizer(i,j,"\033[31m\033[1mK");
                    break;
                case 7:
                    colorizer(i,j,"\033[34m\033[1mP");
                    break;
                case 8:
                    colorizer(i,j,"\033[34m\033[1mR");
                    break;
                case 9:
                    colorizer(i,j,"\033[34m\033[1mH");
                    break;
                case 10:
                    colorizer(i,j,"\033[34m\033[1mB");
                    break;
                case 11:
                    colorizer(i,j,"\033[34m\033[1mQ");
                    break;
                case 12:
                    colorizer(i,j,"\033[34m\033[1mK");
                    break;
                default:
                    colorizer(i,j," ");
            } 


            if(i>1 && j==8)
            {
                printf("\n\t  |");
                for(int l=1; l<=8; l++)
                {
                    colorizer(i,l," ");
                }
                printf("\n\t  |");
                for(int l=1; l<=8; l++)
                {
                    int k = i-1;
                    colorizer(k,l," ");
                }
                printf("\n");
            }
        }       
    }

    printf("\n\t  |");
    for(int j=1; j<=8; j++)
    {
        int i = 1;
        colorizer(i,j," ");
    }
    
    printf("\n\t   ");

    for(int i=0; i<=55; i++)                                    //<<patterning
    {
        printf("-");
    }
    printf("\n\t     ");

    for(int i=0; i<8; i++)                                      //<<prints the Column tocken on the bottom of the board
    {
        printf(" %c     ",65+i);
    }

    printf("\n\n");

}

void board_initialization(int board_value[][9],int chess_piece[])
{
    for(int i=1; i<=8; i++)                                     //<<This function initializes the Board to a New game 
    {                                                           //format. essentially preparing the board for a new game
        for(int j=1; j<=8; j++)
        {
            if(i==7)
            {
                board_value[i][j]=chess_piece[0];
            }
            else if(i==8 && (j==1||j==8))
            {
                board_value[i][j]=chess_piece[1];
            }
            else if(i==8 && (j==2||j==7))
            {
                board_value[i][j]=chess_piece[2];
            }
            else if(i==8 && (j==3||j==6))
            {
                board_value[i][j]=chess_piece[3];
            }
            else if(i==8 && j==4)
            {
                board_value[i][j]=chess_piece[4];
            }
            else if(i==8 && j==5)
            {
                board_value[i][j]=chess_piece[5];
            }
            else if(i==2)
            {
                board_value[i][j]=chess_piece[6];
            }
            else if(i==1 && (j==1||j==8))
            {
                board_value[i][j]=chess_piece[7];
            }
            else if(i==1 && (j==2||j==7))
            {
                board_value[i][j]=chess_piece[8];
            }
            else if(i==1 && (j==3||j==6))
            {
                board_value[i][j]=chess_piece[9];
            }
            else if(i==1 && j==4)
            {
                board_value[i][j]=chess_piece[10];
            }
            else if(i==1 && j==5)
            {
                board_value[i][j]=chess_piece[11];
            }
        }
    }
}

void input_processor(int *x, int *y)                            //<<thiis function takes two addresses and takes
{                                                               //input from the user on chosing a cell on the board
    char a[3];                                                  //it then aranges the inpu in a manner i
    int temp,i;
    do
    {
        a[2]='\0';
        i=0;
        printf("\n\nChoose a chess piece(Example-'D2') :");     
        scanf("%s",a);
        temp = a[0];
        *x = temp;
        temp = a[1];
        *y = temp;

        if((*x>48 && *x<57) && (*y>64 && *y<73 || *y>96 && *y<105))
        {
            temp = a[1];
            *x = temp;
            temp = a[0];
            *y = temp;
        }
        if(a[2]!='\0'||(*x>64 && *x<73 && (*y>64 && *y<73 || *y>96 && *y<105)) || (*x>96 && *x<105 && (*y>96 && *y<105 || *y>64 && *y<73)) || (*x>48 && *x<57 && *y>48 && *y<57))
        {
            clearLines(5);
            printf("\n\n\033[1mWrong Input!\033[0m");
            i++;
        }
        else if(*x>64 && *x<73)
        {
            *x = *x-64;
        }
        else if(*x>96 && *x<105)
        {
            *x = *x-96;
        }
        else
        {
            if(i==0)
            {
                clearLines(5);
                printf("\n\n\033[1mWrong Input!\033[0m");
                i++;
            }
        }

        if(*y>48 && *y<57)
        {
            *y = *y-48;
        }
        else
        {
            if(i==0)
            {
                clearLines(5);
                printf("\n\n\033[1mWrong Input!\033[0m");
                i++;
            }
            
        }
    }
    while(i>0);
}

void clearLines(int numLines) {
    for (int i = 0; i < numLines; i++) {
        printf("\033[A");  // Move cursor up one line
        printf("\033[K");  // Clear the line
    }
}
void colorizer(int i,int j,char c[])
{

    if(i%2==0)                                      
    {                                               
        if(j%2==0)                                  
        {                                           
            printf("\033[30m   %s   \033[0m",c);        
        }                                           
        else                                        
        {
            printf("\033[47m   %s   \033[0m",c);
        }
    }
    else
    {
        if(j%2==0)
        {
            printf("\033[47m   %s   \033[0m",c);
        }
        else
        {
            printf("\033[30m   %s   \033[0m",c);
        }
    }

}

void output(int i, int j, char op[2]) {
    char j_c = 'A' + j - 1;  // Convert j to character 'A' to 'F'
    op[0] = j_c;
    op[1] = (char)(i + '0'); // Convert i to character '0' to '9'
}


void red_pawn_processor(int board_value[][9],int i,int j)
{
    char op_str[4][2];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 1; j++) 
        {
            op_str[i][j] = '\0';
        }
    }

    if(board_value[i-1][j]==0)
    {
        output(i-1,j,op_str[0]);
        if(i==7)
        {
            output(i-2,j,op_str[1]);
        }
    }
    if(board_value[i-1][j+1]!=0 && j<9 && j>0)
    {
        output(i-2,j,op_str[2]);
    }
    if(board_value[i-1][j-1]!=0 && j<9 && j>0)
    {
        output(i-2,j,op_str[3]);
    }
    for(int a=0; a<=3; a++)
    {
        if(op_str[a]!="'\0'")
        {
            printf("%s ",op_str[a]);
        }
    }
}