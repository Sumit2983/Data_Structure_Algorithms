#include<iostream>
#include<bits/stdc++.h>
// time complexity :- n(log n);
// recursion implementiainon with base condidtion 
// devide and conquer approach (mergesort)





int mergesort(){

}

using namespace std;


int main(){

    return 0;
}


// class MergeSort {
//     static void mergeSort(int[] arr, int low, int high){
//         if(low>=high) return;
//         int mid = (low+high)/2;
//         mergeSort(arr, low, mid);
//         mergeSort(arr, mid+1, high);
//         merge(arr, low, mid, high);
//     }
//     static void merge(int[] arr, int low, int mid, int high){
//         int[] temp=new int[high-low+1];
//         int left = low, rigth = mid+1;
//         int k=0;
//         while(left<=mid && rigth <=high){
//            if(arr[left]<=arr[rigth]) temp[k++]=arr[left++];
//            else temp[k++]=arr[rigth++]; // store lowest number and right
//         }
//         while(left<=mid){
//             temp[k++]=arr[left++];
//         }
//         while(rigth<=high){
//             temp[k++]=arr[rigth++];
//         }
//         for(int i=low;i<=high;i++){
//             arr[i]=temp[i-low];
//         }
//     }
//     public static void main(String[] args){
//         int[] arr={10,4,6,1,11,3,2,8};
//         mergeSort(arr, 0, arr.length-1);
//         for(int num:arr){
//             System.out.print(num+" ");
//         }
//     }
// }