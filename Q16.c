#include <stdio.h>
#include <stdlib.h>

int max(int* arr, int arrSize){
    int max = arr[0];
    for(int i=1; i<arrSize; i++){
        if(arr[i] > max)
            max = arr[i];
    }
    return max;
}
int getWinner(int* arr, int arrSize, int k) {
    if(k >= arrSize){
        return max(arr, arrSize);
    }

    int winner, win_count=0, loser;
    if(arr[0] > arr[1])
        winner = arr[0];
    else
        winner = arr[1];

    for(int i=1 ; i<arrSize; i++){
        int new_winner;
        if(arr[0] > arr[1]){
            loser = arr[1];
            new_winner = arr[0];
            if(new_winner == winner){
                win_count++;
            }else{
                win_count = 0;
                win_count++;
            }
            int j = 1;
            while(j<arrSize){
                arr[j] = arr[j+1];
                j++;
            }arr[j] = loser;

            winner = new_winner;
        }else{
            loser = arr[0];
            new_winner = arr[1];
            if(new_winner == winner){
                win_count++;
            }else{
                win_count = 0;
                win_count++;
            }
            
            int j = 0;
            while(j<arrSize){
                arr[j] = arr[j+1];
                j++;
            }arr[j] = loser;

            winner = new_winner;
        }
    }
    return win_count;
}

int main(){
    int array[10] = {2,3,4,5,6,7,8,9,10,1};
    printf("%d",getWinner(array, 10, 2));

}