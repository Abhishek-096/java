#include <stdio.h>
#include <math.h>
void swap(int *a,int*b){
    int t=*a;
    *a=*b;
    *b=t;

    printf("a = %d & b = %d",*a,*b);
}
void printAddress(int n){
    printf("%p\n",&n);
}

int main()
{
    // int number=4,number1=5;;
    // swap(&number,&number1);
    // printf("\nnumber is = %d & number1 is %d",number,number1);
    // int n=4;
    // printf("%p\n",&n);
    // printAddress(&n);

    int num,num1,num2;
    
    printf("Enter the num\n");
    scanf("%d",&num);
    printf("Enter the num1\n");
    scanf("%d",&num1);
    printf("Enter the num1\n");
    scanf("%d",&num2);
    if(num>num1 && num>num2){
        printf(num);
    }else if (num1>num2){
        printf(num1);
    }   else{
        printf(num2);
    }
    return 0;
}
