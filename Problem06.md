### Problem 6. Remove Methods

You are maintaining a project that has `n` methods numbered from `0` to `n-1`.

You are given two integers `n` and `k`, and a 2D integer array `invocations`,
where `invocations[i] = [a[i], b[i]]` indicates that method `a[i]` invokes method `b[i]`.

There is a known bug in method `k`. Method `k`, along with any method invoked by it, either **directly** or **indirectly**,
are considered **suspicious**, and we aim to remove them.

A group of methods can only be removed if no method **outside** the group invokes any methods **within** it.

Return an array containing all the _remaining methods_ after removing all the **suspicious** methods. You may return the answer in _any order_.
If it is not possible to remove **all** the suspicious methods, **none** should be removed.

Write your solution in [src/Problem06.java](src/Problem06.java)

<details>
<summary> Hint 1</summary>
Use DFS from node k.
</details>

<details>
<summary> Hint 2</summary>
Mark all the nodes visited from node k, and then check if they can be visited from the other nodes.
</details>


#### Example 1:

```
Input: n = 4, k = 1, invocations = [[1,2],[0,1],[3,2]]
Output: [0,1,2,3]
Explanation:
```
<img width="300" height="300" alt="image" src="https://github.com/user-attachments/assets/6564056c-2926-49a4-8f5b-b32b36771ff1" />

```
Method 2 and method 1 are suspicious, but they are directly invoked by methods 3 and 0,
which are not suspicious. We return all elements without removing anything.
```

#### Example 2:

```
Input: n = 5, k = 0, invocations = [[1,2],[0,2],[0,1],[3,4]]
Output: [3,4]
Explanation:
```
<img width="300" height="300" alt="image" src="https://github.com/user-attachments/assets/38b516b8-f404-458d-bbb5-8cfd60ee073e" />

```
Methods 0, 1, and 2 are suspicious and they are not directly invoked by any other method.
We can remove them.
```

#### Example 3:
```
Input: n = 3, k = 2, invocations = [[1,2],[0,1],[2,0]]
Output: []
Explanation:
```
<img width="300" height="300" alt="image" src="https://github.com/user-attachments/assets/6e2568cb-a0a0-4ec4-b838-847fe182973e" />

```
All methods are suspicious. We can remove them.
```

#### Constraints

+ `1 <= n <= 100000`
+ `0 <= k <= n-1`
+ `0 <= invocations.length <= 2 * 100000`
+ `invocations[i] == [a[i], b[i]]`
+ `0 <= a[i], b[i] <= n-1`
+ `a[i] != b[i]`
+ `invocations[i] != invocations[j]`
