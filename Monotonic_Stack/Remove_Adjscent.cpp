// Online C++ compiler (editor)
// Write and run C++ online using this editor.

#include <iostream>
#include<bits/stdc++.h>
using namespace std;
string remove_adjescent(string s){
    int n = s.length();
    string ans ="";
    stack<char> st;
    for(int i =0;i<n;i++){
        if(st.empty()){
            st.push(s[i]);
            continue;
        }
        if(s[i] == st.top()){
            st.pop();
            continue;
        }
        else{
            st.push(s[i]);
        }
        
        
    }
    while(!st.empty()){
        ans.push_back(st.top());
        st.pop();
    }
    reverse(ans.begin(),ans.end());
    return ans;
}
int main() {
    string s = "abbaca";
    
    cout<<remove_adjescent(s)<<endl;
    
   
    return 0;
}