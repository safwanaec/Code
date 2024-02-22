#include <stdio.h>
int main(){
    FILE *ptr;
    char fileName[] = "test_excercise_1.txt";
    int button=0;
    while(button != 3){
        ptr = fopen(fileName,"a+");
        printf("\n\n\t\t\tChoose an option for file \"%s\"\n\n\n1. write on file\n\n2. read existing file\n\n3. EXIT\n> ",fileName);
        scanf("%i",&button);
        getchar();
        if (button == 1){
            char charA = '\0';
            printf("\nWrite: ");
            while ((charA) != '\n'){
                charA = getchar();
                fputc(charA, ptr);
            }
            fseek(ptr, 0, SEEK_END); 
            printf("\nFile saved\n");
        }
        else if(button == 2){
            printf("\nFile Contents: ");
            fseek(ptr, 0, SEEK_SET);
            while(feof(ptr)==0){
                printf("%c",(char)fgetc(ptr));
            }
        }
        else if (button != 3){
            printf("\nWrong input!\n\n");
            fclose(ptr);
        }
    }

}