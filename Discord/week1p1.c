#include<stdio.h>
int main(){
    //Variables
    int ID;
    int hrs;
    int salary;

    int EmployeLST[]={2001, 2002, 3001, 3002, 4001, 4002, 5001, 5002, 6001, 7002, 8001, 8002};
    //Input


    printf("Input the Employees ID(Max. 10 chars): ");
    scanf("%d",&ID);

    for(int i = 0; i<12; i++)
    {
        if(ID==EmployeLST[i])
        {
            break;
        }
        else if(i==11)
        {
            printf("Employe not found!");
            return 404;
        }
    }

    printf("Input the working hrs: ");
    scanf("%i",&hrs);

    printf("Salary amount/hr: ");
    scanf("%i",&salary);


    //Output
    printf("\n\nEmployees ID = %ld\n",ID);

    printf("Salary = U$ %.2f",(float)salary*hrs);

    return 0;

}