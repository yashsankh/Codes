#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>



//Create Rock, Paper & Scissors Game
// Player 1: rock
// Player 2 (computer): scissors -->player 1 gets 1 point

// rock vs scissors - rock wins
// paper vs scissors - scissors wins
// paper vs rock - paper wins
// Write a C program to allow user to play this game three times with computer. Log the scores of computer and the player. Display the name of the winner at the end
// Notes: You have to display name of the player during the game. Take users name as an input from the user.
//notes: we can use static,automatic,extern,register variables......

int generateRandomNumber()
{
    srand(time(NULL)); //srand takes seed as an input and is defined inside stdlib.h
    return rand() % 3;
}


int main()
{   
    int x=generateRandomNumber();
    printf("\n*************Welcome to stone paper scissior game*************\n\n");
    printf("Enter your name:\n");
    int s;
    char arr[s];
    scanf("%s",arr);
    printf("\n\n");

    int j;
    printf("Enter the no of points limit to win the game\n");
    scanf("%d",&j);
    printf("\n\n");

   
    printf("Instruction:-\n1.)Enter 0 for paper \n2.)Enter 1 for scissor \n3.)Enter 2 for rock \n\n");
    
    int computer=0;//Note : we can use static variable if we declare variables in loop.
    int player=0;//Note : we can use static variable if we declare variables in loop.

    printf("Hii.. %s\nI am computer . \nLets start the game i am ready !!\n\n",arr);

    while(player<=(j-1) && computer<=(j-1))
    {
        int y;
        printf("Enter which figure you choosed from game\n");
        scanf("%d",&y);
        if(y==0 && x==2 && y<3){

           player++;
           printf("Computer choose %d \n%s choose %d\n",x,arr,y);
           printf("%s wins %d point\n",arr,player);
           
           
        }
        else if(y>x && y<3){
            player++;
            printf("Computer choose %d \n%s choose %d\n",x,arr,y);
            printf("%s wins %d point\n",arr,player);
        }
        else if(y==x && y<3){
            printf("Computer choose %d \n%s choose %d\n",x,arr,y);
            printf("%s no point scored both are same\n",arr);
            
        }
        else if(y==2 && x==0 && y<3){
            computer++;
            printf("Computer choose %d \n%s choose %d\n",x,arr,y);
            printf("Computer wins %d point\n",computer);
            
        }
        else if(y<x){
            computer++;
            printf("Computer choose %d \n%s choose %d",x,arr,y);
            printf("Computer wins %d point\n",computer);
            
        }
        else
        {
            printf("Enter valid number %s",arr);
        }
        printf("\n\n");
    }
    if(player==3){
        printf("Congradulation %s you won the game !!!",arr);
    }
    else
    {
        printf("Hard luck next time %s you lose computer won the game\nComputer : Aeee! i won the game");
    }
    
    return 0;
}