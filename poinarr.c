#include<stdio.h>
#include<conio.h>
main()
{ //using pointer how we can "traverse" an array
int a[5];
int i;
int *p;
clrscr();
p=&a[1];//a[0]=*p
//p=&a[1]==p+1 are same
printf("please enter 5 values\n");
for(i=0;i<5;i++)
{	scanf("%d",a+i);	}//can also use a+i insted of p+i //using pointer &a[i]=p+i for for loop
printf("\n address==%u\taddress==%u",a+1,p);//p+1=&a[1] and bit size increases by some bits as per data type
for(i=0;i<5;i++)//when you write name of array this will give you "base address"(address of first element) of array
{	printf("\n%d \t",*(a+i));} //we can also use a insted of p //using pointer  a[i]=*(p+i) for for loop
getch();
return 0;
}
