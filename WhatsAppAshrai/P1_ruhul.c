#include <stdio.h>
#include <string.h>
void write()
{
    FILE *file;
    char name[100];
    int length = strlen(name);
    int i;
    file = fopen("text_excerise_1.txt", "a");
    if (file == NULL)
    {
        printf("File dosen't exist\n");
    }
    printf("File is open........\n");
    printf("Enter text to write: \n");
    scanf("%s", &name);
    fprintf(file, "%s", name);
    printf("File saved successfully.\n");
    fclose(file);
}
void read()
{
    FILE *file;
    char name[100];
    file = fopen("text_excerise_1.txt", "r");
    if (file == NULL)
    {
        printf("File is not exist.\n");
    }
    else
    {
        printf("File is open.........\n");
        printf("File read start.........\n");
        while (fgets(name, sizeof(name), file))
        {
            printf("%s", name);
        }
        fclose(file); // should be "fclose(file);" instead of "fclose(name);"
    }
}
int main()
{
    int select;
    printf("Select any one.....\n");
    printf("1. For write.\n");
    printf("2. For read.\n3. Exit.\n");
    scanf("%d", &select);
    switch (select)
    {
    case 1:
        write();
        break;
    case 2:
        read();
        break;
    case 3:
        printf("Exiting.......");
        break;
    default:
        printf("Wrong input. Please select between 1, 2, 3");
        break;
    }
    //getch();
}