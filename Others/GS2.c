#include<stdio.h>
int main()
{
    int n;
    printf("how many numbers do you want to enter?\n");
    scanf("%d",&n);
    int num[n];
    int sum = 0, mult=1;
    for(int i=0; i<n; i++){
        printf("Enter the num%d: \n",i+1);
        scanf("%d",&num[i]);
    }
    for(int i=0; i<n; i++){
        if(num[i]%2==0){
            sum =sum+num[i];
        }
        else{
            mult=mult*num[i];
        }
    }
    printf("\n");


    printf("The sum is: %d\n",sum);
    printf("The mult is: %d\n",mult);


    return 0;
}
