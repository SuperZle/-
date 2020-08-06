#### 方法：回溯


回溯是一种通过穷举所有可能情况来找到所有解的算法。如果一个候选解最后被发现并不是可行解，回溯算法会舍弃它，并在前面的一些步骤做出一些修改，并重新尝试找到可行解。

给出如下回溯函数 `backtrack(combination, next_digits)` ，它将一个目前已经产生的组合 `combination` 和接下来准备要输入的数字 `next_digits` 作为参数。

如果没有更多的数字需要被输入，那意味着当前的组合已经产生好了。
如果还有数字需要被输入：
遍历下一个数字所对应的所有映射的字母。
将当前的字母添加到组合最后，也就是 combination = combination + letter 。
重复这个过程，输入剩下的数字： `backtrack(combination + letter, next_digits[1:])` 。


  [image.png](https://pic.leetcode-cn.com/4856f48edf74fcaba438314bfe414b81f7560fa7379ea8c82b7cf1d27c7af480-image.png)  [image.png](https://pic.leetcode-cn.com/1cfdbd018b1d29c265628795779ae18d3efdb89220c4803dfa8b1a5dc3242d04-image.png)  [image.png](https://pic.leetcode-cn.com/cd67950472f3128998a65d5bb96efd98c670a50cbdcd85e7d850bfc613c03a5c-image.png)  [image.png](https://pic.leetcode-cn.com/ab4fa695549364de9ba40601c0956163314037f0ff7b7ea3918e5432e9cb378f-image.png)  [image.png](https://pic.leetcode-cn.com/e01cc10b4970ee3d2299f99c874f03b41c7e9203c7781b03448f1f894d3bdfc6-image.png)  [image.png](https://pic.leetcode-cn.com/b0b74564b7d01a7c34b10f41977b377541a8d8baaf60c34d4f9945668901a930-image.png)  [image.png](https://pic.leetcode-cn.com/b0d013fb4cb7e526de5893231bba3a633bf5bee774071d0fb360a2705c0a4d35-image.png)  [image.png](https://pic.leetcode-cn.com/9358ab827574d26bc23e2ee47d59dcf1c6de0dd4c312f4606a41c258cb81a540-image.png)  [image.png](https://pic.leetcode-cn.com/3dea52518e3888a5b2540ae6fefcd9e518e89e8a7d19712d9fbc5bbf89b7a001-image.png)  [image.png](https://pic.leetcode-cn.com/e5dc8a7c378af223948226a14b693ca80028b034a806eb497ef10678edb89e0a-image.png)  [image.png](https://pic.leetcode-cn.com/e73abb8e6cc6b90818b3f1c3d192c5579e3750ab7a6f6f5f5f37e338cb6873c9-image.png)  [image.png](https://pic.leetcode-cn.com/746d8eeb529919d5a00a35739291cec9a686636398337aa5eaeb53dff9bc1e8e-image.png)  [image.png](https://pic.leetcode-cn.com/05f9788e5c9b149eea038551bcdf4121f560555069b34a44dee8bf32794a2298-image.png)  [image.png](https://pic.leetcode-cn.com/0ac574ab37f620221e702f57d6c4ffd0ba246abe41c43f9fc9637ab8f3365377-image.png) 

```Java []
class Solution {
  Map<String, String> phone = new HashMap<String, String>() {{
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
  }};

  List<String> output = new ArrayList<String>();

  public void backtrack(String combination, String next_digits) {
    // if there is no more digits to check
    if (next_digits.length() == 0) {
      // the combination is done
      output.add(combination);
    }
    // if there are still digits to check
    else {
      // iterate over all letters which map 
      // the next available digit
      String digit = next_digits.substring(0, 1);
      String letters = phone.get(digit);
      for (int i = 0; i < letters.length(); i++) {
        String letter = phone.get(digit).substring(i, i + 1);
        // append the current letter to the combination
        // and proceed to the next digits
        backtrack(combination + letter, next_digits.substring(1));
      }
    }
  }

  public List<String> letterCombinations(String digits) {
    if (digits.length() != 0)
      backtrack("", digits);
    return output;
  }
}
```

```Python []
class Solution:
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        phone = {'2': ['a', 'b', 'c'],
                 '3': ['d', 'e', 'f'],
                 '4': ['g', 'h', 'i'],
                 '5': ['j', 'k', 'l'],
                 '6': ['m', 'n', 'o'],
                 '7': ['p', 'q', 'r', 's'],
                 '8': ['t', 'u', 'v'],
                 '9': ['w', 'x', 'y', 'z']}
                
        def backtrack(combination, next_digits):
            # if there is no more digits to check
            if len(next_digits) == 0:
                # the combination is done
                output.append(combination)
            # if there are still digits to check
            else:
                # iterate over all letters which map 
                # the next available digit
                for letter in phone[next_digits[0]]:
                    # append the current letter to the combination
                    # and proceed to the next digits
                    backtrack(combination + letter, next_digits[1:])
                    
        output = []
        if digits:
            backtrack("", digits)
        return output
```

**复杂度分析**

* 时间复杂度： ![O(3^N\times4^M) ](./p__O_3^N_times_4^M__.png)  ，其中 N 是输入数字中对应 3 个字母的数目（比方说 2，3，4，5，6，8）， M 是输入数字中对应 4 个字母的数目（比方说 7，9），N+M 是输入数字的总数。

* 空间复杂度：![O(3^N\times4^M) ](./p__O_3^N_times_4^M__.png)  ，这是因为需要保存 ![3^N\times4^M ](./p__3^N_times_4^M_.png)  个结果。