#include <stdio.h>
#include <string.h>
int main()
{
    char name[100] = {'\0'};
    int value = 0;
    scanf("%s", name);
    char n2[100] = {'\0'};

    for(int i=0; i<strlen(name); i++){
        for(int j=0; j<=i; j++){
            if(name[i]==n2[j]){
                break;
            }
            else if(j==i && name[i]!=n2[j]){
                n2[j]=name[i];
                value++;
            }
        }
    }

    if (value % 2 == 0) printf("CHAT WITH HER!");
    
    else printf("IGNORE HIM!");


    return 0;
}
