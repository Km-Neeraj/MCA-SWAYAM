#include<stdio.h>
#include<conio.h>
int main()
{
    char text[20]="Hello";
    printf("%d\n",sizeof(text));
    printf("%d\n",strlen(text));
    printf("%d\n",sizeof("Hello"));
    return 0;
}