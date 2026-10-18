// Online C++ compiler (editor)
// Write and run C++ online using this editor.

#include <iostream>
#include<bits/stdc++.h>
using namespace std;
vector<int> prev_grater(vector<int> nums){
    // in question it says that print prev greater element at index i and if no such grater element print -1 for that index
    vector<int> ans;
    stack<int> st;
    int n = nums.size();
    ans.push_back(-1);
    st.push(nums[0]);
    for(int i =1;i<n;i++){
        while(!st.empty()){
                if(st.top() > nums[i]){
            ans.push_back(st.top());
            st.push(nums[i]);
            break;
        }
        else{
            st.pop();
            
        }
            }
        
        if(st.empty()){
            ans.push_back(-1);
            st.push(nums[i]);
            
        }

        
    }   
    return ans;
    
}

int main() {
    vector<int> arr;
    arr.push_back(4);
    arr.push_back(1);
    arr.push_back(2);
    arr.push_back(5);
    arr.push_back(3);
    vector<int> ans = prev_grater(arr);
    int n = ans.size();
    cout<<"[";
    for(int i =0;i<n-1;i++){
        cout<<ans[i]<<", ";
    }
    cout<<ans[n-1]<<"]";
 
    
   
    return 0;
}