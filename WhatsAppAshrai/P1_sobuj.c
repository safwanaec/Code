#include<stdio.h>
void write();
void read();
int main()
{

    int terminal;
    printf("Please select your option: (1)write (2) read\n");
    scanf("%d",&terminal);
    switch(terminal)
    {
        case 1:
                printf("Hi! Sobuj, Be ready to write in your File......\n");
                write();

        case 2:
                read();
                break;
        default:
                printf("Value is not between 1-2");
                break;

    }
    return 0;



}
void write()
{

    FILE *fptr;

     fptr = fopen("test_exercise_1.txt", "w");
     char str1[1000];
     int n=1;
     while(n<=8)
     {
         fprintf(fptr, gets(str1));
          fprintf(fptr,"\n");
         n++;
     }
      fclose(fptr);

}
void read()
{

     FILE *fptr;
    fptr = fopen("test_exercise_1.txt", "r");



    char myString[1000];
    int m=1;
    while(m<=8)
     {
          fgets(myString, 1000, fptr);

            printf("%s\n", myString);


         m++;

     }


    fclose(fptr);

}
