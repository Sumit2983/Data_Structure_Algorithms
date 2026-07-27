#include<iostream>
#include<vector>
using namespace std;
void bubbleSort_ascending(vector<int>& arr){
    int n = arr.size();
    for(int i = 0; i < n-1; i++){
        for(int j = 0; j < n-i-1; j++){
            if(arr[j] > arr[j+1]){
                swap(arr[j], arr[j+1]);
            }
        }
    }
}
void bubbleSort_descending(vector<int>& arr){
    int n = arr.size();
    for(int i = 0; i < n-1; i++){
        for(int j = 0; j < n-i-1; j++){
            if(arr[j] < arr[j+1]){
                swap(arr[j], arr[j+1]);
            }
        }
    }
}

void selectionSort_ascending(vector<int>& arr){
    int n = arr.size();
    for(int i = 0; i < n-1; i++){
        int minIndex = i;
        for(int j = i+1; j < n; j++){
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
        swap(arr[i], arr[minIndex]);
    }
}
// i = How many largest elements have already reached their final correct positions.

// i = 0 → none are guaranteed yet.
// i = 1 → the largest element is fixed.
// i = 2 → the largest two elements are fixed.
// i = 3 → the largest three elements are fixed.

// This is the invariant.
// The meaning of the loops
// for(int i = 0; i < n-1; i++)

// Meaning:

// "Repeat until every largest remaining element has been placed."

// for(int j = 0; j < n-i-1; j++)

// Meaning:

// "Scan only the unsorted region and keep pushing the current largest to the end."
int main(){
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    return 0;
}