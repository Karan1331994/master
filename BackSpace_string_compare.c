/*
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".

*/


/*
Ideas:

--- Deletes character at position 4 -----
    str.erase(str.begin() + 4);
	
	Before erase : Hello World!
	After erase : Hell World!

	The idea is to move backwards from last in a string and delete both # and character after it while moving backwards.
	
*/



#include <iostream>
#include <string>
using namespace std;

    
   
string findOriginal(string S)
{
		int i,k=0;
        for(i=S.length()-1;i>=0;i--)
        {
            if((i)>=0 &&S[i]=='#')  //bound-checking and required condition
            {
                k++;  //to count no. of hashes
                S.erase(S.begin()+i);
                int j=i;

                if((j-1)>=0 && S[j-1]!='#') //bound-checking and required condition
                {
                    while(k!=0&&j!=0)
                    {
                    if((j-1)>=0 && S[j-1]=='#') //bound-checking and required condition
                    break;
                    S.erase(S.begin()+(--j));
                    k--;
                    }
                    continue;
                }
                else
                {
                    continue;
                }
                
            }
        }
        return S;
}

bool backspaceCompare(string S, string T) {
        
        string s=findOriginal(S);
        string t=findOriginal(T);
        if(s==t)
        return true;
        else
        return false;
    }

int main()
{
    bool val=backspaceCompare("a##c","#a#c");
    cout<<"answer is: "<<val<<endl;
    return 0;
}
