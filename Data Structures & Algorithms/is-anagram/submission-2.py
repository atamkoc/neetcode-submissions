class Solution:
    def string_to_occ_dict(self, s:str) -> dict :
        s_dict = {}
        for char in s:
            if char in list(s_dict.keys()):
                s_dict[char] = s_dict.get(char) + 1
            else:
                s_dict[char] = 1
        
        return s_dict

    def isAnagram(self, s: str, t: str) -> bool:
        s_dict = self.string_to_occ_dict(s)
        t_dict = self.string_to_occ_dict(t)

        return s_dict == t_dict
    



    

        