#include<stdio.h>

int square(int); 

void main()
{
     int number, answer;
    
     scanf("%d", &number);
    
     answer = square(number); 
    
     printf("%d",answer);
}

int square(int n)
{
    
     return(n*n); 
}