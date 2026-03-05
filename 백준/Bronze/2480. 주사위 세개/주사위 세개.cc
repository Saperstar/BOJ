/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int a,b,c,total;
    scanf("%d %d %d",&a,&b,&c);
    if(a==b && b==c){
        total = 10000 + a * 1000;
    }
    else if(a==b){
        total = 1000 + a * 100;
    }
    else if(b==c){
        total = 1000 + b * 100;
    }
    else if(c==a){
        total = 1000 + c * 100;
    }
    else{
        if(a>b && a>c){
            total = a * 100;
        }
        if(b>a && b>c){
            total = b * 100;
        }
        if(c>a && c>b){
            total = c * 100;
        }
    }
    printf("%d",total);
    return 0;
}