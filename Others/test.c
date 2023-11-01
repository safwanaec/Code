#include<stdio.h>

int main(){

    char outputString[4][2]={{'1','2'},{'\0','d'},{'a','b'},{'\0','0'}};
    for(int a=0; a<4; a++)
    {
        if(outputString[a][0]!='\0')
        {
            for(int b=0; b<2; b++){
                printf("%c",outputString[a][b]);
            }
            printf(" ");
        }
    }


    return 0;
}