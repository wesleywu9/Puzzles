/*2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?*/

//Naive: multiply 2 by 2 n-times, convert to char array, convert each char to int and add to "sum"

#include "useful_headers.h"

int naive_solution(int n) {
    int num = 1;
    for(int i=0; i<n; i++) {
        num <<= 1;
    }
    char buffer[BUFFER_LEN];
    snprintf(buffer, BUFFER_LEN, "%d", num);
    int numDigits = strlen(buffer);
    int sum = 0;
    for(int i=0; i<numDigits; i++) {
        sum += buffer[i] - '0';
    }
    return sum;
}

int main() {
    printf("naive_solution: %d\n", naive_solution(15));

}