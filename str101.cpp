class Solution {
public:
    int titleToNumber(string columnTitle) {
        int result = 0;
        for(char c : columnTitle)
        {
            // Convert the letter to a number (A -> 1, B -> 2, ..., Z -> 26)
            int d = c - 'A' + 1;
            result = result * 26 + d;
        }
        return result;  
};
