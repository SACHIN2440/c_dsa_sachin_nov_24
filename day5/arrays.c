 #include <stdio.h>
 int main(){
    int num,temp,digit, flag[10] = {0};
    int result = 0, place = 1;
    printf("Enter a number:");
    scanf("%d",&num);
    temp = num;
    while (temp > 0) {
        digit = temp % 10;
        temp /= 10;
        if (flag[digit] == 0) {
            falg[digit]= 1;
            result += digit * place;
            place * = 10;
        }
    }
    printf("Number after removing duplicate: %dn", result);
    return 0;
 }