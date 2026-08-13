// #include<iostream>
// using namespace std;
// int factorial(int n){
//     if(n==0 || n==1){
//         return 1;
//     }
//     return n*factorial(n-1);
// }
 
// int main(){
//     cout << "Hello, World!" << endl;
//     int n;
//     cout << "Enter a number to find its factorial: ";
//     cin>>n;
//     cout << "Factorial of " << n << " is: " << factorial(n) << endl;
//     return 0;
// }
// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int power_calculate(int n, int pow){
    int sum =1;
    while( pow > 0){
        sum = sum *n;
        pow--;
    }
    return sum ;
    
}
int main() {
    int n = 5;
    int pow = 2;
    cout<<power_calculate(n,pow);

    return 0;
}