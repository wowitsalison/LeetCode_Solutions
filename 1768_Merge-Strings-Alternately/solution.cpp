class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        std::string merged = "";
        int length = 0;
        bool len1long = true;
        if(word1.length() > word2.length()) {
            length = word2.length();
        } else {
            length = word1.length();
            len1long = false;
        }

        for (int i = 0; i < length; i++) {
            merged += word1.at(i);
            merged += word2.at(i);
        }

        if (word1.length() > word2.length()){
            for(int i = length; i < word1.length(); i++)
                merged += word1.at(i);
            
        }else {
            for(int i = length; i < word2.length(); i++)
                merged += word2.at(i);
        }
        return merged;
    }
};
