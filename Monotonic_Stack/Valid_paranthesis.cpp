// Online C++ compiler (editor)
// Write and run C++ online using this editor.

#include <iostream>
#include<bits/stdc++.h>
using namespace std;
bool Valid_paranthesis(string s){
    stack<char> st;
    int n = s.length();
    for(int i =0;i<n;i++){
        if(st.empty()){
            st.push(s[i]);
            continue;
        }
        if(s[i] == ')' && char(st.top() +1) == s[i] ){
            st.pop();
            continue;
        }
        if((s[i] == '}' || s[i] == ']') && char(st.top() +2) ==  s[i]){
            st.pop();
        }
        else{
            st.push(s[i]);
        }
    }
    if(st.empty()){
        return true;
    }
    return false;
    
}

int main() {
    string s1 = "{({}{}[{}])}";
    string s2 = "[}{]";    
    cout<<Valid_paranthesis(s1)<<endl;
    cout<<Valid_paranthesis(s2)<<endl;
    
   
    return 0;
}