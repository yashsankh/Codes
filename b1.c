#include <stdio.h>
#include <string.h>
#include <stdlib.h>
char *replace(const char * str,const char * oldword,const char * newword);

int main()
{
    FILE * y=NULL;
    y=fopen("bill.txt","r");
    char *newstr;
    char str[200];
    fgets(str,200,y);
    printf("%s",str);
    newstr=replace(str,"{{item}}","fan");
    newstr=replace(newstr,"{{name}}","bajaj");
    newstr=replace(newstr,"{{outlet}}","bajaj fans");
    y=fopen("bill.txt","w");
    printf("%s",newstr);
    fprintf(y,"%s",newstr);
    fclose(y);



    return 0;
}

char *replace(const char * str,const char * oldword,const char * newword){

    char *newstring;
    int i,p=0;
    int a=strlen(newword);
    int b=strlen(oldword);

    for ( i = 0; str[i] != '\0'; i++)
    {
        if (strstr(&str[i],oldword)==&str[i])
        {
            p++;
            i=i+b-1;
        }
        
    }
    newstring=(char * )malloc(i + p * (a-b)+1);
    i=0;
    while (*str)
    {
        if(strstr(str,oldword)==str)
        {
            strcpy(&newstring[i],newword);
            i=i+a;
            str=str+b;
        }
        else{
            newstring[i] = *str;
            i=i+1;
            str=str+1;
        }
    }
    newstring[i]='\0';
    return newstring;

    
}