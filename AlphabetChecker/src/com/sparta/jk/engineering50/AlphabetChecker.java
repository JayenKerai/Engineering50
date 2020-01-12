package com.sparta.jk.engineering50;
/*
- Returns true if constructor parameter contains one of each letter.
- Uses regex to confirm a match for each character is found.
 */
public class AlphabetChecker {
    String str;
    String regex = "(?=.*a)(?=.*b)(?=.*c)(?=.*d)(?=.*e)(?=.*f)(?=.*g)(?=.*h)(?=.*i)(?=.*j)(?=.*k)(?=.*l)(?=.*m)(?=.*n)(?=.*o)(?=.*p)(?=.*q)(?=.*r)(?=.*s)(?=.*t)(?=.*u)(?=.*v)(?=.*w)(?=.*x)(?=.*y)(?=.*z).*";
    public AlphabetChecker(String str) {
        this.str = str.toLowerCase();
    }

    public boolean hasAlphabet(){
        return str.matches(regex);
    }
}