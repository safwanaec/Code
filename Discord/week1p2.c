#include<stdio.h>
int main()
{
    long days=0;
    int WW=0,YY=0;
    printf("Number of days : ");
    scanf("%ld",&days);

    if(days>=365)
    {
        YY = days/365;
        days -= 365*YY;
        printf("\nYears: %d\n",YY);
    }
    if(days>=7)
    {
        WW = days/7;
        days -= 7*WW;
        printf("\nWeeks: %d\n",WW);
    }
    if(days !=0 )
    {
        printf("\nDays: %d\n",days);
    }
    printf("\n");
}