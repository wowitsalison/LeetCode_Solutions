class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        pal = True
        string = []
        
        for i in s:
            if i.isalnum():
                string.append(i.lower())

        for j in range(len(string)):
            if string[j] != string[len(string)-j-1]:
                pal = False

        return pal
