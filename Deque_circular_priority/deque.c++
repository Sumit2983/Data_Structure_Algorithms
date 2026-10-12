// Online C++ compiler (editor)
// Write and run C++ online using this editor.

#include <iostream>
#include<queue>
#include<deque>
#include<bits/stdc++.h>
using namespace std;
class prioritize_hospital{
    public:
     int *arr;
     priority_queue<int> pq;
    int n = arr.size();
    void set_prioritywise(int *arr){
        for(int i =0;i<n;i++){
            pq.push_back(arr[i]);
        }
        
    }
    void display_by_priority(){
        
    }
    
};

int main() {
    // deque<int> dq;
    // dq.push_back(20);
    // dq.push_back(30);

    // cout<<dq.front()<<endl;
    // cout<<dq.back()<<endl;
    // dq.pop_front();
    // dq.pop_back();

    // dq.size();
    // dq.empty();





    
    // deque <char> dqs;
    // string s= "hello";
    // string ans = "";
    // for(int i =0;i<s.size();i++){
    //     dqs.push_back(s[i]);
    // }
    // while(!dqs.empty()){
        
    //     ans += dqs.back();
    //     dqs.pop_back();
     
    // }
    // cout<<ans;

    
    
    
    

    return 0;
}