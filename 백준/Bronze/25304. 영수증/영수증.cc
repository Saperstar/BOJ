/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main(){
    int sum, n, a, b, total;
    total = 0;
    scanf("%d",&sum);
    scanf("%d",&n);
    for(int i=0; i<n; i++){
        scanf("%d %d",&a,&b);
        total = total + (a * b);
    }
    if(sum==total){
        printf("Yes");
    }
    else{
        printf("No");
    }
    
    return 0;
}