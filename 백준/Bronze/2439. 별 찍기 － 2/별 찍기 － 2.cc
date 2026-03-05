/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main(){
    int t,a,b;
    scanf("%d",&t);
    for(int i=1; i<=t; i++){
        for(int k=0; k<t-i; k++){
            printf(" ");
        }
        for(int k=0; k<i; k++){
            printf("*");
        }
        printf("\n");
    }
    
    return 0;
}