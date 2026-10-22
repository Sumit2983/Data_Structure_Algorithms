#include<iostream>
#include<stack>
#include <vector>
#include<string>
using namespace std;
// as stack uses LIFO so if we pop then we get items in reversed order
// reverse using stack
string revert( string s){
    int n = s.length();
    string ans ="";
    stack<char> st ;
    for(int i =0;i<n;i++){
        st.push(s[i]);
        

    }
    while(!st.empty()){
        ans.push_back(st.top());
        st.pop();
    }
    return ans;

}
// 1047 delete both adjscent element

int main(){
    string s = "jayant";
    cout<<revert(s);
    

    return 0;
}