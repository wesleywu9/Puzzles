#include <stdio.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* indices = (int*) calloc(2, sizeof(int)*2);
    for(int i=0; i<numsSize; i++) {
        for(int j=i+1; j<numsSize; j++) {
            if(nums[i]+nums[j]==target) {
                indices[0] = i; 
                indices[1] = j;
                return indices;
            }
        }
    }
    return indices;
}
