#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void pblm1fancy(int array[], int arraysize);
void pblm1(int array[], int arraysize);
void pblm2(int array[], int arraylength);
void pblm3(int start, int finish);
void pblm4(int array[], int arraylength);
void pblm5(int array[], int arraylength);

int main(){
    int sample[] = {1,2,3,4,5,6,7,8,9,10};
    int length = sizeof(sample)/sizeof(sample[0]);
    //pblm1(sample,length);
    //pblm2(sample,length);
    //pblm3(12, 23);
    //pblm4(sample,length);
    pblm5(sample, length);
    
    return 0;
}

void pblm1fancy(int array[], int arraysize){
    //int arraysize = sizeof(array) / sizeof(array[0]);
    printf("\n\n\n\n\n");
    printf("\033[4A");
    int down,up,spacing;
    for(int i = 0; i<arraysize; i++){
        down = 2;
        down = array[arraysize-i-1]>999 ? down+3 :  (array[arraysize-i-1]>99 ? down+2 :  (down = array[arraysize-i-1]>9 ? down+1 :  down));
        up = 2;
        up = array[i]>999 ? up+3 :  (array[i]>99 ? up+2 :  (up = array[i]>9 ? up+1 :  up));
        spacing = down>up ? down : up;
        printf("%d,\033[s\033[2B",array[i]); 
        if(i==0){
            printf("\r");
        }
        printf("\033[%dD%d,\033[u",spacing,array[arraysize-i-1]);
    }

    printf("\033[3B");
}

void pblm1(int array[], int arraysize){
    //int arraysize = sizeof(array) / sizeof(array[0]);
    printf("\n");
    int down,up,spacing;
    for(int i = 0; i<arraysize; i++){

        printf("%d ",array[i]); 
    }
    printf("\n");
    for(int i = 0; i<arraysize; i++){

        printf("%d ",array[arraysize-i-1]);
    }
}

void pblm2(int array[], int arraylength){
    int odd = 0, even = 0;

    for(int i = 0; i<arraylength; i++){

        if(array[i]%2==0){
            even++;
        }
        else odd++;
    }

    printf("\n%d odd numbers",odd);
    printf("\n%d even numbers\n\n",even);
}

void pblm3(int start, int finish){
    printf("\nStarting value: %d",start);
    printf("\nEnding value: %d\n",finish);

    if(start%2==0){
        start++;
    }

    while(start<=finish){
        printf("%d ",start);
        start+=2;
    }
}

void pblm4(int array[], int arraylength){
    int newarray [100],x=0;
    newarray[0]=300;
    newarray[4]=200;

    printf("\n\nGiven array: ");
    for(int i = 0; i<arraylength; i++,x++){

        if(x==0){
            newarray[x]=300;
            x++;
        }
        else if(x==4+1){
            newarray[x]=200;
            x++;
        }

        newarray[x]=array[i];

        if(i==arraylength-1){
            newarray[arraylength+2]=100;
        }

        printf("%d ", array[i]);
        
    }
    printf("\nOutput array after addition: ");
    for(int i = 0; i<arraylength+3; i++){
        printf("%d ",newarray[i]);
    }
}

void pblm5(int array[], int arraylength)
{
    int newArrayLength = arraylength - 3;
    if (arraylength < 7)
    {
        newArrayLength++;
    }

    int newArray[newArrayLength], x = 0;

    for (int i = 1; i < arraylength - 1; i++)
    {
        newArray[x] = array[i];
        if (i == 5)
        {
            continue;
        }
        x++;
    }
    printf("\nGiven Array: ");
    for (int i = 0; i < arraylength; i++)
    {
        printf("%d ", array[i]);
    }
    printf("\nOutput Array: ");
    for (int i = 0; i < newArrayLength; i++)
    {
        printf("%d ", newArray[i]);
    }
}