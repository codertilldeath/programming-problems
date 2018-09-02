"Edit distance" (also known as Levenshtein distance) measures the minimum the number of simple changes to move from one string to another. Possible changes include the insertion of a single character, the deletion of a single character, or the substitution from one character to another. Your program must calculate edit distance between pairs of strings.

# Input Format

A value N on a line by itself indicating the number of test cases. Each test case is presented on subsequent pairs of lines with a string on each line. Strings will consist of non-whitespace printable characters.

# Output Format

The edit distance of each test case should be output, one value per line.

**Sample Input**
```
1
ABCDE
ABDE
```
**Sample Output**
```
1
```
Explanation

To move from "ABCDE" to "ABDE", the 'C' must be deleted.