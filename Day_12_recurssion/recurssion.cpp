#include<iostream>
using namespace std;
int ficonache(int n){
    if(n==0 || n==1){
        return n;
    }
    int sum = ficonache(n-1) + ficonache(n-2);
    return sum;
}



int main(){
    cout<<ficonache(1);
    return 0;
}